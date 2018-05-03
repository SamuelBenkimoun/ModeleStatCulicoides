package fr.ocelet.model.dynpopculicoides;

import com.vividsolutions.jts.geom.Geometry;
import fr.ocelet.datafacer.ocltypes.RasterFile;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Masque;
import fr.ocelet.runtime.ocltypes.List;

@SuppressWarnings("all")
public class RasterMasque extends RasterFile {
  public RasterMasque() {
    super("data/TRAVAIL/IMAGES/T40KCB_NDVI_2016/SEN2COR_MASKS","EPSG:2975");
  }
  
  public List<Masque> readAllMasque() {
                      		
    Masque entity = new Masque();
    							
    
    addProperty("valeur",0);
    this.grid = createGrid(entity.getProps(), "Masque");
    
    
    
    
    entity.getCell().setGrid(grid);
    List<Masque> entityList = new List<Masque>();
    entityList.add(entity);
    							return entityList;
  }
  
  public List<Masque> readAllMasque(final Shapefile shp) {
    Masque entity = new Masque();
    
    
                      
    addProperty("valeur",0);
    this.grid = createGrid(entity.getProps(), shp, 	"Masque");
                        
                       
    
    entity.getCell().setGrid(grid);
    					List<Masque> entityList = new List<Masque>();
    					entityList.add(entity);
    					return entityList;
    
  }
  
  public List<Masque> readAllMasque(final Geometry geometry) {
    Masque entity = new Masque();
    
                    
                      
    addProperty("valeur",0);
                      	this.grid = createGrid(entity.getProps(), geometry, 	"Masque");
                        
                        entity.updateCellInfo("QUADRILATERAL");
    
     entity.getCell().setGrid(grid);
    					List<Masque> entityList = new List<Masque>();
    					entityList.add(entity);
    					return entityList;
    
  }
}
