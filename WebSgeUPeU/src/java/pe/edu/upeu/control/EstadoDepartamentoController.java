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
}}

