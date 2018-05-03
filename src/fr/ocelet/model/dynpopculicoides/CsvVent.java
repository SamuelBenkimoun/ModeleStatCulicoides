package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.ocltypes.Csvfile;
import fr.ocelet.model.dynpopculicoides.CSV_Vent;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class CsvVent extends Csvfile {
  public CsvVent() {
    super("data/TRAVAIL/CSVDATA/METEO/VENT/97405420.csv");
  }
  
  public List<CSV_Vent> readAllCSV_Vent() {
    List<CSV_Vent> _elist = new List<CSV_Vent>();
    for (InputDataRecord _record : this) {
      _elist.add(createCSV_VentFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<CSV_Vent> readAll() {
    return readAllCSV_Vent();
  }
  
  public CSV_Vent createCSV_VentFromRecord(final InputDataRecord _rec) {
                      	    CSV_Vent _entity = new CSV_Vent();
    _entity.setProperty("numero",readInteger("Poste"));
    _entity.setProperty("vent",readDouble("Vitesse_ms"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("Poste","java.lang.Integer");
    hm.put("Vitesse_ms","java.lang.Double");
    return hm;
  }
  
  public String headerString() {
      StringBuffer sb = new StringBuffer();
    sb.append("Poste");
    sb.append(separator);                     
    sb.append("Vitesse_ms");
    return sb.toString();
  }
  
  public String propsString(final Entity _entity) {
      StringBuffer sb = new StringBuffer();
    sb.append(_entity.getProperty("numero").toString());
    sb.append(separator);                     
    sb.append(_entity.getProperty("vent").toString());
    return sb.toString();
  }
}
