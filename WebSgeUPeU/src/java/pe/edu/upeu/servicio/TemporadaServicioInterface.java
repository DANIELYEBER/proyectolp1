/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.ConfTemporada;

/**
 *
 * @author SistemasUpeu
 */
public interface TemporadaServicioInterface {
    public List<ConfTemporada> listarTemporada();
    public void saveTemporada(ConfTemporada temporada);
    public void deleteTemporada(int idtemporada);    
}
