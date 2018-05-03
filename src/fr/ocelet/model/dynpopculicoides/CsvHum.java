package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.ocltypes.Csvfile;
import fr.ocelet.model.dynpopculicoides.CSV_Humidite;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class CsvHum extends Csvfile {
  public CsvHum() {
    super("data/TRAVAIL/CSVDATA/METEO/HUMIDITE/97402240.csv");
  }
  
  public List<CSV_Humidite> readAllCSV_Humidite() {
    List<CSV_Humidite> _elist = new List<CSV_Humidite>();
    for (InputDataRecord _record : this) {
      _elist.add(createCSV_HumiditeFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<CSV_Humidite> readAll() {
    return readAllCSV_Humidite();
  }
  
  public CSV_Humidite createCSV_HumiditeFromRecord(final InputDataRecord _rec) {
                      	    CSV_Humidite _entity = new CSV_Humidite();
    _entity.setProperty("numero",readInteger("Numero"));
    _entity.setProperty("dateTXT",readString("Date"));
    _entity.setProperty("hum_min",readDouble("Un"));
    _entity.setProperty("hum_max",readDouble("Ux"));
    _entity.setProperty("hum_moy",readDouble("Um"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("Numero","java.lang.Integer");
    hm.put("Date","java.lang.String");
    hm.put("Un","java.lang.Double");
    hm.put("Ux","java.lang.Double");
    hm.put("Um","java.lang.Double");
    return hm;
  }
  
  public String headerString() {
      StringBuffer sb = new StringBuffer();
    sb.append("Numero");
    sb.append(separator);                     
    sb.append("Date");
    sb.append(separator);                     
    sb.append("Un");
    sb.append(separator);                     
    sb.append("Ux");
    sb.append(separator);                     
    sb.append("Um");
    return sb.toString();
  }
  
  public String propsString(final Entity _entity) {
      StringBuffer sb = new StringBuffer();
    sb.append(_entity.getProperty("numero").toString());
    sb.append(separator);                     
    sb.append(_entity.getProperty("dateTXT").toString());
    sb.append(separator);                     
    sb.append(_entity.getProperty("hum_min").toString());
    sb.append(separator);                     
    sb.append(_entity.getProperty("hum_max").toString());
    sb.append(separator);                     
    sb.append(_entity.getProperty("hum_moy").toString());
    return sb.toString();
  }
}
