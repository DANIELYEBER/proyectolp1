/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;


import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
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

   
@RequestMapping(value = "EstadoDepartamento", method = RequestMethod.GET)   
public ModelAndView inicioEstadoDepartamento(){
    List<GloEstadoDepartamento> lista=EstadoDepartamentoServicio.listarEstadoDepartamento();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaEstadoDepartamento", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/estado_departamento/mainEstadoDepartamento", modelo);
}

@RequestMapping(value = "eliminarEstadoDepart", method = RequestMethod.GET)
public  ModelAndView eliminarEstadoDepartamento(HttpServletRequest r) {
    int idEstadoDepart=Integer.parseInt(r.getParameter("idEstadoDepartx"));
   EstadoDepartamentoServicio.deleteEstadoDepartamento(idEstadoDepart);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("estadodepart.upeu"));
}


@RequestMapping(value = "formEstadoDepartamento", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloEstadoDepartamento") GloEstadoDepartamento EstadoDepartamento,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", EstadoDepartamentoServicio.listarEstadoDepartamento());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+EstadoDepartamentoServicio.listarEstadoDepartamento().size());
    return new ModelAndView("modulo/config/estado_departamento/formEstadoDepartamento",modelo);
}
@RequestMapping(value = "guardarEstadoDepartamento", method = RequestMethod.POST)
public ModelAndView guardarEstadoDepartamentoXX(@ModelAttribute("modeloEstadoDepartamento") GloEstadoDepartamento EstadoDepartamento,
                                      BindingResult result ){
    System.out.println("holass:"+EstadoDepartamento.getIdEstadodepartamento());
        //EstadoDepartamento.setEstadometa("");
        //EstadoDepartamento.setEstadoavance(new Date());
        EstadoDepartamentoServicio.saveEstadoDepartamento(EstadoDepartamento);
    return new ModelAndView(new RedirectView("estadodepart.upeu"));
}

@RequestMapping(value = "modificarEstadoDepartamento", method = RequestMethod.GET)
public ModelAndView modificarEstadoDepartamento(HttpServletRequest r ){
   int idEstadoDepartamento=Integer.parseInt(r.getParameter("idEstadoDepartamento"));
       GloEstadoDepartamento EstadoDepartamento=null;
       EstadoDepartamento=EstadoDepartamentoServicio.buscarEstadoDepartamento(idEstadoDepartamento);
    return new ModelAndView("modulo/config/estado_departamento/formUEstadoDepartamentoo","ModeloEstadoDepartamento",EstadoDepartamento);
}

@RequestMapping(value = "modificarEstadoDepartamentoX", method = RequestMethod.GET)
public String modificarEstadoDepartamentoX(HttpServletRequest r, Model model ){
   int idEstadoDepartamento=Integer.parseInt(r.getParameter("idEstadoDepartamento"));
       GloEstadoDepartamento EstadoDepartamento=null;
       EstadoDepartamento=EstadoDepartamentoServicio.buscarEstadoDepartamento(idEstadoDepartamento);
       model.addAttribute("ModeloEstadoDepartamento", EstadoDepartamento);
       model.addAttribute("listaEstadoDepartamentoX", EstadoDepartamentoServicio.listarEstadoDepartamento());
    return "modulo/config/estado_departamento/formUEstadoDepartamento";
}
  
@RequestMapping(value = "actualizarEstadoDepartamento", method = RequestMethod.POST)
public ModelAndView gactualizarEstadoDepartamentoXX(@ModelAttribute("ModeloPeriodo") GloEstadoDepartamento EstadoDepartamento,
                                      BindingResult result ){
    System.out.println("holass:"+EstadoDepartamento.getIdEstadodepartamento());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        EstadoDepartamentoServicio.updateEstadoDepartamento(EstadoDepartamento);
    return new ModelAndView(new RedirectView("estadodepart.upeu"));
}


@RequestMapping(value = "buscarEstadoDepartamentox", method = RequestMethod.POST)
public  ModelAndView buscarEstadoDepartamento(HttpServletRequest r) {
    String EstadoDepartamento=r.getParameter("EstadoDepartamento")==null ? "":r.getParameter("EstadoDepartamento");
    List<GloEstadoDepartamento> lista=EstadoDepartamentoServicio.buscarEstadoDepartamento(EstadoDepartamento);
    System.out.println(EstadoDepartamento+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaEstadoDepartamento", lista);
    
   return new ModelAndView("modulo/config/estado_departamento/mainEstadoDepartamento",modelo);
}}


