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
import pe.edu.upeu.dao.DepartamentosDaoInterface;
import pe.edu.upeu.modelo.GloDepartamentos;


/**
 *
 * @author USERS
 */
@Service(value = "DepartamentosServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepartamentosServicioImpl implements DepartamentosServicioInterface{
    @Autowired
    public DepartamentosDaoInterface DepartamentosDao;
    
    @Override
    public List<GloDepartamentos> listarDepartamentos(){
        return DepartamentosDao.getListAll();
    }
    
    @Override
    public void saveDepartamentos (GloDepartamentos departamentos){
        DepartamentosDao.save(DepartamentosDao);
    }
    
    @Override
    public void deleteDepartamentos(int idDepartamemtos){
       DepartamentosDao.delete(idDepartamemtos);
   }
    
    @Override
    public void updateDepartamentos(GloDepartamentos departamentos){
       DepartamentosDao.update(DepartamentosDao);
   }
    @Override
    public GloDepartamentos buscarDepartamentos(int idDepartamentos){
       return DepartamentosDao.getById(idDepartamentos);
   }
    @Override
    public List<GloDepartamentos> buscarDepartamentos(String Departamentos){
       return DepartamentosDao.buscarDepartamentos(Departamentos);
   }

    
}
