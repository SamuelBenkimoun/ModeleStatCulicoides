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
    _entity.setProperty("pl",readString("974PL"));
    _entity.setProperty("id",readInteger("ID"));
    _entity.setProperty("date_begin",readString("date_debut"));
    _entity.setProperty("coeff_alt",readDouble("coeff_alt"));
    _entity.setProperty("rainlog1_2",readDouble("logpluie1-2"));
    _entity.setProperty("rain_20",readDouble("rain_20"));
    _entity.setProperty("rain_28",readDouble("rain_28"));
    _entity.setProperty("rainmoy4_5",readDouble("rmoy4_5"));
    _entity.setProperty("rain_8",readDouble("rain_8"));
    _entity.setProperty("occsol",readString("occsol"));
    _entity.setProperty("presence_animaux",readString("animaux"));
    _entity.setProperty("tmoy0_17",readDouble("tmoy0-17"));
    _entity.setProperty("tmin0_14",readDouble("tmin0-14"));
    _entity.setProperty("tmax0_14",readDouble("tmax0-14"));
    _entity.setProperty("tmoy16_18",readDouble("tmoy16_18"));
    _entity.setProperty("tmoymax0_2",readDouble("tmoymax0_2"));
    _entity.setProperty("tmax_11",readDouble("tmax_11"));
    _entity.setProperty("humidite",readDouble("humidite"));
    _entity.setProperty("vent",readDouble("vent"));
    _entity.setProperty("vent_1",readDouble("vent_1"));
    _entity.setProperty("num_station_h",readLong("num_h"));
    _entity.setProperty("prob_bolitinos",readDouble("prob_bol"));
    _entity.setProperty("prob_enderleini",readDouble("prob_end"));
    _entity.setProperty("prob_grahamii",readDouble("prob_gr"));
    _entity.setProperty("prob_imicola",readDouble("prob_imic"));
    _entity.setProperty("prob_kibatiensis",readDouble("prob_kib"));
    _entity.setProperty("eau_500",readDouble("eau_500"));
    _entity.setProperty("eau_1000",readDouble("eau_1000"));
    _entity.setProperty("eau_2000",readDouble("eau_2000"));
    _entity.setProperty("ndvi",readInteger("ndvi"));
    _entity.setProperty("ndvi_id",readInteger("ndvi_id"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    hm.put("974PL","java.lang.String");
    hm.put("ID","java.lang.Integer");
    hm.put("date_debut","java.lang.String");
    hm.put("coeff_alt","java.lang.Double");
    hm.put("logpluie1-2","java.lang.Double");
    hm.put("rain_20","java.lang.Double");
    hm.put("rain_28","java.lang.Double");
    hm.put("rmoy4_5","java.lang.Double");
    hm.put("rain_8","java.lang.Double");
    hm.put("occsol","java.lang.String");
    hm.put("animaux","java.lang.String");
    hm.put("tmoy0-17","java.lang.Double");
    hm.put("tmin0-14","java.lang.Double");
    hm.put("tmax0-14","java.lang.Double");
    hm.put("tmoy16_18","java.lang.Double");
    hm.put("tmoymax0_2","java.lang.Double");
    hm.put("tmax_11","java.lang.Double");
    hm.put("humidite","java.lang.Double");
    hm.put("vent","java.lang.Double");
    hm.put("vent_1","java.lang.Double");
    hm.put("num_h","java.lang.Long");
    hm.put("prob_bol","java.lang.Double");
    hm.put("prob_end","java.lang.Double");
    hm.put("prob_gr","java.lang.Double");
    hm.put("prob_imic","java.lang.Double");
    hm.put("prob_kib","java.lang.Double");
    hm.put("eau_500","java.lang.Double");
    hm.put("eau_1000","java.lang.Double");
    hm.put("eau_2000","java.lang.Double");
    hm.put("ndvi","java.lang.Integer");
    hm.put("ndvi_id","java.lang.Integer");
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
    odr.setAttribute("974PL",((Site) ety).getPl());
    odr.setAttribute("ID",((Site) ety).getId());
    odr.setAttribute("date_debut",((Site) ety).getDate_begin());
    odr.setAttribute("coeff_alt",((Site) ety).getCoeff_alt());
    odr.setAttribute("logpluie1-2",((Site) ety).getRainlog1_2());
    odr.setAttribute("rain_20",((Site) ety).getRain_20());
    odr.setAttribute("rain_28",((Site) ety).getRain_28());
    odr.setAttribute("rmoy4_5",((Site) ety).getRainmoy4_5());
    odr.setAttribute("rain_8",((Site) ety).getRain_8());
    odr.setAttribute("occsol",((Site) ety).getOccsol());
    odr.setAttribute("animaux",((Site) ety).getPresence_animaux());
    odr.setAttribute("tmoy0-17",((Site) ety).getTmoy0_17());
    odr.setAttribute("tmin0-14",((Site) ety).getTmin0_14());
    odr.setAttribute("tmax0-14",((Site) ety).getTmax0_14());
    odr.setAttribute("tmoy16_18",((Site) ety).getTmoy16_18());
    odr.setAttribute("tmoymax0_2",((Site) ety).getTmoymax0_2());
    odr.setAttribute("tmax_11",((Site) ety).getTmax_11());
    odr.setAttribute("humidite",((Site) ety).getHumidite());
    odr.setAttribute("vent",((Site) ety).getVent());
    odr.setAttribute("vent_1",((Site) ety).getVent_1());
    odr.setAttribute("num_h",((Site) ety).getNum_station_h());
    odr.setAttribute("prob_bol",((Site) ety).getProb_bolitinos());
    odr.setAttribute("prob_end",((Site) ety).getProb_enderleini());
    odr.setAttribute("prob_gr",((Site) ety).getProb_grahamii());
    odr.setAttribute("prob_imic",((Site) ety).getProb_imicola());
    odr.setAttribute("prob_kib",((Site) ety).getProb_kibatiensis());
    odr.setAttribute("eau_500",((Site) ety).getEau_500());
    odr.setAttribute("eau_1000",((Site) ety).getEau_1000());
    odr.setAttribute("eau_2000",((Site) ety).getEau_2000());
    odr.setAttribute("ndvi",((Site) ety).getNdvi());
    odr.setAttribute("ndvi_id",((Site) ety).getNdvi_id());
    }
    return odr;
  }
}
