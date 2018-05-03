package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Station_Hum;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpHum extends Shapefile {
  public ShpHum() {
    super("data/TRAVAIL/SHAPEFILE/STATIONS/Stations_Humidite.shp","EPSG:2975");
  }
  
  public List<Station_Hum> readAllStation_Hum() {
    List<Station_Hum> _elist = new List<Station_Hum>();
    for (InputDataRecord _record : this) {
      _elist.add(createStation_HumFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<Station_Hum> readAll() {
    return readAllStation_Hum();
  }
  
  public Station_Hum createStation_HumFromRecord(final InputDataRecord _rec) {
                      	    Station_Hum _entity = new Station_Hum();
    _entity.setProperty("name",readString("Nom de sta"));
    _entity.setProperty("numero",readLong("Numero"));
    _entity.setProperty("geom",readPoint("geom"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("Nom de sta","java.lang.String");
    hm.put("Numero","java.lang.Long");
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    return hm;
  }
  
  public List<Station_Hum> readFilteredStation_Hum(final String _filt) {
    setFilter(_filt);
    return readAllStation_Hum();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
    odr.setAttribute("Nom de sta",((Station_Hum) ety).getName());
    odr.setAttribute("Numero",((Station_Hum) ety).getNumero());
    odr.setAttribute("geom",((Station_Hum) ety).getGeom());
    }
    return odr;
  }
}
