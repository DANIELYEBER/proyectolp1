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
 * @author USERS
 */
public interface EstadoDepartamentoServicioInterface {
    public List<GloEstadoDepartamento> listarEstadoDepartamento();
        public void saveEstadoDepartamento(GloEstadoDepartamento estadoDepartamento);
            public void deleteEstadoDepartamento(int idEstadoDepartamento);
                public void updateEstadoDepartamento(GloEstadoDepartamento estadoDepartamento);
                    public GloEstadoDepartamento buscarEstadoDepartamento(int idEstadoDepartamento);
                        public List<GloEstadoDepartamento> buscarEstadoDepartamento(String EstadoDepartamento);
            
    
}
