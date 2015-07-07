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
import pe.edu.upeu.modelo.GloDepartamentos;
import pe.edu.upeu.servicio.DepartamentosServicioInterface;

/**
 *
 * @author USERS
 */
@Controller
public class Departamentos {
     
@Autowired
DepartamentosServicioInterface DepartamentosServicio;

   
@RequestMapping(value = "departamentos", method = RequestMethod.GET)   
public ModelAndView inicioDepartamentos(){
    List<GloDepartamentos> lista=DepartamentosServicio.listarDepartamentos();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartamentos", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/departamentos/mainDepartamentos", modelo);
}

@RequestMapping(value = "eliminardepartamentos", method = RequestMethod.GET)
public  ModelAndView eliminarDepartamentos(HttpServletRequest r) {
    int iddepartamento=Integer.parseInt(r.getParameter("iddepartamentox"));
    DepartamentosServicio.deleteDepartamentos(iddepartamento);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("departamentos.upeu"));
}


@RequestMapping(value = "formdepartamentos", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloDepartamentos") GloDepartamentos departamentos,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", DepartamentosServicio.listarDepartamentos());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+DepartamentosServicio.listarDepartamentos().size());
    return new ModelAndView("modulo/config/departamentos/formDepartamentos",modelo);
}


@RequestMapping(value = "guardarDepartamentos", method = RequestMethod.POST)
public ModelAndView guardarDepartamentosXX(@ModelAttribute("modeloDepartamentos") GloDepartamentos departamentos,
                                      BindingResult result ){
    System.out.println("holass:"+departamentos.getIdDepartamento());
        
        DepartamentosServicio.saveDepartamentos(departamentos);
    return new ModelAndView(new RedirectView("departamentos.upeu"));
}

@RequestMapping(value = "modificarDepartamentos", method = RequestMethod.GET)
public ModelAndView modificarDepartamentos(HttpServletRequest r ){
   int idDepartamento=Integer.parseInt(r.getParameter("idDepartamento"));
      GloDepartamentos departamentos=null;
       departamentos=DepartamentosServicio.buscarDepartamentos(idDepartamento);
    return new ModelAndView("modulo/config/departamentos/formUDepartamentos","ModeloDepartamentos",departamentos);
}

@RequestMapping(value = "modificarDepartamentosX", method = RequestMethod.GET)
public String modificarDepartamentosX(HttpServletRequest r, Model model ){
   int idDepartamento=Integer.parseInt(r.getParameter("idDepartamento"));
       GloDepartamentos departamentos=null;
       departamentos=DepartamentosServicio.buscarDepartamentos(idDepartamento);
       model.addAttribute("ModeloAreas", departamentos);
       
    return "modulo/config/departamentos/formUDepartamentos";
}
  
@RequestMapping(value = "actualizarDepartamentos", method = RequestMethod.POST)
public ModelAndView actualizarDepartamentosXX(@ModelAttribute("ModeloDepartamentos") GloDepartamentos departamentos,
                                      BindingResult result ){
    System.out.println("holass:"+departamentos.getIdDepartamento());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        DepartamentosServicio.updateDepartamentos(departamentos);
    return new ModelAndView(new RedirectView("departamento.upeu"));
}


@RequestMapping(value = "buscarDepartamentox", method = RequestMethod.POST)
public  ModelAndView buscarDepartamento(HttpServletRequest r) {
    String departamentos=r.getParameter("departamentos")==null ? "":r.getParameter("departamentos");
    List<GloDepartamentos> lista=DepartamentosServicio.buscarDepartamentos(departamentos);
    System.out.println(departamentos+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartamentos", lista);
    
   return new ModelAndView("modulo/config/departamentos/mainDepartamentos",modelo);
}


}
    

