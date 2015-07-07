/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloDepartArea;

/**
 *
 * @author USERS
 */
public interface DepartAreaServicioInterface {
 public List<GloDepartArea> listarDepartArea();
 public void saveDepartArea(GloDepartArea departArea);
 public void deleteDepartArea(int idDepartArea);
 public void updateDepartArea(GloDepartArea departArea);
 public GloDepartArea buscarDepartArea(int idDepartArea);
public List<GloDepartArea> buscarDepartArea(String DepartArea);
            
    
}
