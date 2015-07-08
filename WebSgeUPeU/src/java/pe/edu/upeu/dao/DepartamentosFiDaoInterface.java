
package pe.edu.upeu.dao;


import java.util.List;
import pe.edu.upeu.modelo.GloDepartamentosFilial;
import syscenterlife.dmp.core.data.IDataAccess;


public interface DepartamentosFiDaoInterface extends IDataAccess<GloDepartamentosFilial>{

    public List<GloDepartamentosFilial> buscarDepartamentosFi(String DepartamentosFi);

 
    
}
