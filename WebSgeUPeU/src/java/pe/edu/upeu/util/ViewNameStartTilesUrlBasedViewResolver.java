/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.util;

import java.util.Locale;

/**
 *
 * @author Intel
 */
public class ViewNameStartTilesUrlBasedViewResolver extends org.springbyexample.web.servlet.view.tiles2.TilesUrlBasedViewResolver{  
  
 private String viewNameStartsWith = "";  
   
 @Override  
 protected boolean canHandle(String viewName, Locale locale) {  
  if (viewName.startsWith(viewNameStartsWith)){  
   return super.canHandle(viewName, locale);  
  }  
  return false;  
 }  
  
 public void setViewNameStartsWith(String viewNameStartsWith) {  
  this.viewNameStartsWith = viewNameStartsWith;  
 }  
   
}