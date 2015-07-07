/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;

import pe.edu.upeu.modelo.GloEstadoDepartamento;

/**
 *
 * @author SistemasUpeu
 */
public interface EstadoDepartServicioInterface {
    public List<GloEstadoDepartamento> listarEstadoDepartServicio();
    public void saveEstadoDepartServicio(GloEstadoDepartamento estadoDepartServicio);
    public void deleteEstadoDepartServicio(int idestadodepartamento);
    
    public void updateEstadoDepartServicio(GloEstadoDepartamento estadoDepartServicio);
    public GloEstadoDepartamento buscarEstadoDepartServicio(int idestadodepartamento);
    public List<GloEstadoDepartamento> buscarEstadoDepartServicio(String estadoDepartServicio);
}