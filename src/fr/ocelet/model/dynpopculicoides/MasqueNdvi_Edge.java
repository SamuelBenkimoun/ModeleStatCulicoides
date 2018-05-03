package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Masque;
import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.raster.Grid;
import fr.ocelet.runtime.relation.DiCursorEdge;
import fr.ocelet.runtime.relation.OcltRole;

@SuppressWarnings("all")
public class MasqueNdvi_Edge extends DiCursorEdge {
  private Masque m;
  
  private Ndvi n;
  
  public MasqueNdvi_Edge(final Grid grid1, final Grid grid2) {
    super(grid1, grid2);
    m = new Masque();
    n = new Ndvi();
    m.updateCellInfo(getCellType());
    n.updateCellInfo(getCellType());
              			 // e1 = new Masque();
    //e2 = new Ndvi();
    //e1.updateCellInfo(getCellType());
    //e2.updateCellInfo(getCellType());
    updateRoleInfo();
  }
  
  public OcltRole getRole(final Integer i) {
    if (i==0) return m;
    else if (i==1) return n;
    else return null;
  }
  
  public void update() {
    this. m.setX(x);
    this. m.setY(y);
    this. n.setX(x2);
    this. n.setY(y2);
    // this.e1.setX(x);
    //this.e1.setY(y);
    //this.e2.setX(x2);
    //this.e2.setY(y2);
    
  }
  
  public void lisibiliteNDVI() {
    Integer _valeur = this.m.getValeur();
    boolean _equals = ((_valeur).intValue() == 99);
    if (_equals) {
      this.n.setNuages(Boolean.valueOf(true));
    }
    Integer _valeur_1 = this.m.getValeur();
    boolean _notEquals = ((_valeur_1).intValue() != 99);
    if (_notEquals) {
      this.n.setNuages(Boolean.valueOf(false));
    }
  }
  
  public List<CellAggregOperator> get_agr_lisibiliteNDVI() {
    return null;
  }
}
