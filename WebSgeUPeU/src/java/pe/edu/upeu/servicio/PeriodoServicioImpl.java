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
import pe.edu.upeu.dao.PeriodoDaoInterface;
import pe.edu.upeu.modelo.ConfPeriodo;

/**
 *
 * @author SistemasUpeu
 */
@Service(value = "PeriodoServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PeriodoServicioImpl implements PeriodoServicioInterface{
    
    @Autowired
    public PeriodoDaoInterface periododao;
    
    
    @Override
    public List<ConfPeriodo> listarPeriodo(){
        return periododao.getListAll();
    }
    
    @Override
    public void savePeriodo(ConfPeriodo periodo){
        periododao.save(periodo);
    }
    
    @Override
    public void deletePeriodo(int idPeriodo){
       periododao.delete(idPeriodo);
   }
    
    @Override
    public void updatePeriodo(ConfPeriodo periodo){
       periododao.update(periodo);
   }
    @Override
    public ConfPeriodo buscarPeriodo(int idperiodo){
       return periododao.getById(idperiodo);
   }
    @Override
    public List<ConfPeriodo> buscarPeriodo(String periodo){
       return periododao.buscarPeriodo(periodo);
   }

    
}
