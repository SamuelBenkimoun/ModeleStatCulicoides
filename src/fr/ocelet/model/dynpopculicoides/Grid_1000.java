package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class Grid_1000 extends Shapefile {
  public Grid_1000() {
    super("data/TRAVAIL/SHAPEFILE/GRID/Grid_filtered.shp","EPSG:2975");
  }
  
  public List<Grid> readAllGrid() {
    List<Grid> _elist = new List<Grid>();
    for (InputDataRecord _record : this) {
      _elist.add(createGridFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<Grid> readAll() {
    return readAllGrid();
  }
  
  public Grid createGridFromRecord(final InputDataRecord _rec) {
                      	    Grid _entity = new Grid();
    _entity.setProperty("geom",readMultiPolygon("geom"));
    _entity.setProperty("id",readInteger("id"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.MultiPolygon");
    hm.put("id","java.lang.Integer");
    return hm;
  }
  
  public List<Grid> readFilteredGrid(final String _filt) {
    setFilter(_filt);
    return readAllGrid();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
    odr.setAttribute("geom",((Grid) ety).getGeom());
    odr.setAttribute("id",((Grid) ety).getId());
    }
    return odr;
  }
}
