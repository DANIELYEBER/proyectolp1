/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;



import java.util.List;
import pe.edu.upeu.modelo.CorpFilial;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author USERS
 */
public interface FilialDaoInterface extends IDataAccess<CorpFilial>{
     public List<CorpFilial> buscarFilial(String filial);

    
 

        
}
