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
import pe.edu.upeu.dao.DepartAreaDaoInterface;
import pe.edu.upeu.modelo.GloDepartArea;

/**
 *
 * @author USERS
 */
@Service(value = "DepartAreaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartAreaServicioImpl implements DepartAreaServicioInterface{
    
    @Autowired
    public DepartAreaDaoInterface DepartAreaDao;
    
    
    @Override
    public List<GloDepartArea> listarDepartArea(){
        return DepartAreaDao.getListAll();
    }
    
    @Override
    public void saveDepartArea(GloDepartArea departArea){
        DepartAreaDao.save(departArea);
    }
    
    @Override
    public void deleteDepartArea(int idDepartArea){
       DepartAreaDao.delete(idDepartArea);
   }
    
    @Override
    public void updateDepartArea(GloDepartArea departArea){
       DepartAreaDao.update(departArea);
   }
    @Override
    public GloDepartArea buscarDepartArea(int idDepartArea){
       return DepartAreaDao.getById(idDepartArea);
   }
    @Override
    public List<GloDepartArea> buscarDepartArea(String DepartArea){
       return DepartAreaDao.buscarDepartArea(DepartArea);
   }

    
}
