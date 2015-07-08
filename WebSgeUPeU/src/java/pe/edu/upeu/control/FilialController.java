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

import pe.edu.upeu.modelo.CorpFilial;
import pe.edu.upeu.servicio.FilialServicioInterface;


/**
 *
 * @author USERS
 */

  @Controller 
public class FilialController {
    
    
@Autowired
FilialServicioInterface FilialServicio;

   
@RequestMapping(value = "filial", method = RequestMethod.GET)   
public ModelAndView inicioFilial(){
    List<CorpFilial> lista=FilialServicio.listarFilial();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaFilial", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/filial/mainFilial", modelo);
}

@RequestMapping(value = "formFilial", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloFilial") CorpFilial filial,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", FilialServicio.listarFilial());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+FilialServicio.listarFilial().size());
    return new ModelAndView("modulo/config/filial/formFilial",modelo);
}


@RequestMapping(value = "guardarFilial", method = RequestMethod.POST)
public ModelAndView guardarFilialXX(@ModelAttribute("modeloFilial") CorpFilial filial,
                                      BindingResult result ){
    System.out.println("holass:"+filial.getIdFilial());
        
        FilialServicio.saveFilial(filial);
    return new ModelAndView(new RedirectView("filial.upeu"));
}
@RequestMapping(value = "buscarFilialX", method = RequestMethod.POST)
public  ModelAndView buscarFilial(HttpServletRequest r) {
    String filial=r.getParameter("Filial")==null ? "":r.getParameter("Filial");
    List<CorpFilial> lista=FilialServicio.buscarFilial(filial);
    System.out.println(filial+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    
    modelo.put("ListaFilial", lista);
    
   return new ModelAndView("modulo/config/filial/mainFilial",modelo);
}


}
