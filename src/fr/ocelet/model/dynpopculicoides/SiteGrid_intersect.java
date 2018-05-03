package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.runtime.relation.EdgeFilter;

@SuppressWarnings("all")
public class SiteGrid_intersect implements EdgeFilter<Grid, Site> {
  public SiteGrid_intersect() {
    
  }
  
  public Boolean filter(final Grid g, final Site s) {
    return Boolean.valueOf(s.getGeom().intersects(g.getGeom()));
  }
}
