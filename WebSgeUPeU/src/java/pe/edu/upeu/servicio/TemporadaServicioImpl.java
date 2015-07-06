/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.TemporadaDaoInterface;
import pe.edu.upeu.modelo.ConfTemporada;

/**
 *
 * @author SistemasUpeu
 */
@Service(value = "TemporadaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TemporadaServicioImpl implements TemporadaServicioInterface{
    
    @Autowired
    public TemporadaDaoInterface temporadadao; 
    
   @Override
    public List<ConfTemporada> listarTemporada(){
        return temporadadao.getListAll();
    }
    
    @Override
    public void saveTemporada(ConfTemporada temporada){
        temporadadao.save(temporada);
    }
    
    @Override
    public void deleteTemporada(int idTemporada){
       temporadadao.delete(idTemporada);
   }    
}
