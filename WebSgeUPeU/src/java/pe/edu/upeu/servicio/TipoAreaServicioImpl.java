/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.TipoAreaDaoInterface;
import pe.edu.upeu.modelo.GloTipoarea;

/**
 *
 * @author Alexito
 */
@Service(value = "TipoAreaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TipoAreaServicioImpl implements TipoAreaServicioInterface {

    @Autowired
    public TipoAreaDaoInterface dao;

    @Override
    public List<GloTipoarea> listaTipoArea() {
        return dao.getListAll();
    }

   
}
