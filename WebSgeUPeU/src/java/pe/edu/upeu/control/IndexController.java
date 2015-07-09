/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.upeu.modelo.GloPersona;
import pe.edu.upeu.modelo.GloUsuario;
import pe.edu.upeu.servicio.AreasServicioInterface;

//DIEGO FRANK
/**
 *
 * @author SistemasUpeu
 */
@Controller
public class IndexController {

    @Autowired
    AreasServicioInterface AreasServicio;

    @RequestMapping(value = "dmp", method = RequestMethod.GET)
    public ModelAndView inicio() {
        return new ModelAndView("admin/index");
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("admin/home");
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public ModelAndView main(HttpServletRequest r) {
        GloPersona per = new GloPersona();
        System.out.println("llego al index control");
        per.setUsuario(r.getParameter("persona"));
        per.setClave(r.getParameter("clave"));
        List<GloPersona> li = AreasServicio.validarUsuarioTr(per);

       
        if (li.size() > 0) {
            return new ModelAndView("admin/indexFrame");
        } else {
            return new ModelAndView("admin/index");
        }

    }

    @RequestMapping(value = "main", method = RequestMethod.POST)
    public ModelAndView main() {
        return new ModelAndView("admin/indexFrame");
    }

    @RequestMapping(value = "dmp1", method = RequestMethod.GET)
    public ModelAndView inicio2() {
        return new ModelAndView("david");
    }

    @RequestMapping(value = "mainPeriodo", method = RequestMethod.GET)
    public ModelAndView mainPeriodo() {
        return new ModelAndView("modulo/config/periodo/mainPeriodo");
    }

}
