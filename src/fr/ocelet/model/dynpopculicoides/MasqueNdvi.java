package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.Masque;
import fr.ocelet.model.dynpopculicoides.MasqueNdvi_Edge;
import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.runtime.ocltypes.List;
import fr.ocelet.runtime.raster.CellAggregOperator;
import fr.ocelet.runtime.relation.impl.DiCellGraph;

@SuppressWarnings("all")
public class MasqueNdvi extends DiCellGraph<MasqueNdvi_Edge, Masque, Ndvi> {
  public MasqueNdvi() {
    super();
  }
  
  public void connect(final List<Masque> ms, final List<Ndvi> ns) {
    
    super.setGrid(ms, ns);
                       MasqueNdvi_Edge _gen_edge_ = new MasqueNdvi_Edge(ms, ns);
                    		setCompleteIteratorDiCell(_gen_edge_ );
  }
  
  public void lisibiliteNDVI() {
    updateGrid();
    cleanOperator();
    List<CellAggregOperator> cvtList = ((MasqueNdvi_Edge)getEdge()).get_agr_lisibiliteNDVI();
    if(cvtList != null){
    	for(CellAggregOperator cvt : cvtList){
     		setCellOperator(cvt);
    	}
    }
                           	for(MasqueNdvi_Edge _edg_ : this) {
    _edg_.lisibiliteNDVI();
    }
  }
}
