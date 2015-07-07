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
import pe.edu.upeu.dao.EstadoDepartamentoDaoInterface;
import pe.edu.upeu.modelo.GloEstadoDepartamento;

/**
 *
 * @author USERS
 */
@Service(value = "EstadoDepartamentoServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EstadoDepartamentoServicioImpl implements EstadoDepartamentoServicioInterface{
     @Autowired
    public EstadoDepartamentoDaoInterface estadoDepartamentoDao;
    
    @Override
    public List<GloEstadoDepartamento> listarEstadoDepartamento(){
        return estadoDepartamentoDao.getListAll();
    }
    
    @Override
    public void saveEstadoDepartamento(GloEstadoDepartamento estadoDepartamento){
        estadoDepartamentoDao.save(estadoDepartamento);
    }
    
    @Override
    public void deleteEstadoDepartamento(int idEstadoDepartamento){
       estadoDepartamentoDao.delete(idEstadoDepartamento);
   }
    
    @Override
    public void updateEstadoDepartamento(GloEstadoDepartamento estadoDepartamento){
       estadoDepartamentoDao.update(estadoDepartamento);
   }
    @Override
    public GloEstadoDepartamento buscarEstadoDepartamento(int idEstadoDepartamento){
       return estadoDepartamentoDao.getById(idEstadoDepartamento);
   }
    @Override
    public List<GloEstadoDepartamento> buscarEstadoDepartamento(String EstadoDepartamento){
       return estadoDepartamentoDao.buscarEstadoDepartamento(EstadoDepartamento);
   }
    
}
