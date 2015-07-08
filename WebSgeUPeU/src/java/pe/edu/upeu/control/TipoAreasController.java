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

import pe.edu.upeu.modelo.GloTipoarea;
import pe.edu.upeu.servicio.TipoAreasServicioInterface;


/**
 *
 * @author USERS
 */

  @Controller 
public class TipoAreasController {
    
    
@Autowired
TipoAreasServicioInterface TipoAreasServicio;

   
@RequestMapping(value = "tipoareas", method = RequestMethod.GET)   
public ModelAndView inicioTipoAreas(){
    List<GloTipoarea> lista=TipoAreasServicio.listarTipoAreas();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaTipoAreas", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/tipoareas/mainTipoAreas", modelo);
}

@RequestMapping(value = "formTipoAreas", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloTipoAreas") GloTipoarea tipoareas,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", TipoAreasServicio.listarTipoAreas());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+TipoAreasServicio.listarTipoAreas().size());
    return new ModelAndView("modulo/config/tipoareas/formTipoAreas",modelo);
}


@RequestMapping(value = "guardarTipoAreas", method = RequestMethod.POST)
public ModelAndView guardarTipoAreasXX(@ModelAttribute("modeloTipoAreas") GloTipoarea tipoareas,
                                      BindingResult result ){
    System.out.println("holass:"+tipoareas.getIdTipoarea());
        
        TipoAreasServicio.saveTipoAreas(tipoareas);
    return new ModelAndView(new RedirectView("tipoareas.upeu"));
}
@RequestMapping(value = "buscarFilialX", method = RequestMethod.POST)
public  ModelAndView buscarTipoAreas(HttpServletRequest r) {
    String tipoareas=r.getParameter("TipoAreas")==null ? "":r.getParameter("TipoAreas");
    List<GloTipoarea> lista=TipoAreasServicio.buscarTipoAreas(tipoareas);
    System.out.println(tipoareas+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    
    modelo.put("ListaFilial", lista);
    
   return new ModelAndView("modulo/config/tipoareas/maintipoAreas",modelo);
}


}

