/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.control;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.modelo.GloDepartamentosFilial;
import pe.edu.upeu.servicio.DepartamentosFiServicioInterface;
import pe.edu.upeu.servicio.DepartamentosServicioInterface;


/**
 *
 * @author USERS
 */
@Controller
public class DepartamentosFiController {
    
    
     @Autowired
     DepartamentosFiServicioInterface DepartamentosFiServicio;
    
   @Autowired
   DepartamentosServicioInterface DepartamentosServicio;
   
@RequestMapping(value = "departamentosfi", method = RequestMethod.GET)   
public ModelAndView inicioDepartamentosFi(){
    List<GloDepartamentosFilial> lista=DepartamentosFiServicio.listarDepartamentosFi();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartamentosFi", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/departamentosfilial/mainDepartamentosFilial", modelo);
}

@RequestMapping(value = "eliminardep", method = RequestMethod.GET)
public  ModelAndView eliminarDepartamentosFi(HttpServletRequest r) {
    int idDepartamentoFi=Integer.parseInt(r.getParameter("idDepartamentoFix"));
    DepartamentosFiServicio.deleteDepartamentosFi(idDepartamentoFi);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("departamentosfi.upeu"));
}


@RequestMapping(value = "formDepartamentosFi", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloDepartamentosFi") GloDepartamentosFilial departamentosFilial,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", DepartamentosServicio.listarDepartamentos());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+DepartamentosServicio.listarDepartamentos().size());
    return new ModelAndView("modulo/config/departamentosfilial/formDepartamentosFilial",modelo);
}


@RequestMapping(value = "guardarDepartementosFi", method = RequestMethod.POST)
public ModelAndView guardarDepartamentosFiXX(@ModelAttribute("modeloDepartamentosFi") GloDepartamentosFilial departamentosFilial,
                                      BindingResult result ){
    System.out.println("holass:"+departamentosFilial.getIdDepartamento());
        
        DepartamentosFiServicio.saveDepartamentosFi(departamentosFilial);
    return new ModelAndView(new RedirectView("departamentosfi.upeu"));
}

@RequestMapping(value = "modificarDepartamenosFi", method = RequestMethod.GET)
public ModelAndView modificarDepartamentosFi(HttpServletRequest r ){
   int idDepartamentoFi=Integer.parseInt(r.getParameter("idDepartamentosFi"));
       GloDepartamentosFilial departamentosFilial=null;
       departamentosFilial=DepartamentosFiServicio.buscarDepartamentosFi(idDepartamentoFi);
    return new ModelAndView("modulo/config/departamentosfilial/formUDepartamentosFilial","ModeloPeriodo",departamentosFilial);
}

@RequestMapping(value = "modificarDepartamentosFiX", method = RequestMethod.GET)
public String modificarDepartamentosFiX(HttpServletRequest r, Model model ){
   int idDepartamentoFi=Integer.parseInt(r.getParameter("idDepartamentoFi"));
       GloDepartamentosFilial departamentosFilial=null;
       departamentosFilial=DepartamentosFiServicio.buscarDepartamentosFi(idDepartamentoFi);
       model.addAttribute("ModeloDepartamentosFi", departamentosFilial);
       model.addAttribute("listaDepartamentosFiX", DepartamentosServicio.listarDepartamentos());
    return "modulo/config/departamentosfilial/formUDepartamentosFilial";
}
  
@RequestMapping(value = "actualizarDepartamentosFi", method = RequestMethod.POST)
public ModelAndView gactualizarDepartamentosFiXX(@ModelAttribute("ModeloDepartamentosFi") GloDepartamentosFilial departamentosFilial,
                                      BindingResult result ){
    System.out.println("holass:"+departamentosFilial.getIdDepartamento());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        DepartamentosFiServicio.updateDepartamentosFi(departamentosFilial);
    return new ModelAndView(new RedirectView("DepartamentosFi.upeu"));
}


@RequestMapping(value = "buscarDepartamentosFix", method = RequestMethod.POST)
public  ModelAndView buscarDepartamentosFi(HttpServletRequest r) {
    String DepartamentosFi=r.getParameter("DepartametosFi")==null ? "":r.getParameter("DepartamentosFi");
    List<GloDepartamentosFilial> lista=DepartamentosFiServicio.buscarDepartamentosFi(DepartamentosFi);
    System.out.println(DepartamentosFi+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartamentosFi", lista);
    
   return new ModelAndView("modulo/config/departamentosfilial/mainDepartamentosFilial",modelo);
}

    
}
