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
import pe.edu.upeu.modelo.GloTipoarea;
import syscenterlife.dmp.core.data.DataAccess;



/**
 *
 * @author Alexito
 */
@Repository("TipoAreasDao")
public class TipoAreasDaoImpl extends DataAccess<GloTipoarea> implements TipoAreasDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
   @Override
    public List<GloTipoarea> buscarTipoArea(String tipoarea){
       System.out.println("DAOOOOO"+tipoarea);
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloAreas a WHERE UPPER(a.areas) LIKE UPPER(?)")
               .setString(0, "%"+tipoarea+"%")                            
               .list();

    }   
   

}
