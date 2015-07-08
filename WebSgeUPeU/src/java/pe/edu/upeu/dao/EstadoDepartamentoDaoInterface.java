
package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.GloEstadoDepartamento;
import syscenterlife.dmp.core.data.IDataAccess;


public interface EstadoDepartamentoDaoInterface extends IDataAccess<GloEstadoDepartamento>{

    public List<GloEstadoDepartamento> buscarEstadoDepartamento(String EstadoDepartamento);

    
    
}
