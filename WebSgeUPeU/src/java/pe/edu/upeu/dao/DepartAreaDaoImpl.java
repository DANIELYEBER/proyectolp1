/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.GloDepartArea;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author USERS
 */
@Repository("DepartamentoAreaDao")
public class DepartAreaDaoImpl extends DataAccess<GloDepartArea> implements DepartAreaDaoInterface{
    
}
