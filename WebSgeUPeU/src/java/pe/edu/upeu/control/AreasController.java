/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author USERS
 */

  @Controller 
public class AreasController {
    
    @RequestMapping(value = "Diego", method = RequestMethod.GET)
    public ModelAndView inicio(){            
        return new ModelAndView("config/areas");
}}
