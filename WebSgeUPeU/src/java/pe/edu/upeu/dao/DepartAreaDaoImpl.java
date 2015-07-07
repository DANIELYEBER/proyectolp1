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
import pe.edu.upeu.modelo.GloDepartArea;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("DepartamentoAreaDao")
public class DepartAreaDaoImpl extends DataAccess<GloDepartArea> implements DepartAreaDaoInterface{
    
        @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
     public List<GloDepartArea> buscarDepartArea(String DepartArea){
        System.out.println("DAOOOOO"+DepartArea);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloDepartArea a WHERE UPPER(a.DepartArea) LIKE UPPER(?)")
               .setString(0, "%"+DepartArea+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }   
    
   
    
}
