/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.modelo.GloEstadoArea;
import pe.edu.upeu.servicio.EstadoAreaServicioInterface;


/**
 *
 * @author USERS
 */
@Controller
public class EstadoAreaController {
    @Autowired
    EstadoAreaServicioInterface EstadoAreaServicio;

   
    @RequestMapping(value = "estadoarea", method = RequestMethod.GET)   
public ModelAndView inicioEstadoArea(){
    List<GloEstadoArea> lista=EstadoAreaServicio.listarEstadoArea();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaEstadoArea", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/estado_area/mainEstadoArea", modelo);
}

@RequestMapping(value = "eliminarestadoarea", method = RequestMethod.GET)
public  ModelAndView eliminarEstadoArea(HttpServletRequest r) {
    int idestadoarea=Integer.parseInt(r.getParameter("idestadoareax"));
    EstadoAreaServicio.deleteEstadoArea(idestadoarea);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("estadoarea.upeu"));
}


@RequestMapping(value = "formEstadoArea", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloEstadoArea") GloEstadoArea estadoArea,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX",EstadoAreaServicio.listarEstadoArea());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+EstadoAreaServicio.listarEstadoArea().size());
    return new ModelAndView("modulo/config/estado_area/formEstadoArea",modelo);
}


@RequestMapping(value = "guardarEstadoArea", method = RequestMethod.POST)
public ModelAndView guardarEstadoAreaXX(@ModelAttribute("modeloEstadoArea") GloEstadoArea estadoArea,
                                      BindingResult result ){
    System.out.println("holass:"+estadoArea.getIdEstadoArea());
        
        EstadoAreaServicio.saveEstadoArea(estadoArea);
    return new ModelAndView(new RedirectView("estadoarea.upeu"));
}

@RequestMapping(value = "modificarEstadoArea", method = RequestMethod.GET)
public ModelAndView modificarEstadoArea(HttpServletRequest r ){
   int idEstadoArea=Integer.parseInt(r.getParameter("idEstadoArea"));
      GloEstadoArea estadoArea=null;
       estadoArea=EstadoAreaServicio.buscarEstadoArea(idEstadoArea);
    return new ModelAndView("modulo/config/estado_area/formUEstadoArea","ModeloEstadoArea",estadoArea);
}

@RequestMapping(value = "modificarEstadoAreaX", method = RequestMethod.GET)
public String modificarEstadoAreaX(HttpServletRequest r, Model model ){
   int idEstadoArea=Integer.parseInt(r.getParameter("idEstadoArea"));
       GloEstadoArea estadoArea=null;
       estadoArea=EstadoAreaServicio.buscarEstadoArea(idEstadoArea);
       model.addAttribute("ModeloEstadoArea",estadoArea);
       
    return "modulo/config/estado_area/formUEstadoArea";
}
  
@RequestMapping(value = "actualizarEstadoArea", method = RequestMethod.POST)
public ModelAndView actualizarEstadoAreaXX(@ModelAttribute("ModeloEstadoArea") GloEstadoArea estadoArea,
                                      BindingResult result ){
    System.out.println("holass:"+estadoArea.getIdEstadoArea());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        EstadoAreaServicio.updateEstadoArea(estadoArea);
    return new ModelAndView(new RedirectView("estadoarea.upeu"));
}


@RequestMapping(value = "buscarEstadoAreax", method = RequestMethod.POST)
public  ModelAndView buscarEstadoArea(HttpServletRequest r) {
    String estadoarea=r.getParameter("EstadoArea")==null ? "":r.getParameter("EstadoArea");
    List<GloEstadoArea> lista=EstadoAreaServicio.buscarEstadoArea(estadoarea);
    System.out.println(estadoarea+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaEstadoArea", lista);
    
   return new ModelAndView("modulo/config/estado_area/mainEstadoAreas",modelo);
}



    
}
