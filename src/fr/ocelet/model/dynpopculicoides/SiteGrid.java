package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.model.dynpopculicoides.SiteGrid_Edge;
import fr.ocelet.runtime.relation.RoleSet;
import fr.ocelet.runtime.relation.impl.DiGraph;
import fr.ocelet.runtime.relation.impl.RoleSetImpl;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("all")
public class SiteGrid extends DiGraph<SiteGrid_Edge, Grid, Site> {
  public SiteGrid() {
    super();
  }
  
  public SiteGrid_Edge connect(final Grid g, final Site s) {
    if ((this.gSet == null) || (!this.gSet.contains(g))) add(g);
    if ((this.sSet == null) || (!this.sSet.contains(s))) add(s);
    SiteGrid_Edge _gen_edge_ = new SiteGrid_Edge(this,g,s);
    addEdge(_gen_edge_);
    return _gen_edge_;
  }
  
  public RoleSet<Grid> getLeftSet() {
    return gSet;
  }
  
  public RoleSet<Site> getRightSet() {
    return sSet;
  }
  
  public SiteGrid getComplete() {
    return (SiteGrid)super.getComplete();
  }
  
  public SiteGrid_Edge createEdge(final Grid g, final Site s) {
     return new SiteGrid_Edge(this,g,s);
  }
  
  private RoleSet<Grid> gSet;
  
  public void setGSet(final Collection<Grid> croles) {
    this.gSet=new RoleSetImpl<Grid>(croles);
  }
  
  public RoleSet<Grid> getGSet() {
    return gSet;
  }
  
  private RoleSet<Site> sSet;
  
  public void setSSet(final Collection<Site> croles) {
    this.sSet=new RoleSetImpl<Site>(croles);
  }
  
  public RoleSet<Site> getSSet() {
    return sSet;
  }
  
  public void add(final Grid role) {
    addGrid(role);
  }
  
  public void remove(final Grid role) {
    removeGrid(role);
  }
  
  public void addGrid(final Grid role) {
    if (this.gSet == null) setGSet( new HashSet<Grid>());
    this.gSet.addRole(role);
  }
  
  public void removeGrid(final Grid role) {
    if (this.gSet != null) this.gSet.removeRole(role);
  }
  
  public void addAllGrid(final Iterable<Grid> roles) {
    if (this.gSet == null) setGSet( new HashSet<Grid>());
    this.gSet.addRoles(roles);
  }
  
  public void removeAllGrid(final Iterable<Grid> roles) {
    if (this.gSet != null) this.gSet.removeRoles(roles);
  }
  
  public void addSite(final Site role) {
    if (this.sSet == null) setSSet( new HashSet<Site>());
    this.sSet.addRole(role);
  }
  
  public void remove(final Site role) {
    removeSite(role);
  }
  
  public void add(final Site role) {
    addSite(role);
  }
  
  public void removeSite(final Site role) {
    if (this.sSet != null) this.sSet.removeRole(role);
  }
  
  public void addAllSite(final Iterable<Site> roles) {
    if (this.sSet == null) setSSet( new HashSet<Site>());
    this.sSet.addRoles(roles);
  }
  
  public void removeAllSite(final Iterable<Site> roles) {
    if (this.sSet != null) this.sSet.removeRoles(roles);
  }
  
  public SiteGrid intersect() {
    SiteGrid_intersect _filter = new SiteGrid_intersect();
    super.addFilter(_filter);
    return this;
  }
  
  public void avgProb() {
    beginTransaction();
    for(SiteGrid_Edge _edg_ : this) {
      _edg_.avgProb();
     _edg_._agr_avgProb();
    }
    endTransaction();
  }
}
