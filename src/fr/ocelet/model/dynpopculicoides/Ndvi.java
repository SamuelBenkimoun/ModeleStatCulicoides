package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.geom.ocltypes.Cell;
import fr.ocelet.runtime.ocltypes.KeyMap;
import fr.ocelet.runtime.ocltypes.List;

@SuppressWarnings("all")
public class Ndvi extends AbstractEntity {
  public void setValeur(final Integer valeur) {
    cell.getGrid().setValue("valeur",getX(), getY(),valeur.doubleValue());
  }
  
  public Integer getValeur() {
    return cell.getGrid().getValue("valeur",getX(), getY()).intValue();
  }
  
  public void setNuages(final Boolean nuages) {
    if(nuages == true)
    										cell.getGrid().setValue("nuages",getX(), getY(),1.0);
    										cell.getGrid().setValue("nuages",getX(), getY(),0.0);
    
  }
  
  public Boolean getNuages() {
    Double val =cell.getGrid().getValue("nuages",getX(), getY());
    if(val == 0){
    	return true;
    } 
    return false;
  }
  
  public Ndvi() {
    this.cell = new fr.ocelet.runtime.geom.ocltypes.Cell();
    this.setSpatialType(cell);
  }
  
  public List<String> getProps() {
    List<String> names = new List<String>();
    names.add("valeur");
    names.add("nuages");
    return names;
  }
  
  public KeyMap<String, String> getTypeProps() {
    KeyMap<String, String> names = new KeyMap<String, String>();
    names.put("valeur","Integer");
    names.put("nuages","Boolean");
    return names;
  }
  
  public void updateCellInfo(final String type) {
    this.cell.setType(type);
          		  		
  }
  
  private Cell cell;
  
  private Integer x;
  
  private Integer y;
  
  private static Integer numGrid;
  
  public void setX(final Integer x) {
    this.cell.setX(x); 
  }
  
  public void setY(final Integer y) {
    this.cell.setY(y); 
  }
  
  public Integer getX() {
    return this.cell.getX(); 
  }
  
  public Cell getCell() {
    return cell;
  }
  
  public Integer getY() {
    return this.cell.getY();
  }
}
