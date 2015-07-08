/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.GloEstadoDepartamento;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author USERS
 */
public interface EstadoDepartamentoDaoInterface extends IDataAccess<GloEstadoDepartamento>{

    public List<GloEstadoDepartamento> buscarEstadoDepartamento(String EstadoDepartamento);

    public List<GloEstadoDepartamento> getListAll();

    public void save(GloEstadoDepartamento estadoDepartamento);

    public void delete(int idEstadoDepartamento);

    public void update(GloEstadoDepartamento estadoDepartamento);

    public GloEstadoDepartamento getById(int idEstadoDepartamento);

    
    
}
