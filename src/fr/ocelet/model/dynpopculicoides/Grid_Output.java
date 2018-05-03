package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class Grid_Output extends Shapefile {
  public Grid_Output() {
    super("output/Grille.shp","EPSG:2975");
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
    _entity.setProperty("date_begin",readString("date_begin"));
    _entity.setProperty("id",readInteger("id"));
    _entity.setProperty("prob_bolitinos",readDouble("prob_bol"));
    _entity.setProperty("prob_enderleini",readDouble("prob_end"));
    _entity.setProperty("prob_grahamii",readDouble("prob_gr"));
    _entity.setProperty("prob_imicola",readDouble("prob_imic"));
    _entity.setProperty("prob_kibatiensis",readDouble("prob_kib"));
    _entity.setProperty("imicola",readDouble("imicola"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.MultiPolygon");
    hm.put("date_begin","java.lang.String");
    hm.put("id","java.lang.Integer");
    hm.put("prob_bol","java.lang.Double");
    hm.put("prob_end","java.lang.Double");
    hm.put("prob_gr","java.lang.Double");
    hm.put("prob_imic","java.lang.Double");
    hm.put("prob_kib","java.lang.Double");
    hm.put("imicola","java.lang.Double");
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
    odr.setAttribute("date_begin",((Grid) ety).getDate_begin());
    odr.setAttribute("id",((Grid) ety).getId());
    odr.setAttribute("prob_bol",((Grid) ety).getProb_bolitinos());
    odr.setAttribute("prob_end",((Grid) ety).getProb_enderleini());
    odr.setAttribute("prob_gr",((Grid) ety).getProb_grahamii());
    odr.setAttribute("prob_imic",((Grid) ety).getProb_imicola());
    odr.setAttribute("prob_kib",((Grid) ety).getProb_kibatiensis());
    odr.setAttribute("imicola",((Grid) ety).getImicola());
    }
    return odr;
  }
}
