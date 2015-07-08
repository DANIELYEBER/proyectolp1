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
import pe.edu.upeu.modelo.GloDepartArea;
import pe.edu.upeu.servicio.AreasServicioInterface;
import pe.edu.upeu.servicio.DepartAreaServicioInterface;



@Controller 
public class DepartAreaController {
    
    
@Autowired
DepartAreaServicioInterface DepartAreaServicio;

@Autowired
AreasServicioInterface AreasServicio;


@RequestMapping(value = "departArea", method = RequestMethod.GET)   
public ModelAndView inicioDepartArea(){
    List<GloDepartArea> lista=DepartAreaServicio.listarDepartArea();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartArea", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/depart_area/mainDepartArea", modelo);
}

@RequestMapping(value = "eliminarDepartArea", method = RequestMethod.GET)
public  ModelAndView eliminarDepartArea(HttpServletRequest r) {
    int iddepartArea=Integer.parseInt(r.getParameter("iddepartAreax"));
    DepartAreaServicio.deleteDepartArea(iddepartArea);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("DepartArea.upeu"));
}


@RequestMapping(value = "formDepartArea", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloDepartArea") GloDepartArea departArea,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaDepartArea", "Holasssssssssss");
    modelo.put("listaDepartAreaX", AreasServicio .listarAreas());
    System.out.println("Veeeeer"+AreasServicio.listarAreas().size());
      
    return new ModelAndView("modulo/config/depart_area/formDepartArea",modelo);
}


@RequestMapping(value = "guardarDepartArea", method = RequestMethod.POST)
public ModelAndView guardarDepartAreaXX(@ModelAttribute("modeloDepartArea") GloDepartArea departArea,
                                      BindingResult result ){
    System.out.println("holass:"+departArea.getIdAreas());
    System.out.println("holass:"+departArea.getIdDepartamentoFilial());
        
        DepartAreaServicio.saveDepartArea(departArea);
    return new ModelAndView(new RedirectView("DepartArea.upeu"));
}

@RequestMapping(value = "modificarDepartArea", method = RequestMethod.GET)
public ModelAndView modificarDepartArea(HttpServletRequest r ){
   int idDepartArea=Integer.parseInt(r.getParameter("idDepartArea"));
       GloDepartArea departArea=null;
       departArea=DepartAreaServicio.buscarDepartArea(idDepartArea);
    return new ModelAndView("modulo/config/depart_area/formDepartArea","ModeloDepartArea",departArea);
}

@RequestMapping(value = "modificarDepartAreaX", method = RequestMethod.GET)
public String modificarDepartAreaX(HttpServletRequest r, Model model ){
   int idDepartArea=Integer.parseInt(r.getParameter("idDepartArea"));
       GloDepartArea departArea=null;
       departArea=DepartAreaServicio.buscarDepartArea(idDepartArea);
       model.addAttribute("ModeloDepartArea", departArea);
       model.addAttribute("listaAreasX", AreasServicio.listarAreas());
       
    return "modulo/config/depart_area/formUDepartArea";
}
  
@RequestMapping(value = "actualizarDepartArea", method = RequestMethod.POST)
public ModelAndView gactualizarDepartAreaXX(@ModelAttribute("ModeloDepartArea") GloDepartArea departArea,
                                      BindingResult result ){
    System.out.println("hola cristian:"+departArea.getIdAreas()+departArea.getIdDepartamentoFilial());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        DepartAreaServicio.updateDepartArea(departArea);
    return new ModelAndView(new RedirectView("DepartArea.upeu"));
}


@RequestMapping(value = "buscarDepartAreax", method = RequestMethod.POST)
public  ModelAndView buscarDepartArea(HttpServletRequest r) {
    String DepartArea=r.getParameter("DepartArea")==null ? "":r.getParameter("DepartArea");
    List<GloDepartArea> lista=DepartAreaServicio.buscarDepartArea(DepartArea);
    System.out.println(DepartArea+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaDepartArea", lista);
    
   return new ModelAndView("modulo/config/depart_area/mainDepartArea",modelo);
}}
