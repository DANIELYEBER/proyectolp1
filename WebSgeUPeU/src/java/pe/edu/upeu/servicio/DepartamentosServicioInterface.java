/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloDepartamentos;

/**
 *
 * @author USERS
 */
public interface DepartamentosServicioInterface {
    
    public List<GloDepartamentos> listarDepartamentos();
        public void saveDepartamentos (GloDepartamentos departamentos);
            public void deleteDepartamentos(int idDepartamemtos);
                public void updateDepartamentos(GloDepartamentos departamentos);
                    public GloDepartamentos buscarDepartamentos(int idDepartamentos);
                        public List<GloDepartamentos> buscarDepartamentos(String Departamentos);
      
}
