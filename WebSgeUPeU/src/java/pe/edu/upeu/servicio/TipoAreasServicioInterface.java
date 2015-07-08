/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloTipoarea;

/**
 *
 * @author USERS
 */
public interface TipoAreasServicioInterface {
public List<GloTipoarea> listarTipoAreas();
public void saveTipoAreas(GloTipoarea tipoareas);
    public void deleteTipoAreas(int idTipoAreas);
        public void updateTipoAreas(GloTipoarea tipoareas);
            public GloTipoarea buscarTipoAreas(int idTipoAreas);
                public List<GloTipoarea> buscarTipoAreas(String tipoareas);
     
}
