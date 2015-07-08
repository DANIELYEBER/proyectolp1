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
import pe.edu.upeu.dao.FilialDaoInterface;
import pe.edu.upeu.modelo.CorpFilial;

/**
 *
 * @author USERS
 */
@Service(value = "FilialServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FilialServicioImpl implements FilialServicioInterface{
    
    @Autowired
    public FilialDaoInterface filialDao;
    
    
    @Override
    public List<CorpFilial> listarFilial(){
        return filialDao.getListAll();
    }
    
    @Override
    public void saveFilial(CorpFilial filial){
        filialDao.save(filial);
    }
    
    @Override
    public void deleteFilial(int idFilial){
       filialDao.delete(idFilial);
   }
    
    @Override
    public void updateFilial(CorpFilial filial){
       filialDao.update(filial);
   }
    @Override
    public CorpFilial buscarFilial(int idFilial){
       return filialDao.getById(idFilial);
   }
    @Override
    public List<CorpFilial> buscarFilial(String filial){
       return filialDao.buscarFilial(filial);
   }

    
}

    

