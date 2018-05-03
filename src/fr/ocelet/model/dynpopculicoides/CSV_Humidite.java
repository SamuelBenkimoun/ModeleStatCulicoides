package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.ocltypes.Date;

@SuppressWarnings("all")
public class CSV_Humidite extends AbstractEntity {
  public void setNumero(final Integer numero) {
    setProperty("numero",numero);
  }
  
  public Integer getNumero() {
    return getProperty("numero");
  }
  
  public void setDateTXT(final String dateTXT) {
    setProperty("dateTXT",dateTXT);
  }
  
  public String getDateTXT() {
    return getProperty("dateTXT");
  }
  
  public void setDate(final Date date) {
    setProperty("date",date);
  }
  
  public Date getDate() {
    return getProperty("date");
  }
  
  public void setHum_min(final Double hum_min) {
    setProperty("hum_min",hum_min);
  }
  
  public Double getHum_min() {
    return getProperty("hum_min");
  }
  
  public void setHum_moy(final Double hum_moy) {
    setProperty("hum_moy",hum_moy);
  }
  
  public Double getHum_moy() {
    return getProperty("hum_moy");
  }
  
  public void setHum_max(final Double hum_max) {
    setProperty("hum_max",hum_max);
  }
  
  public Double getHum_max() {
    return getProperty("hum_max");
  }
  
  public void getDate() {
    String _dateTXT = this.getDateTXT();
    Date _fromString = Date.fromString("dd/MM/yyyy", _dateTXT);
    this.setDate(_fromString);
  }
  
  public CSV_Humidite() {
    super();
    defProperty("numero",new Hproperty<Integer>());
    setNumero(new Integer("0"));
    defProperty("dateTXT",new Hproperty<String>());
    setDateTXT(new String());
    defProperty("date",new Hproperty<Date>());
    setDate(new Date());
    defProperty("hum_min",new Hproperty<Double>());
    setHum_min(new Double("0"));
    defProperty("hum_moy",new Hproperty<Double>());
    setHum_moy(new Double("0"));
    defProperty("hum_max",new Hproperty<Double>());
    setHum_max(new Double("0"));
  }
}
