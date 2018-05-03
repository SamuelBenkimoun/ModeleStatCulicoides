package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.model.dynpopculicoides.SiteNdvi_Edge;
import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.relation.impl.GeometryCellGraph;

@SuppressWarnings("all")
public class SiteNdvi extends GeometryCellGraph<SiteNdvi_Edge, Ndvi, Site> {
  public SiteNdvi() {
    super();
  }
  
  public void connect(final List<Ndvi> ns, final List<Site> ss) {
    SiteNdvi_Edge _gen_edge = new SiteNdvi_Edge(ns, ss);
         		  	  setCompleteIteratorGeomCell(_gen_edge);
  }
  
  public void setNdvi() {
    setMode(2);
    cleanOperator();
    List<CellAggregOperator> cvtList = ((SiteNdvi_Edge)getEdge()).get_agr_setNdvi();
     		if(cvtList != null){
     			for(CellAggregOperator cvt : cvtList) {
     				setCellOperator(cvt);
     			}
     		}
    beginTransaction();
    for(SiteNdvi_Edge _edg_ : this){
    	_edg_.setNdvi();
    }
    endTransaction();
  }
}
