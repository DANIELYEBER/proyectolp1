/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.modelo.GloEstadoArea;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author USERS
 */
public interface EstadoAreaDaoInterface extends IDataAccess<GloEstadoArea>{

    public void save(EstadoAreaDaoInterface estadoAreaDao);

    public void update(EstadoAreaDaoInterface estadoAreaDao);

    public List<GloEstadoArea> buscarEstadoArea(String EstadoArea);
    
}
