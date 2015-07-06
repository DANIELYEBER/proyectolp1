/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.ConfPeriodo;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author SistemasUpeu
 */
public interface PeriodoDaoInterface extends IDataAccess<ConfPeriodo>{
    public List<ConfPeriodo> buscarPeriodo(String periodo);
}
