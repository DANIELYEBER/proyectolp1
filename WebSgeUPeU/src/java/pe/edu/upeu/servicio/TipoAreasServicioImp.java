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
import pe.edu.upeu.dao.TipoAreasDaoInterface;
import pe.edu.upeu.modelo.GloTipoarea;

/**
 *
 * @author USERS
 */
@Service(value = "TipoAreasServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TipoAreasServicioImpl implements TipoAreasServicioInterface{
    
    @Autowired
    public TipoAreasDaoInterface tipoareasDao;
    
    
    @Override
    public List<GloTipoarea> listarTipoAreas(){
        return tipoareasDao.getListAll();
    }
    
    @Override
    public void saveTipoAreas(GloTipoarea tipoareas){
        tipoareasDao.save(tipoareas);
    }
    
    @Override
    public void deleteTipoAreas(int idTipoAreas){
       tipoareasDao.delete(idTipoAreas);
   }
    
    @Override
    public void updateTipoAreas(GloTipoarea tipoareas){
       tipoareasDao.update(tipoareas);
   }
    @Override
    public GloTipoarea buscarTipoAreas(int idTipoAreas){
       return tipoareasDao.getById(idTipoAreas);
   }
    @Override
    public List<GloTipoarea> buscarTipoAreas(String tipoareas){
       return tipoareasDao.buscarTipoArea(tipoareas);
   }

    
}

    

