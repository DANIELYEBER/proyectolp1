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
import pe.edu.upeu.modelo.GloDepartamentos;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("DepartamentosDao")
public class DepartamentosDaoImpl extends DataAccess<GloDepartamentos> implements DepartamentosDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<GloDepartamentos> buscarDepartamentos(String Departamentos){
        System.out.println("DAOOOOO"+Departamentos);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloDepartamentos a WHERE UPPER(a.Departamentos) LIKE UPPER(?)")
               .setString(0, "%"+Departamentos+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    }  
}
