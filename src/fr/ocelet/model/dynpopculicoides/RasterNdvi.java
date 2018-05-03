package fr.ocelet.model.dynpopculicoides;

import com.vividsolutions.jts.geom.Geometry;
import fr.ocelet.datafacer.ocltypes.RasterFile;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.runtime.ocltypes.List;

@SuppressWarnings("all")
public class RasterNdvi extends RasterFile {
  public RasterNdvi() {
    super("data/TRAVAIL/IMAGES/T40KCB_NDVI_2016/NDVI","EPSG:2975");
  }
  
  public List<Ndvi> readAllNdvi() {
                      		
    Ndvi entity = new Ndvi();
    							
    
    addProperty("valeur",0);
    this.grid = createGrid(entity.getProps(), "Ndvi");
    
    
    
    
    entity.getCell().setGrid(grid);
    List<Ndvi> entityList = new List<Ndvi>();
    entityList.add(entity);
    							return entityList;
  }
  
  public List<Ndvi> readAllNdvi(final Shapefile shp) {
    Ndvi entity = new Ndvi();
    
    
                      
    addProperty("valeur",0);
    this.grid = createGrid(entity.getProps(), shp, 	"Ndvi");
                        
                       
    
    entity.getCell().setGrid(grid);
    					List<Ndvi> entityList = new List<Ndvi>();
    					entityList.add(entity);
    					return entityList;
    
  }
  
  public List<Ndvi> readAllNdvi(final Geometry geometry) {
    Ndvi entity = new Ndvi();
    
                    
                      
    addProperty("valeur",0);
                      	this.grid = createGrid(entity.getProps(), geometry, 	"Ndvi");
                        
                        entity.updateCellInfo("QUADRILATERAL");
    
     entity.getCell().setGrid(grid);
    					List<Ndvi> entityList = new List<Ndvi>();
    					entityList.add(entity);
    					return entityList;
    
  }
}
