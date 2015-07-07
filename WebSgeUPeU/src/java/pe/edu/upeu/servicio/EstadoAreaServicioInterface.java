/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloEstadoArea;

/**
 *
 * @author USERS
 */
public interface EstadoAreaServicioInterface {
    public List<GloEstadoArea> listarEstadoArea();
        public void saveEstadoArea(GloEstadoArea estadoArea);
            public void deleteEstadoArea(int idEstadoArea);
                public void updateEstadoArea(GloEstadoArea estadoArea);
                    public GloEstadoArea buscarEstadoArea(int idEstadoArea);
                        public List<GloEstadoArea> buscarEstadoArea(String EstadoArea);
                  
    
}
