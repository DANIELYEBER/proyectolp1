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
import pe.edu.upeu.dao.AreasDaoInterface;
import pe.edu.upeu.modelo.GloAreas;

/**
 *
 * @author USERS
 */
@Service(value = "AreasServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AreasServicioImpl implements AreasServicioInterface{
    
    @Autowired
    public AreasDaoInterface areasDao;
    
    
    @Override
    public List<GloAreas> listarAreas(){
        return areasDao.getListAll();
    }
    
    @Override
    public void saveAreas(GloAreas areas){
        areasDao.save(areas);
    }
    
    @Override
    public void deleteAreas(int idAreas){
       areasDao.delete(idAreas);
   }
    
    @Override
    public void updatePeriodo(GloAreas areas){
       areasDao.update(areas);
   }
    @Override
    public GloAreas buscarAreas(int idAreas){
       return areasDao.getById(idAreas);
   }
    @Override
    public List<GloAreas> buscarAreas(String areas){
       return areasDao.buscarAreas(areas);
   }

    
}

    

