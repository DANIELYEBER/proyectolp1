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
import pe.edu.upeu.dao.EstadoAreaDaoInterface;
import pe.edu.upeu.modelo.GloEstadoArea;

/**
 *
 * @author USERS
 */
@Service(value = "EstadoAreaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EstadoAreaServicioImpl implements EstadoAreaServicioInterface{
    @Autowired
    public EstadoAreaDaoInterface estadoAreaDao;
    
    @Override
    public List<GloEstadoArea> listarEstadoArea(){
        return estadoAreaDao.getListAll();
    }
    
    @Override
    public void saveEstadoArea(GloEstadoArea estadoArea){
        estadoAreaDao.save(estadoArea);
    }
    
    @Override
    public void deleteEstadoArea(int idEstadoArea){
       estadoAreaDao.delete(idEstadoArea);
   }
    
    @Override
    public void updateEstadoArea(GloEstadoArea estadoArea){
       estadoAreaDao.update(estadoArea);
   }
    @Override
    public GloEstadoArea buscarEstadoArea(int idEstadoArea){
       return estadoAreaDao.getById(idEstadoArea);
   }
    @Override
    public List<GloEstadoArea> buscarEstadoArea(String EstadoArea){
       return estadoAreaDao.buscarEstadoArea(EstadoArea);
   }
    
}
