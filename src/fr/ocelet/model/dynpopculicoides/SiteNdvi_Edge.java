package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.ocltypes.KeyMap;
import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.relation.GeomCellEdge;
import fr.ocelet.runtime.relation.OcltRole;

@SuppressWarnings("all")
public class SiteNdvi_Edge extends GeomCellEdge<Ndvi, Site> {
  private Ndvi n;
  
  public void setN(final Ndvi n) {
    this.n = n;
  }
  
  public Ndvi getN() {
    return this.n;
  }
  
  private Site s;
  
  public void setS(final Site s) {
    this.s = s;
  }
  
  public Site getS() {
    return this.s;
  }
  
  public SiteNdvi_Edge(final List<Ndvi> ns, final List<Site> ss) {
    super(ns, ss);  
    this.n = new Ndvi();
    this.n.getCell().setGrid(grid);
              			 
  }
  
  public OcltRole getRole(final int i) {
    if (i==0) return n;
    else if (i==1) return s;
    else return null;
  }
  
  public void update() {
    this.n.setX(getX());
    this.n.setY(getY());
    this. s = getGeomEntity();
  }
  
  public void setNdvi() {
    Boolean _nuages = this.n.getNuages();
    boolean _equals = ((_nuages).booleanValue() == false);
    if (_equals) {
      this.s.setNdvi(this.n.getValeur());
    } else {
      this.s.setNdvi(Integer.valueOf((-99999)));
    }
  }
  
  public List<CellAggregOperator> get_agr_setNdvi() {
    return null;
  }
  
  public KeyMap<String, String> getEdgeProperties() {
    KeyMap<String, String> properties = new KeyMap<String, String>();	
    return properties;         	  	      		
  }
}
