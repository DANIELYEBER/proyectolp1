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
import pe.edu.upeu.modelo.GloEstadoDepartamento;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("EstadoDepartDao")
public class EstadoDepartamentoDaoImpl extends DataAccess<GloEstadoDepartamento> implements EstadoDepartamentoDaoInterface{
      @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
         public List<GloEstadoDepartamento> buscarEstadoDepartamento(String EstadoDepartamento){

        System.out.println("DAOOOOO"+EstadoDepartamento);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloEstadoDepartamento a WHERE UPPER(a.EstadoDepartamento) LIKE UPPER(?)")
               .setString(0, "%"+EstadoDepartamento+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }  
}
