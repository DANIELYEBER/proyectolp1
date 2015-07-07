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
import pe.edu.upeu.modelo.GloDepartamentosFilial;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("DepartamentoFiDao")
public class DepartamentosFiDaoImpl extends DataAccess<GloDepartamentosFilial> implements DepartamentosFiDaoInterface{
    
    
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<GloDepartamentosFilial> buscarDepartamentosFi(String DepartamentosFi){
        System.out.println("DAOOOOO"+DepartamentosFi);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloDepartamentosFilial a WHERE UPPER(a.DepartamentosFi) LIKE UPPER(?)")
               .setString(0, "%"+DepartamentosFi+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }  
}
