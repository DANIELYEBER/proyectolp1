
package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.GloEstadoArea;
import syscenterlife.dmp.core.data.IDataAccess;



public interface EstadoAreaDaoInterface extends IDataAccess<GloEstadoArea>{

    public List<GloEstadoArea> buscarEstadoArea(String EstadoArea);

    
}
