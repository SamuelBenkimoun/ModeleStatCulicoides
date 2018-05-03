package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpOutAllDates extends Shapefile {
  public ShpOutAllDates() {
    super("output/REUNION_serietemporelle.shp","EPSG:2975");
  }
  
  public List<Site> readAllSite() {
    List<Site> _elist = new List<Site>();
    for (InputDataRecord _record : this) {
      _elist.add(createSiteFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<Site> readAll() {
    return readAllSite();
  }
  
  public Site createSiteFromRecord(final InputDataRecord _rec) {
                      	    Site _entity = new Site();
    _entity.setProperty("geom",readPoint("geom"));
    _entity.setProperty("id",readInteger("ID"));
    _entity.setProperty("commune",readString("Commune"));
    _entity.setProperty("date_begin",readString("date_debut"));
    _entity.setProperty("tmoy0_17",readDouble("tmoy0-17"));
    _entity.setProperty("tmoy16_18",readDouble("tmoy16-18"));
    _entity.setProperty("tmin0_14",readDouble("tmin0-14"));
    _entity.setProperty("tmax0_2",readDouble("tmin0-2"));
    _entity.setProperty("tmax0_14",readDouble("tmax0-14"));
    _entity.setProperty("tmax1_19",readDouble("tmax1-19"));
    _entity.setProperty("tmax_11",readDouble("tmax11"));
    _entity.setProperty("humidite",readDouble("humidite"));
    _entity.setProperty("num_station_h",readLong("num_h"));
    _entity.setProperty("id_station_h",readInteger("id_h"));
    _entity.setProperty("imicola",readDouble("imicola"));
    _entity.setProperty("eau_500",readDouble("eau_500"));
    _entity.setProperty("eau_1000",readDouble("eau_1000"));
    _entity.setProperty("eau_2000",readDouble("eau_2000"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    hm.put("ID","java.lang.Integer");
    hm.put("Commune","java.lang.String");
    hm.put("date_debut","java.lang.String");
    hm.put("tmoy0-17","java.lang.Double");
    hm.put("tmoy16-18","java.lang.Double");
    hm.put("tmin0-14","java.lang.Double");
    hm.put("tmin0-2","java.lang.Double");
    hm.put("tmax0-14","java.lang.Double");
    hm.put("tmax1-19","java.lang.Double");
    hm.put("tmax11","java.lang.Double");
    hm.put("humidite","java.lang.Double");
    hm.put("num_h","java.lang.Long");
    hm.put("id_h","java.lang.Integer");
    hm.put("imicola","java.lang.Double");
    hm.put("eau_500","java.lang.Double");
    hm.put("eau_1000","java.lang.Double");
    hm.put("eau_2000","java.lang.Double");
    return hm;
  }
  
  public List<Site> readFilteredSite(final String _filt) {
    setFilter(_filt);
    return readAllSite();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
    odr.setAttribute("geom",((Site) ety).getGeom());
    odr.setAttribute("ID",((Site) ety).getId());
    odr.setAttribute("Commune",((Site) ety).getCommune());
    odr.setAttribute("date_debut",((Site) ety).getDate_begin());
    odr.setAttribute("tmoy0-17",((Site) ety).getTmoy0_17());
    odr.setAttribute("tmoy16-18",((Site) ety).getTmoy16_18());
    odr.setAttribute("tmin0-14",((Site) ety).getTmin0_14());
    odr.setAttribute("tmin0-2",((Site) ety).getTmax0_2());
    odr.setAttribute("tmax0-14",((Site) ety).getTmax0_14());
    odr.setAttribute("tmax1-19",((Site) ety).getTmax1_19());
    odr.setAttribute("tmax11",((Site) ety).getTmax_11());
    odr.setAttribute("humidite",((Site) ety).getHumidite());
    odr.setAttribute("num_h",((Site) ety).getNum_station_h());
    odr.setAttribute("id_h",((Site) ety).getId_station_h());
    odr.setAttribute("imicola",((Site) ety).getImicola());
    odr.setAttribute("eau_500",((Site) ety).getEau_500());
    odr.setAttribute("eau_1000",((Site) ety).getEau_1000());
    odr.setAttribute("eau_2000",((Site) ety).getEau_2000());
    }
    return odr;
  }
}
