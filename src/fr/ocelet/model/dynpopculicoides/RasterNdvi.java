package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.ocltypes.RasterFile;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.runtime.raster.Grid;

@SuppressWarnings("all")
public class RasterNdvi extends RasterFile {
  public RasterNdvi() {
    super("data/TRAVAIL/IMAGES/T40KCB_NDVI_2016/NDVI","EPSG:4326");
  }
  
  public Grid readAllNdvi() {
    if(grid == null){
    	grid = new Grid(getWidth(), getHeight(), getGridGeometry());
    addProperty("valeur",0);
                      				Ndvi entity = new Ndvi();
    	createGrid(entity.getProps(), "NdviGrid");
    	entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    	}
    return grid;
  }
  
  public Grid readAllNdvi(final Integer minX, final Integer minY, final Integer maxX, final Integer maxY) {
                      			if(grid == null){
    grid = new Grid(minX, minY, maxX, maxY, getGridGeometry());
    grid.addProp("valeur","0");
    Ndvi entity = new Ndvi(); 
    grid.setInitRaster(raster.getRaster(minX, minY, maxX, maxY));
    grid.setFinalProperties(entity.getProps());
    grid.setRes(raster);
    fr.ocelet.runtime.raster.GridManager.getInstance().add(grid);
    entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    }
    						return grid;
  }
  
  public Grid readAllNdvi(final Shapefile shp) {
    	if(grid == null){
    
    addProperty("valeur",0);
    	Ndvi entity = new Ndvi();
    	this.grid = createGrid(entity.getProps(), shp, 	"NdviGrid");
      entity.setNumGrid(fr.ocelet.runtime.raster.GridManager.getInstance().getCurrentIndex());
    	}
      return grid;
  }
}
