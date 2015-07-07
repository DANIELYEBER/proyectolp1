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
import pe.edu.upeu.modelo.ConfPeriodo;
import pe.edu.upeu.modelo.GloEstadoArea;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("EstadoAreaDao")
public class EstadoAreaDaoImpl extends DataAccess<GloEstadoArea> implements EstadoAreaDaoInterface{
    
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<GloEstadoArea> buscarEstadoArea(String EstadoArea){
        System.out.println("DAOOOOO"+EstadoArea);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloEstadoArea a WHERE UPPER(a.EstadoArea) LIKE UPPER(?)")
               .setString(0, "%"+EstadoArea+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }  
}
