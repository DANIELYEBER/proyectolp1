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

import pe.edu.upeu.modelo.GloAreas;
import pe.edu.upeu.servicio.AreasServicioInterface;


/**
 *
 * @author USERS
 */

  @Controller 
public class AreasController {
    
    
@Autowired
AreasServicioInterface AreasServicio;

   
@RequestMapping(value = "areas", method = RequestMethod.GET)   
public ModelAndView inicioAreas(){
    List<GloAreas> lista=AreasServicio.listarAreas();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaAreas", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/areas/mainAreas", modelo);
}

@RequestMapping(value = "eliminarareas", method = RequestMethod.GET)
public  ModelAndView eliminarAreas(HttpServletRequest r) {
    int idareas=Integer.parseInt(r.getParameter("idareasx"));
    AreasServicio.deleteAreas(idareas);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("areas.upeu"));
}


@RequestMapping(value = "formAreas", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloAreas") GloAreas areas,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", AreasServicio.listarAreas());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+AreasServicio.listarAreas().size());
    return new ModelAndView("modulo/config/areas/formAreas",modelo);
}


@RequestMapping(value = "guardarAreas", method = RequestMethod.POST)
public ModelAndView guardarAreasXX(@ModelAttribute("modeloAreas") GloAreas areas,
                                      BindingResult result ){
    System.out.println("holass:"+areas.getIdAreas());
        
        AreasServicio.saveAreas(areas);
    return new ModelAndView(new RedirectView("areas.upeu"));
}

@RequestMapping(value = "modificarAreas", method = RequestMethod.GET)
public ModelAndView modificarAreas(HttpServletRequest r ){
   int idAreas=Integer.parseInt(r.getParameter("idAreas"));
      GloAreas areas=null;
       areas=AreasServicio.buscarAreas(idAreas);
    return new ModelAndView("modulo/config/areas/formUAreas","ModeloAreas",areas);
}

@RequestMapping(value = "modificarAreasX", method = RequestMethod.GET)
public String modificarAreasX(HttpServletRequest r, Model model ){
   int idAreas=Integer.parseInt(r.getParameter("idAreas"));
       GloAreas areas=null;
       areas=AreasServicio.buscarAreas(idAreas);
       model.addAttribute("ModeloAreas", areas);
       
    return "modulo/config/areas/formUAreas";
}
  
@RequestMapping(value = "actualizarAreas", method = RequestMethod.POST)
public ModelAndView actualizarAreasXX(@ModelAttribute("ModeloAreas") GloAreas areas,
                                      BindingResult result ){
    System.out.println("holass:"+areas.getIdAreas());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        AreasServicio.updateAreas(areas);
    return new ModelAndView(new RedirectView("areas.upeu"));
}


@RequestMapping(value = "buscarAreasx", method = RequestMethod.POST)
public  ModelAndView buscarAreas(HttpServletRequest r) {
    String areas=r.getParameter("areas")==null ? "":r.getParameter("areas");
    List<GloAreas> lista=AreasServicio.buscarAreas(areas);
    System.out.println(areas+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaAreas", lista);
    
   return new ModelAndView("modulo/config/areas/mainAreas",modelo);
}


}
