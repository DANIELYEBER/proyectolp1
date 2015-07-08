/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.CorpFilial;
import syscenterlife.dmp.core.data.DataAccess;



/**
 *
 * @author Alexito
 */
@Repository("FilialDao")
public class FilialDaoImpl extends DataAccess<CorpFilial> implements FilialDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
   @Override
    public List<CorpFilial> buscarFilial(String filial){
       System.out.println("DAOOOOO"+filial);
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloAreas a WHERE UPPER(a.areas) LIKE UPPER(?)")
               .setString(0, "%"+filial+"%")                            
               .list();

    }   
   

}
