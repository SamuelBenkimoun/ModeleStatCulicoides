package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.relation.InteractionGraph;
import fr.ocelet.runtime.relation.OcltEdge;
import fr.ocelet.runtime.relation.OcltRole;
import fr.ocelet.runtime.relation.aggregops.Mean;

@SuppressWarnings("all")
public class SiteGrid_Edge extends OcltEdge {
  private Grid g;
  
  public void setG(final Grid g) {
    this.g = g;
  }
  
  public Grid getG() {
    return this.g;
  }
  
  private Site s;
  
  public void setS(final Site s) {
    this.s = s;
  }
  
  public Site getS() {
    return this.s;
  }
  
  public SiteGrid_Edge(final InteractionGraph igr, final Grid first, final Site second) {
    super(igr);
    g=first;
    s=second;
  }
  
  public OcltRole getRole(final int i) {
    if (i==0) return g;
    else if (i==1) return s;
    else return null;
  }
  
  public void avgProb() {
    this.g.setProb_bolitinos(this.s.getProb_bolitinos());
    this.g.setProb_enderleini(this.s.getProb_enderleini());
    this.g.setProb_grahamii(this.s.getProb_grahamii());
    this.g.setProb_imicola(this.s.getProb_imicola());
    this.g.setProb_kibatiensis(this.s.getProb_kibatiensis());
  }
  
  public void _agr_avgProb() {
    this.g.setAgregOp("prob_bolitinos",new Mean(),false);
    this.g.setAgregOp("prob_enderleini",new Mean(),false);
    this.g.setAgregOp("prob_grahamii",new Mean(),false);
    this.g.setAgregOp("prob_imicola",new Mean(),false);
    this.g.setAgregOp("prob_kibatiensis",new Mean(),false);
  }
}
