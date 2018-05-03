package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class Shp extends Shapefile {
  public Shp() {
    super("data/TRAVAIL/SHAPEFILE/SITES/elevages_cigal_join_req_min.shp","EPSG:2975");
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
    _entity.setProperty("id",readInteger("OBJECTID"));
    _entity.setProperty("nom",readString("Nom"));
    _entity.setProperty("altitude",readInteger("join_ELEV"));
    _entity.setProperty("geom",readPoint("geom"));
    _entity.setProperty("zone_veg",readString("zone_DAUPI"));
    _entity.setProperty("occsol",readString("CODE_12"));
    _entity.setProperty("eau_500",readDouble("LENGTH_500"));
    _entity.setProperty("eau_1000",readDouble("LENGTH_100"));
    _entity.setProperty("eau_2000",readDouble("LENGTH_200"));
    _entity.setProperty("presence_animaux",readString("Presence_a"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("OBJECTID","java.lang.Integer");
    hm.put("Nom","java.lang.String");
    hm.put("join_ELEV","java.lang.Integer");
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    hm.put("zone_DAUPI","java.lang.String");
    hm.put("CODE_12","java.lang.String");
    hm.put("LENGTH_500","java.lang.Double");
    hm.put("LENGTH_100","java.lang.Double");
    hm.put("LENGTH_200","java.lang.Double");
    hm.put("Presence_a","java.lang.String");
    return hm;
  }
  
  public List<Site> readFilteredSite(final String _filt) {
    setFilter(_filt);
    return readAllSite();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
    odr.setAttribute("OBJECTID",((Site) ety).getId());
    odr.setAttribute("Nom",((Site) ety).getNom());
    odr.setAttribute("join_ELEV",((Site) ety).getAltitude());
    odr.setAttribute("geom",((Site) ety).getGeom());
    odr.setAttribute("zone_DAUPI",((Site) ety).getZone_veg());
    odr.setAttribute("CODE_12",((Site) ety).getOccsol());
    odr.setAttribute("LENGTH_500",((Site) ety).getEau_500());
    odr.setAttribute("LENGTH_100",((Site) ety).getEau_1000());
    odr.setAttribute("LENGTH_200",((Site) ety).getEau_2000());
    odr.setAttribute("Presence_a",((Site) ety).getPresence_animaux());
    }
    return odr;
  }
}
