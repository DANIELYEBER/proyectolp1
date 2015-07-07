/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloDepartamentosFilial;

/**
 *
 * @author USERS
 */
public interface DepartamentosFiServicioInterface {
    public List<GloDepartamentosFilial> listarDepartamentosFi();
    public void saveDepartamentosFi (GloDepartamentosFilial departamentosFilial);
        public void deleteDepartamentosFi(int idDepartamemtosFi);
            public void updateDepartamentosFi(GloDepartamentosFilial departamentosFilial);
                public GloDepartamentosFilial buscarDepartamentosFi(int idDepartamentosFi);
                    public List<GloDepartamentosFilial> buscarDepartamentosFi(String DepartamentosFi);
                    }
