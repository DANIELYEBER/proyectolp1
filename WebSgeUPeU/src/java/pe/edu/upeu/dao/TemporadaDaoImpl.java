/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.ConfTemporada;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author SistemasUpeu
 */
@Repository("TemporadaDao")
public class TemporadaDaoImpl extends DataAccess<ConfTemporada> implements TemporadaDaoInterface{
    
}
