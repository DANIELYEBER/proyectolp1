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
import pe.edu.upeu.dao.DepartamentosFiDaoInterface;
import pe.edu.upeu.modelo.GloDepartamentosFilial;

/**
 *
 * @author USERS
 */
@Service(value = "DepartamentosFiServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartamentosFiServicioImpl implements DepartamentosFiServicioInterface{
    
    @Autowired
    public DepartamentosFiDaoInterface DepartamentosFiDao;
    
    
    @Override
    public List<GloDepartamentosFilial> listarDepartamentosFi(){
        return DepartamentosFiDao.getListAll();
    }
    
    @Override
    public void saveDepartamentosFi (GloDepartamentosFilial departamentosFilial){
        DepartamentosFiDao.save(departamentosFilial);
    }
    
    @Override
    public void deleteDepartamentosFi(int idDepartamemtosFi){
       DepartamentosFiDao.delete(idDepartamemtosFi);
   }
    
    @Override
    public void updateDepartamentosFi(GloDepartamentosFilial departamentosFilial){
       DepartamentosFiDao.update(departamentosFilial);
   }
    @Override
    public GloDepartamentosFilial buscarDepartamentosFi(int idDepartamentosFi){
       return DepartamentosFiDao.getById(idDepartamentosFi);
   }
    @Override
    public List<GloDepartamentosFilial> buscarDepartamentosFi(String DepartamentosFi){
       return DepartamentosFiDao.buscarDepartamentosFi(DepartamentosFi);
   }

    
}
