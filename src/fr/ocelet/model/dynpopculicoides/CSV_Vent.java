package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;

@SuppressWarnings("all")
public class CSV_Vent extends AbstractEntity {
  public void setNumero(final Integer numero) {
    setProperty("numero",numero);
  }
  
  public Integer getNumero() {
    return getProperty("numero");
  }
  
  public void setVent(final Double vent) {
    setProperty("vent",vent);
  }
  
  public Double getVent() {
    return getProperty("vent");
  }
  
  public CSV_Vent() {
    super();
    defProperty("numero",new Hproperty<Integer>());
    setNumero(new Integer("0"));
    defProperty("vent",new Hproperty<Double>());
    setVent(new Double("0"));
  }
}
