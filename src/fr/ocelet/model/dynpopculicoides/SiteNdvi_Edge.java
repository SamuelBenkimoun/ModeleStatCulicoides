package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.raster.Grid;
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
  
  public SiteNdvi_Edge(final Grid grid, final List<Site> geom) {
    super(grid, geom);  
    this.n = new Ndvi();
    n.updateCellInfo(getCellType());
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
    if ((_nuages).booleanValue()) {
      Integer _valeur = this.n.getValeur();
      this.s.setNdvi(_valeur);
    }
  }
  
  public List<CellAggregOperator> get_agr_setNdvi() {
    return null;
  }
}
