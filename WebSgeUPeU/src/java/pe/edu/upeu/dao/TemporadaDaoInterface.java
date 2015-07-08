/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.modelo.ConfTemporada;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author SistemasUpeu
 */
public interface TemporadaDaoInterface extends IDataAccess<ConfTemporada>{

    public List<ConfTemporada> getListAll();

    @Override
    public void save(ConfTemporada temporada);

    public void delete(int idTemporada);
    
}
