/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.modelo.GloAreas;
import pe.edu.upeu.modelo.GloPersona;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author USERS
 */
public interface AreasDaoInterface extends IDataAccess<GloAreas> {

    public List<GloAreas> buscarAreas(String areas);

    public List<GloPersona> validarUsuarioTr(GloPersona usuarioEnt);

}
