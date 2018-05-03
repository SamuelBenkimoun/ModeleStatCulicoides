package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.geom.ocltypes.MultiPolygon;

@SuppressWarnings("all")
public class Grid extends AbstractEntity {
  public void setGeom(final MultiPolygon geom) {
    setProperty("geom",geom);
  }
  
  public MultiPolygon getGeom() {
    return getProperty("geom");
  }
  
  public void setDate_begin(final String date_begin) {
    setProperty("date_begin",date_begin);
  }
  
  public String getDate_begin() {
    return getProperty("date_begin");
  }
  
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setSites(final Integer sites) {
    setProperty("sites",sites);
  }
  
  public Integer getSites() {
    return getProperty("sites");
  }
  
  public void setProb_bolitinos(final Double prob_bolitinos) {
    setProperty("prob_bolitinos",prob_bolitinos);
  }
  
  public Double getProb_bolitinos() {
    return getProperty("prob_bolitinos");
  }
  
  public void setProb_enderleini(final Double prob_enderleini) {
    setProperty("prob_enderleini",prob_enderleini);
  }
  
  public Double getProb_enderleini() {
    return getProperty("prob_enderleini");
  }
  
  public void setProb_grahamii(final Double prob_grahamii) {
    setProperty("prob_grahamii",prob_grahamii);
  }
  
  public Double getProb_grahamii() {
    return getProperty("prob_grahamii");
  }
  
  public void setProb_imicola(final Double prob_imicola) {
    setProperty("prob_imicola",prob_imicola);
  }
  
  public Double getProb_imicola() {
    return getProperty("prob_imicola");
  }
  
  public void setProb_kibatiensis(final Double prob_kibatiensis) {
    setProperty("prob_kibatiensis",prob_kibatiensis);
  }
  
  public Double getProb_kibatiensis() {
    return getProperty("prob_kibatiensis");
  }
  
  public void setImicola(final Double imicola) {
    setProperty("imicola",imicola);
  }
  
  public Double getImicola() {
    return getProperty("imicola");
  }
  
  public Grid() {
    super();
    defProperty("geom",new Hproperty<MultiPolygon>());
    setGeom(new MultiPolygon());
    defProperty("date_begin",new Hproperty<String>());
    setDate_begin(new String());
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("sites",new Hproperty<Integer>());
    setSites(new Integer("0"));
    defProperty("prob_bolitinos",new Hproperty<Double>());
    setProb_bolitinos(new Double("0"));
    defProperty("prob_enderleini",new Hproperty<Double>());
    setProb_enderleini(new Double("0"));
    defProperty("prob_grahamii",new Hproperty<Double>());
    setProb_grahamii(new Double("0"));
    defProperty("prob_imicola",new Hproperty<Double>());
    setProb_imicola(new Double("0"));
    defProperty("prob_kibatiensis",new Hproperty<Double>());
    setProb_kibatiensis(new Double("0"));
    defProperty("imicola",new Hproperty<Double>());
    setImicola(new Double("0"));
  }
}
