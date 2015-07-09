

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.GloAreas;





public interface AreasServicioInterface {
public List<GloAreas> listarAreas();
public void saveAreas(GloAreas areas);
    public void deleteAreas(int idAreas);
        public void updateAreas(GloAreas areas);
            public GloAreas buscarAreas(int idAreas);
                public List<GloAreas> buscarAreas(String areas);
     
}
