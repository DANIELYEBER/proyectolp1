/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;


import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.modelo.ConfPeriodo;
import pe.edu.upeu.servicio.PeriodoServicioInterface;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.servicio.TemporadaServicioInterface;
/**
 *
 * @author SistemasUpeu
 */
@Controller
public class PeriodoController {

@Autowired
PeriodoServicioInterface periodoServicio;

@Autowired
TemporadaServicioInterface temporadaServicio;
   
@RequestMapping(value = "periodo", method = RequestMethod.GET)   
public ModelAndView inicioPeriodo(){
    List<ConfPeriodo> lista=periodoServicio.listarPeriodo();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaPeriodo", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/periodo/mainPeriodo", modelo);
}

@RequestMapping(value = "eliminarper", method = RequestMethod.GET)
public  ModelAndView eliminarPeriodo(HttpServletRequest r) {
    int idperiodo=Integer.parseInt(r.getParameter("idperiodox"));
    periodoServicio.deletePeriodo(idperiodo);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("periodo.upeu"));
}


@RequestMapping(value = "formPeriodo", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloPeriodo") ConfPeriodo periodo,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", temporadaServicio.listarTemporada());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+temporadaServicio.listarTemporada().size());
    return new ModelAndView("modulo/config/periodo/formPeriodo",modelo);
}


@RequestMapping(value = "guardarPeriodo", method = RequestMethod.POST)
public ModelAndView guardarPeriodoXX(@ModelAttribute("modeloPeriodo") ConfPeriodo periodo,
                                      BindingResult result ){
    System.out.println("holass:"+periodo.getIdTemporada());
        periodo.setFechaInicio(new Date());
        periodo.setFechaFin(new Date());
        periodoServicio.savePeriodo(periodo);
    return new ModelAndView(new RedirectView("periodo.upeu"));
}

@RequestMapping(value = "modificarPeriodo", method = RequestMethod.GET)
public ModelAndView modificarPeriodo(HttpServletRequest r ){
   int idPeriodo=Integer.parseInt(r.getParameter("idPeriodo"));
       ConfPeriodo periodo=null;
       periodo=periodoServicio.buscarPeriodo(idPeriodo);
    return new ModelAndView("modulo/config/periodo/formUPeriodo","ModeloPeriodo",periodo);
}

@RequestMapping(value = "modificarPeriodoX", method = RequestMethod.GET)
public String modificarPeriodoX(HttpServletRequest r, Model model ){
   int idPeriodo=Integer.parseInt(r.getParameter("idPeriodo"));
       ConfPeriodo periodo=null;
       periodo=periodoServicio.buscarPeriodo(idPeriodo);
       model.addAttribute("ModeloPeriodo", periodo);
       model.addAttribute("listaTemporadaX", temporadaServicio.listarTemporada());
    return "modulo/config/periodo/formUPeriodo";
}
  
@RequestMapping(value = "actualizarPeriodo", method = RequestMethod.POST)
public ModelAndView gactualizarPeriodoXX(@ModelAttribute("ModeloPeriodo") ConfPeriodo periodo,
                                      BindingResult result ){
    System.out.println("holass:"+periodo.getIdTemporada());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        periodoServicio.updatePeriodo(periodo);
    return new ModelAndView(new RedirectView("periodo.upeu"));
}


@RequestMapping(value = "buscarPeriodox", method = RequestMethod.POST)
public  ModelAndView buscarPeriodo(HttpServletRequest r) {
    String periodo=r.getParameter("periodo")==null ? "":r.getParameter("periodo");
    List<ConfPeriodo> lista=periodoServicio.buscarPeriodo(periodo);
    System.out.println(periodo+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaPeriodo", lista);
    
   return new ModelAndView("modulo/config/periodo/mainPeriodo",modelo);
}


}
