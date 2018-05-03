package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Station_Vent;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpVent extends Shapefile {
  public ShpVent() {
    super("data/TRAVAIL/SHAPEFILE/STATIONS/stations_vent_fusion.shp","EPSG:2975");
  }
  
  public List<Station_Vent> readAllStation_Vent() {
    List<Station_Vent> _elist = new List<Station_Vent>();
    for (InputDataRecord _record : this) {
      _elist.add(createStation_VentFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<Station_Vent> readAll() {
    return readAllStation_Vent();
  }
  
  public Station_Vent createStation_VentFromRecord(final InputDataRecord _rec) {
                      	    Station_Vent _entity = new Station_Vent();
    _entity.setProperty("name",readString("Nom de sta"));
    _entity.setProperty("numero",readLong("Numero"));
    _entity.setProperty("mesure",readString("Mesure"));
    _entity.setProperty("geom",readPoint("geom"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("Nom de sta","java.lang.String");
    hm.put("Numero","java.lang.Long");
    hm.put("Mesure","java.lang.String");
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    return hm;
  }
  
  public List<Station_Vent> readFilteredStation_Vent(final String _filt) {
    setFilter(_filt);
    return readAllStation_Vent();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
    odr.setAttribute("Nom de sta",((Station_Vent) ety).getName());
    odr.setAttribute("Numero",((Station_Vent) ety).getNumero());
    odr.setAttribute("Mesure",((Station_Vent) ety).getMesure());
    odr.setAttribute("geom",((Station_Vent) ety).getGeom());
    }
    return odr;
  }
}
