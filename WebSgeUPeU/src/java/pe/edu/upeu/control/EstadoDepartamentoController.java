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
import pe.edu.upeu.modelo.GloEstadoDepartamento;
import pe.edu.upeu.servicio.EstadoDepartamentoServicioInterface;
import pe.edu.upeu.servicio.TemporadaServicioInterface;
/**
 *
 * @author SistemasUpeu
 */
@Controller
public class EstadoDepartamentoController {

@Autowired
EstadoDepartamentoServicioInterface EstadoDepartamentoServicio;

@Autowired
TemporadaServicioInterface temporadaServicio;
   
@RequestMapping(value = "EstadoDepartamento", method = RequestMethod.GET)   
public ModelAndView inicioEstadoDepartamento(){
    List<GloEstadoDepartamento> lista=EstadoDepartamentoServicio.listarEstadoDepartamento();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaEstadoDepartamento", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/periodo/mainPeriodo", modelo);
}

@RequestMapping(value = "eliminarEstadoDepart", method = RequestMethod.GET)
public  ModelAndView eliminarEstadoDepartamento(HttpServletRequest r) {
    int idEstadoDepart=Integer.parseInt(r.getParameter("idEstadoDepartx"));
   EstadoDepartamentoServicio.deleteEstadoDepartamento(idEstadoDepart);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("periodo.upeu"));
}


@RequestMapping(value = "formEstadoDepartamento", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloEstadoDepartamento") GloEstadoDepartamento EstadoDepartamento,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", temporadaServicio.listarTemporada());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+temporadaServicio.listarTemporada().size());
    return new ModelAndView("modulo/config/periodo/formPeriodo",modelo);
}


@RequestMapping(value = "guardarEstadoDepartamento", method = RequestMethod.POST)
public ModelAndView guardarEstadoDepartamentoXX(@ModelAttribute("modeloEstadoDepartamento") GloEstadoDepartamento EstadoDepartamento,
                                      BindingResult result ){
    System.out.println("holass:"+EstadoDepartamento.getIdTemporada());
        periodo.setFechaInicio(new Date());
        periodo.setFechaFin(new Date());
        periodoServicio.savePeriodo(periodo);
    return new ModelAndView(new RedirectView("periodo.upeu"));
}

@RequestMapping(value = "modificarEstadoDepartamento", method = RequestMethod.GET)
public ModelAndView modificarEstadoDepartamento(HttpServletRequest r ){
   int idEstadoDepartamento=Integer.parseInt(r.getParameter("idEstadoDepartamento"));
       GloEstadoDepartamento EstadoDepartamento=null;
       EstadoDepartamento=EstadoDepartamentoServicio.buscarEstadoDepartamento(idEstadoDepartamento);
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
