/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.CorpFilial;

/**
 *
 * @author USERS
 */
public interface FilialServicioInterface {
public List<CorpFilial> listarFilial();
public void saveFilial(CorpFilial filial);
    public void deleteFilial(int idFilial);
        public void updateFilial(CorpFilial filial);
            public CorpFilial buscarFilial(int idFilial);
                public List<CorpFilial> buscarFilial(String filial);
     
}
