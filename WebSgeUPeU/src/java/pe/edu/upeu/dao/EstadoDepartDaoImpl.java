/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.GloEstadoDepartamento;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author SistemasUpeu
 */
@Repository("EstadoDepartDao")

public class EstadoDepartDaoImpl extends DataAccess<GloEstadoDepartamento> implements EstadoDepartDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<GloEstadoDepartamento> buscarPeriodo(String periodo){
        System.out.println("DAOOOOO"+periodo);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE UPPER(a.periodo) LIKE UPPER(?)")
               .setString(0, "%"+estadoDepartamento+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }   
    
    
}