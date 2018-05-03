package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.ocltypes.RasterFile;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.runtime.raster.Grid;

@SuppressWarnings("all")
public class RasterMasque extends RasterFile {
  public RasterMasque() {
    super("data/TRAVAIL/IMAGES/T40KCB_NDVI_2016/SEN2COR_MASKS");
  }
  
  public Grid readAllMasque() {
    if(grid == null){
    	grid = new Grid(getWidth(), getHeight(), getGridGeometry());
    addProperty("valeur",0);
                      				Masque entity = new Masque();
    	createGrid(entity.getProps(), "MasqueGrid");
    	entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    	}
    return grid;
  }
  
  public Grid readAllMasque(final Integer minX, final Integer minY, final Integer maxX, final Integer maxY) {
                      			if(grid == null){
    grid = new Grid(minX, minY, maxX, maxY, getGridGeometry());
    grid.addProp("valeur","0");
    Masque entity = new Masque(); 
    grid.setInitRaster(raster.getRaster(minX, minY, maxX, maxY));
    grid.setFinalProperties(entity.getProps());
    grid.setRes(raster);
    fr.ocelet.runtime.raster.GridManager.getInstance().add(grid);
    entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    }
    						return grid;
  }
  
  public Grid readAllMasque(final Shapefile shp) {
    	if(grid == null){
    
    addProperty("valeur",0);
    	Masque entity = new Masque();
    	this.grid = createGrid(entity.getProps(), shp, 	"MasqueGrid");
      entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    	}
      return grid;
  }
}
