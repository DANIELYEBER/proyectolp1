/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.GloDepartamentos;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author USERS
 */
public interface DepartamentosDaoInterface extends IDataAccess<GloDepartamentos>{

    public List<GloDepartamentos> buscarDepartamentos(String Departamentos);

   
    
}
