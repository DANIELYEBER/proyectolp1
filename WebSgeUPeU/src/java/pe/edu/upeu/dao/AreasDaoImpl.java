/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.GloAreas;
import pe.edu.upeu.modelo.GloPersona;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("AreasDao")
public class AreasDaoImpl extends DataAccess<GloAreas> implements AreasDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<GloAreas> buscarAreas(String areas){
        System.out.println("DAOOOOO"+areas);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM GloAreas a WHERE UPPER(a.areas) LIKE UPPER(?)")
               .setString(0, "%"+areas+"%")               
//               .setString(0, "%"+periodo+"%")               
//               .setString(0, "%"+periodo+"%")               
               .list();

    } 
    
   
    

    @Override
    public List<GloPersona> validarUsuarioTr(GloPersona usuarioEnt) {

        List<GloPersona> resultado = null;
        String usuario = usuarioEnt.getUsuario();
        String clave = usuarioEnt.getClave();
        try {
            resultado = (List<GloPersona>) sessionFactoryx.getCurrentSession().createCriteria(GloPersona.class)
                    .add(Expression.eq("usuario", usuario))
                    .add(Expression.eq("clave", clave)).list();
        } catch (Exception e) {
        } finally {
            sessionFactoryx.close();
        }
        System.out.println("numeroooooooooo"+resultado.size());
        return resultado;
    }
    
    
    

}
