/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.ConfPeriodo;

/**
 *
 * @author SistemasUpeu
 */
public interface PeriodoServicioInterface {
    public List<ConfPeriodo> listarPeriodo();
    public void savePeriodo(ConfPeriodo periodo);
    public void deletePeriodo(int idperiodo);
    
    public void updatePeriodo(ConfPeriodo periodo);
    public ConfPeriodo buscarPeriodo(int idperiodo);
    public List<ConfPeriodo> buscarPeriodo(String periodo);
}
