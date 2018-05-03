package fr.ocelet.model.dynpopculicoides;

import com.google.common.base.Objects;
import fr.ocelet.datafacer.ocltypes.KmlExport;
import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.geom.ocltypes.Point;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.KeyMap;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class Site extends AbstractEntity {
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setCommune(final String commune) {
    setProperty("commune",commune);
  }
  
  public String getCommune() {
    return getProperty("commune");
  }
  
  public void setAltitude(final Integer altitude) {
    setProperty("altitude",altitude);
  }
  
  public Integer getAltitude() {
    return getProperty("altitude");
  }
  
  public void setDiff_alt(final Integer diff_alt) {
    setProperty("diff_alt",diff_alt);
  }
  
  public Integer getDiff_alt() {
    return getProperty("diff_alt");
  }
  
  public void setKl(final Integer kl) {
    setProperty("kl",kl);
  }
  
  public Integer getKl() {
    return getProperty("kl");
  }
  
  public void setNom(final String nom) {
    setProperty("nom",nom);
  }
  
  public String getNom() {
    return getProperty("nom");
  }
  
  public void setPresence_animaux(final String presence_animaux) {
    setProperty("presence_animaux",presence_animaux);
  }
  
  public String getPresence_animaux() {
    return getProperty("presence_animaux");
  }
  
  public void setZone_veg(final String zone_veg) {
    setProperty("zone_veg",zone_veg);
  }
  
  public String getZone_veg() {
    return getProperty("zone_veg");
  }
  
  public void setOccsol(final String occsol) {
    setProperty("occsol",occsol);
  }
  
  public String getOccsol() {
    return getProperty("occsol");
  }
  
  public void setEau_500(final Double eau_500) {
    setProperty("eau_500",eau_500);
  }
  
  public Double getEau_500() {
    return getProperty("eau_500");
  }
  
  public void setEau_1000(final Double eau_1000) {
    setProperty("eau_1000",eau_1000);
  }
  
  public Double getEau_1000() {
    return getProperty("eau_1000");
  }
  
  public void setEau_2000(final Double eau_2000) {
    setProperty("eau_2000",eau_2000);
  }
  
  public Double getEau_2000() {
    return getProperty("eau_2000");
  }
  
  public void setNdvi(final Integer ndvi) {
    setProperty("ndvi",ndvi);
  }
  
  public Integer getNdvi() {
    return getProperty("ndvi");
  }
  
  public void setGeom(final Point geom) {
    setProperty("geom",geom);
  }
  
  public Point getGeom() {
    return getProperty("geom");
  }
  
  public void setDate_begin(final String date_begin) {
    setProperty("date_begin",date_begin);
  }
  
  public String getDate_begin() {
    return getProperty("date_begin");
  }
  
  public void setDate_end(final String date_end) {
    setProperty("date_end",date_end);
  }
  
  public String getDate_end() {
    return getProperty("date_end");
  }
  
  public void setNom_station(final String nom_station) {
    setProperty("nom_station",nom_station);
  }
  
  public String getNom_station() {
    return getProperty("nom_station");
  }
  
  public void setDist_station(final Double dist_station) {
    setProperty("dist_station",dist_station);
  }
  
  public Double getDist_station() {
    return getProperty("dist_station");
  }
  
  public void setId_station(final Integer id_station) {
    setProperty("id_station",id_station);
  }
  
  public Integer getId_station() {
    return getProperty("id_station");
  }
  
  public void setNum_station(final Long num_station) {
    setProperty("num_station",num_station);
  }
  
  public Long getNum_station() {
    return getProperty("num_station");
  }
  
  public void setDist_station_h(final Double dist_station_h) {
    setProperty("dist_station_h",dist_station_h);
  }
  
  public Double getDist_station_h() {
    return getProperty("dist_station_h");
  }
  
  public void setId_station_h(final Integer id_station_h) {
    setProperty("id_station_h",id_station_h);
  }
  
  public Integer getId_station_h() {
    return getProperty("id_station_h");
  }
  
  public void setNum_station_h(final Long num_station_h) {
    setProperty("num_station_h",num_station_h);
  }
  
  public Long getNum_station_h() {
    return getProperty("num_station_h");
  }
  
  public void setEggs(final Double eggs) {
    setProperty("eggs",eggs);
  }
  
  public Double getEggs() {
    return getProperty("eggs");
  }
  
  public void setLarvae(final Double larvae) {
    setProperty("larvae",larvae);
  }
  
  public Double getLarvae() {
    return getProperty("larvae");
  }
  
  public void setPupae(final Double pupae) {
    setProperty("pupae",pupae);
  }
  
  public Double getPupae() {
    return getProperty("pupae");
  }
  
  public void setAdults(final Double adults) {
    setProperty("adults",adults);
  }
  
  public Double getAdults() {
    return getProperty("adults");
  }
  
  public void setAdults_ov(final Double adults_ov) {
    setProperty("adults_ov",adults_ov);
  }
  
  public Double getAdults_ov() {
    return getProperty("adults_ov");
  }
  
  public void setProb_imicola(final Double prob_imicola) {
    setProperty("prob_imicola",prob_imicola);
  }
  
  public Double getProb_imicola() {
    return getProperty("prob_imicola");
  }
  
  public void setImicola(final Double imicola) {
    setProperty("imicola",imicola);
  }
  
  public Double getImicola() {
    return getProperty("imicola");
  }
  
  public void setFpon(final Integer fpon) {
    setProperty("fpon",fpon);
  }
  
  public Integer getFpon() {
    return getProperty("fpon");
  }
  
  public void setFegg(final Double fegg) {
    setProperty("fegg",fegg);
  }
  
  public Double getFegg() {
    return getProperty("fegg");
  }
  
  public void setFlarvae(final Double flarvae) {
    setProperty("flarvae",flarvae);
  }
  
  public Double getFlarvae() {
    return getProperty("flarvae");
  }
  
  public void setFpupae(final Double fpupae) {
    setProperty("fpupae",fpupae);
  }
  
  public Double getFpupae() {
    return getProperty("fpupae");
  }
  
  public void setFaov(final Double faov) {
    setProperty("faov",faov);
  }
  
  public Double getFaov() {
    return getProperty("faov");
  }
  
  public void setFme(final Double fme) {
    setProperty("fme",fme);
  }
  
  public Double getFme() {
    return getProperty("fme");
  }
  
  public void setFml(final Double fml) {
    setProperty("fml",fml);
  }
  
  public Double getFml() {
    return getProperty("fml");
  }
  
  public void setFmp(final Double fmp) {
    setProperty("fmp",fmp);
  }
  
  public Double getFmp() {
    return getProperty("fmp");
  }
  
  public void setFma(final Double fma) {
    setProperty("fma",fma);
  }
  
  public Double getFma() {
    return getProperty("fma");
  }
  
  public void setTemperature(final Double temperature) {
    setProperty("temperature",temperature);
  }
  
  public Double getTemperature() {
    return getProperty("temperature");
  }
  
  public void setTemperature_grad(final Double temperature_grad) {
    setProperty("temperature_grad",temperature_grad);
  }
  
  public Double getTemperature_grad() {
    return getProperty("temperature_grad");
  }
  
  public void setRain(final Double rain) {
    setProperty("rain",rain);
  }
  
  public Double getRain() {
    return getProperty("rain");
  }
  
  public void setRain7(final Double rain7) {
    setProperty("rain7",rain7);
  }
  
  public Double getRain7() {
    return getProperty("rain7");
  }
  
  public void setRainmoy4_5(final Double rainmoy4_5) {
    setProperty("rainmoy4_5",rainmoy4_5);
  }
  
  public Double getRainmoy4_5() {
    return getProperty("rainmoy4_5");
  }
  
  public void setTmin(final Double tmin) {
    setProperty("tmin",tmin);
  }
  
  public Double getTmin() {
    return getProperty("tmin");
  }
  
  public void setTmax(final Double tmax) {
    setProperty("tmax",tmax);
  }
  
  public Double getTmax() {
    return getProperty("tmax");
  }
  
  /**
   * service updateVariablesRain () {
   * raincumul7 = raincumul7 + rain -rain7
   * }
   */
  public void setClassCuli(final Integer classCuli) {
    setProperty("classCuli",classCuli);
  }
  
  /**
   * service updateVariablesRain () {
   * raincumul7 = raincumul7 + rain -rain7
   * }
   */
  public Integer getClassCuli() {
    return getProperty("classCuli");
  }
  
  public void setDate(final Date date) {
    setProperty("date",date);
  }
  
  public Date getDate() {
    return getProperty("date");
  }
  
  public void setKtmin(final KeyMap<Date, Double> ktmin) {
    setProperty("ktmin",ktmin);
  }
  
  public KeyMap<Date, Double> getKtmin() {
    return getProperty("ktmin");
  }
  
  public void setTmoy0_17(final Double tmoy0_17) {
    setProperty("tmoy0_17",tmoy0_17);
  }
  
  public Double getTmoy0_17() {
    return getProperty("tmoy0_17");
  }
  
  public void setTmoy16_18(final Double tmoy16_18) {
    setProperty("tmoy16_18",tmoy16_18);
  }
  
  public Double getTmoy16_18() {
    return getProperty("tmoy16_18");
  }
  
  public void setTmin0_14(final Double tmin0_14) {
    setProperty("tmin0_14",tmin0_14);
  }
  
  public Double getTmin0_14() {
    return getProperty("tmin0_14");
  }
  
  public void setTmax0_2(final Double tmax0_2) {
    setProperty("tmax0_2",tmax0_2);
  }
  
  public Double getTmax0_2() {
    return getProperty("tmax0_2");
  }
  
  public void setTmax0_14(final Double tmax0_14) {
    setProperty("tmax0_14",tmax0_14);
  }
  
  public Double getTmax0_14() {
    return getProperty("tmax0_14");
  }
  
  public void setTmax1_19(final Double tmax1_19) {
    setProperty("tmax1_19",tmax1_19);
  }
  
  public Double getTmax1_19() {
    return getProperty("tmax1_19");
  }
  
  public void setTmax_11(final Double tmax_11) {
    setProperty("tmax_11",tmax_11);
  }
  
  public Double getTmax_11() {
    return getProperty("tmax_11");
  }
  
  public void setHumidite(final Double humidite) {
    setProperty("humidite",humidite);
  }
  
  public Double getHumidite() {
    return getProperty("humidite");
  }
  
  public void updateTemp() {
    Double _tmin = this.getTmin();
    Double _tmax = this.getTmax();
    double _plus = DoubleExtensions.operator_plus(_tmin, _tmax);
    double _divide = (_plus / 2);
    this.setTemperature(Double.valueOf(_divide));
  }
  
  public void gradientAlt(final Double temperature) {
    Integer _diff_alt = this.getDiff_alt();
    double _multiply = ((_diff_alt).intValue() * (6.5 / 1000));
    double _minus = ((temperature).doubleValue() - _multiply);
    this.setTemperature_grad(Double.valueOf(_minus));
  }
  
  public void calcImicola(final Double temperature) {
    double daupi = 0.0;
    String _zone_veg = this.getZone_veg();
    boolean _equals = Objects.equal(_zone_veg, "sav_fs");
    if (_equals) {
      daupi = 2.23167;
    }
    String _zone_veg_1 = this.getZone_veg();
    boolean _equals_1 = Objects.equal(_zone_veg_1, "fh_bas");
    if (_equals_1) {
      daupi = 0.29061;
    }
    String _zone_veg_2 = this.getZone_veg();
    boolean _equals_2 = Objects.equal(_zone_veg_2, "fh_mont_es");
    if (_equals_2) {
      daupi = 2.03136;
    }
    String _zone_veg_3 = this.getZone_veg();
    boolean _equals_3 = Objects.equal(_zone_veg_3, "fh_mont_ou");
    if (_equals_3) {
      daupi = 1.54592;
    }
    String _zone_veg_4 = this.getZone_veg();
    boolean _equals_4 = Objects.equal(_zone_veg_4, "tamarins");
    if (_equals_4) {
      daupi = 0.0;
    }
    InputOutput.<String>println("..................");
    InputOutput.<String>print(("daupi :" + Double.valueOf(daupi)));
    double animaux = 2.66738;
    String _presence_animaux = this.getPresence_animaux();
    boolean _equals_5 = Objects.equal(_presence_animaux, "Intdrieur");
    if (_equals_5) {
      animaux = 0.75859;
    }
    String _presence_animaux_1 = this.getPresence_animaux();
    boolean _equals_6 = Objects.equal(_presence_animaux_1, "Extdrieur");
    if (_equals_6) {
      animaux = 2.99492;
    }
    InputOutput.<String>println(("animaux: " + Double.valueOf(animaux)));
    double corine = 0.0;
    String _occsol = this.getOccsol();
    boolean _equals_7 = Objects.equal(_occsol, "2430");
    if (_equals_7) {
      corine = 0.6646;
    }
    String _occsol_1 = this.getOccsol();
    boolean _equals_8 = Objects.equal(_occsol_1, "2112");
    if (_equals_8) {
      corine = 0.0;
    }
    String _occsol_2 = this.getOccsol();
    boolean _equals_9 = Objects.equal(_occsol_2, "2310");
    if (_equals_9) {
      corine = (-1.7396);
    }
    String _occsol_3 = this.getOccsol();
    boolean _equals_10 = Objects.equal(_occsol_3, "2420");
    if (_equals_10) {
      corine = (-1.1537);
    }
    String _occsol_4 = this.getOccsol();
    boolean _equals_11 = Objects.equal(_occsol_4, "1120");
    if (_equals_11) {
      corine = 0.2944;
    }
    String _occsol_5 = this.getOccsol();
    boolean _equals_12 = Objects.equal(_occsol_5, "3330");
    if (_equals_12) {
      corine = 0.5647;
    }
    InputOutput.<String>println(("corine :" + Double.valueOf(corine)));
    double prob = 0.0;
    Double _tmoy0_17 = this.getTmoy0_17();
    double _multiply = ((_tmoy0_17).doubleValue() * 0.29637);
    double _plus = ((-6.78291) + _multiply);
    Double _tmax0_14 = this.getTmax0_14();
    double _multiply_1 = ((_tmax0_14).doubleValue() * 0.09759);
    double _plus_1 = (_plus + _multiply_1);
    Double _humidite = this.getHumidite();
    double _multiply_2 = ((_humidite).doubleValue() * (-0.04619));
    double _plus_2 = (_plus_1 + _multiply_2);
    Double _rainmoy4_5 = this.getRainmoy4_5();
    double _multiply_3 = ((_rainmoy4_5).doubleValue() * (-0.05577));
    double _plus_3 = (_plus_2 + _multiply_3);
    double _plus_4 = (_plus_3 + daupi);
    double p = (_plus_4 + animaux);
    InputOutput.<String>println(("p: " + Double.valueOf(p)));
    Double _tmin = this.getTmin();
    String _plus_5 = ("tmin: " + _tmin);
    String _plus_6 = (_plus_5 + "; tmax: ");
    Double _tmax = this.getTmax();
    String _plus_7 = (_plus_6 + _tmax);
    InputOutput.<String>println(_plus_7);
    Double _tmoy0_17_1 = this.getTmoy0_17();
    String _plus_8 = ("tmoy0_17: " + _tmoy0_17_1);
    String _plus_9 = (_plus_8 + "; tmax0_14: ");
    Double _tmax0_14_1 = this.getTmax0_14();
    String _plus_10 = (_plus_9 + _tmax0_14_1);
    String _plus_11 = (_plus_10 + "; humidite : ");
    Double _humidite_1 = this.getHumidite();
    String _plus_12 = (_plus_11 + _humidite_1);
    String _plus_13 = (_plus_12 + "; rainmoy4_5: ");
    Double _rainmoy4_5_1 = this.getRainmoy4_5();
    String _plus_14 = (_plus_13 + _rainmoy4_5_1);
    InputOutput.<String>println(_plus_14);
    double _exp = Math.exp(p);
    double _exp_1 = Math.exp(p);
    double _plus_15 = (1 + _exp_1);
    double _divide = (_exp / _plus_15);
    prob = _divide;
    InputOutput.<String>println(("prob: " + Double.valueOf(prob)));
    if ((prob < 0.5)) {
      this.setImicola(Double.valueOf(0.0));
    }
    if ((prob >= 0.5)) {
      this.updateTemp();
      Double _eau_500 = this.getEau_500();
      double _multiply_4 = ((_eau_500).doubleValue() * (-2.0592));
      double _plus_16 = ((((-1.8838) + ((temperature).doubleValue() * 0.0476)) + corine) + _multiply_4);
      Double _eau_1000 = this.getEau_1000();
      double _multiply_5 = ((_eau_1000).doubleValue() * 1.5144);
      double _plus_17 = (_plus_16 + _multiply_5);
      Double _eau_2000 = this.getEau_2000();
      double _multiply_6 = ((_eau_2000).doubleValue() * (-0.2148));
      double z = (_plus_17 + _multiply_6);
      Double _eau_500_1 = this.getEau_500();
      String _plus_18 = ((((("temperature: " + temperature) + "; corine: ") + Double.valueOf(corine)) + "; eau_500: ") + _eau_500_1);
      String _plus_19 = (_plus_18 + "; eau_1000: ");
      Double _eau_1000_1 = this.getEau_1000();
      double _divide_1 = ((_eau_1000_1).doubleValue() / 1000);
      String _plus_20 = (_plus_19 + Double.valueOf(_divide_1));
      String _plus_21 = (_plus_20 + "; eau_2000: ");
      Double _eau_2000_1 = this.getEau_2000();
      double _divide_2 = ((_eau_2000_1).doubleValue() / 1000);
      String _plus_22 = (_plus_21 + Double.valueOf(_divide_2));
      InputOutput.<String>println(_plus_22);
      InputOutput.<String>println(("z: " + Double.valueOf(z)));
      double _pow = Math.pow(10, (z - 1));
      this.setImicola(Double.valueOf(_pow));
    }
  }
  
  public void lifeCycleFunctions(final Double temperature_grad) {
    this.setFpon(Integer.valueOf((60 / 2)));
    double _pow = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply = (0.0375 * _pow);
    double _minus = (_multiply - (1.9875 * (temperature_grad).doubleValue()));
    double duree_el = (_minus + 27.75);
    this.setFegg(Double.valueOf((1 / duree_el)));
    if (((temperature_grad).doubleValue() < 25)) {
      double _pow_1 = Math.pow((temperature_grad).doubleValue(), 2);
      double _multiply_1 = ((-0.2141) * _pow_1);
      double _plus = (_multiply_1 + (6.9271 * (temperature_grad).doubleValue()));
      double _minus_1 = (_plus - 19.045);
      double _divide = (_minus_1 / 100);
      this.setFme(Double.valueOf(_divide));
    }
    if (((temperature_grad).doubleValue() > 25)) {
      double _pow_2 = Math.pow((temperature_grad).doubleValue(), 2);
      double _multiply_2 = (0.3 * _pow_2);
      double _minus_2 = (_multiply_2 - (17.5 * (temperature_grad).doubleValue()));
      double _plus_1 = (_minus_2 + 270.0);
      double _divide_1 = (_plus_1 / 100);
      this.setFme(Double.valueOf(_divide_1));
    }
    Double _fme = this.getFme();
    boolean _greaterThan = ((_fme).doubleValue() > 1.0);
    if (_greaterThan) {
      this.setFme(Double.valueOf(1.0));
    }
    Double _fme_1 = this.getFme();
    boolean _lessThan = ((_fme_1).doubleValue() < 0.10);
    if (_lessThan) {
      this.setFme(Double.valueOf(0.10));
    }
    double _pow_3 = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply_3 = (0.0333 * _pow_3);
    double _minus_3 = (_multiply_3 - (2.6 * (temperature_grad).doubleValue()));
    double duree_lp = (_minus_3 + 54.667);
    this.setFlarvae(Double.valueOf((1 / duree_lp)));
    double _pow_4 = Math.pow((temperature_grad).doubleValue(), 3);
    double _multiply_4 = ((-0.0002) * _pow_4);
    double _pow_5 = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply_5 = (0.0172 * _pow_5);
    double _plus_2 = (_multiply_4 + _multiply_5);
    double _minus_4 = (_plus_2 - (0.4991 * (temperature_grad).doubleValue()));
    double _plus_3 = (_minus_4 + 4.8875);
    this.setFml(Double.valueOf(_plus_3));
    Double _fml = this.getFml();
    boolean _greaterThan_1 = ((_fml).doubleValue() > 1.0);
    if (_greaterThan_1) {
      this.setFml(Double.valueOf(1.0));
    }
    Double _fml_1 = this.getFml();
    boolean _lessThan_1 = ((_fml_1).doubleValue() < 0.10);
    if (_lessThan_1) {
      this.setFml(Double.valueOf(0.10));
    }
    double _pow_6 = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply_6 = (0.0083 * _pow_6);
    double _minus_5 = (_multiply_6 - (0.475 * (temperature_grad).doubleValue()));
    double _plus_4 = (_minus_5 + 9.1667);
    double _divide_2 = (1 / _plus_4);
    this.setFpupae(Double.valueOf(_divide_2));
    double _pow_7 = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply_7 = (0.0012 * _pow_7);
    double _minus_6 = (_multiply_7 - (0.0627 * (temperature_grad).doubleValue()));
    double _plus_5 = (_minus_6 + 0.8539);
    this.setFmp(Double.valueOf(_plus_5));
    Double _fmp = this.getFmp();
    boolean _greaterThan_2 = ((_fmp).doubleValue() > 1);
    if (_greaterThan_2) {
      this.setFmp(Double.valueOf(1.0));
    }
    double _pow_8 = Math.pow((temperature_grad).doubleValue(), 2);
    double _multiply_8 = (0.6208 * _pow_8);
    double _minus_7 = (_multiply_8 - (31.738 * (temperature_grad).doubleValue()));
    double cycle_gon = (_minus_7 + 409.42);
    this.setFaov(Double.valueOf((1 / cycle_gon)));
    if (((temperature_grad).doubleValue() < 15)) {
      double _pow_9 = Math.pow((temperature_grad).doubleValue(), 2);
      double _multiply_9 = ((-0.002) * _pow_9);
      double _plus_6 = (_multiply_9 + (0.0727 * (temperature_grad).doubleValue()));
      double _plus_7 = (_plus_6 + 0.3232);
      this.setFma(Double.valueOf(_plus_7));
      Double _fma = this.getFma();
      double _minus_8 = (1 - (_fma).doubleValue());
      this.setFma(Double.valueOf(_minus_8));
    }
    if ((((temperature_grad).doubleValue() > 15) && ((temperature_grad).doubleValue() < 35))) {
      double _pow_10 = Math.pow((temperature_grad).doubleValue(), 2);
      double _multiply_10 = (0.0002 * _pow_10);
      double _minus_9 = (_multiply_10 - (0.016 * (temperature_grad).doubleValue()));
      double _plus_8 = (_minus_9 + 1.155);
      this.setFma(Double.valueOf(_plus_8));
      Double _fma_1 = this.getFma();
      double _minus_10 = (1 - (_fma_1).doubleValue());
      this.setFma(Double.valueOf(_minus_10));
    }
    if (((temperature_grad).doubleValue() > 35)) {
      double _pow_11 = Math.pow((temperature_grad).doubleValue(), 2);
      double _multiply_11 = ((-0.0068) * _pow_11);
      double _plus_9 = (_multiply_11 + (0.4054 * (temperature_grad).doubleValue()));
      double _minus_11 = (_plus_9 - 4.9906);
      this.setFma(Double.valueOf(_minus_11));
      Double _fma_2 = this.getFma();
      double _minus_12 = (1 - (_fma_2).doubleValue());
      this.setFma(Double.valueOf(_minus_12));
    }
    Double _fma_3 = this.getFma();
    boolean _greaterThan_3 = ((_fma_3).doubleValue() > 0.99);
    if (_greaterThan_3) {
      this.setFma(Double.valueOf(0.99));
    }
    Double _fma_4 = this.getFma();
    boolean _lessThan_2 = ((_fma_4).doubleValue() < 0.0);
    if (_lessThan_2) {
      this.setFma(Double.valueOf(0.0));
    }
  }
  
  public void dynPop(final Double dt) {
    long _round = Math.round((1 / (dt).doubleValue()));
    int npastemps = Long.valueOf(_round).intValue();
    Double x1 = this.getEggs();
    Double x2 = this.getLarvae();
    Double x3 = this.getPupae();
    Double x4 = this.getAdults();
    Double x5 = this.getAdults_ov();
    double k1 = 0.0;
    double l1 = 0.0;
    double m1 = 0.0;
    double n1 = 0.0;
    double o1 = 0.0;
    IntegerRange _upTo = new IntegerRange(1, npastemps);
    for (final Integer y : _upTo) {
      {
        Integer _fpon = this.getFpon();
        double _multiply = DoubleExtensions.operator_multiply(x5, _fpon);
        Double _fegg = this.getFegg();
        double _multiply_1 = DoubleExtensions.operator_multiply(x1, _fegg);
        double _minus = (_multiply - _multiply_1);
        Double _fme = this.getFme();
        double _multiply_2 = DoubleExtensions.operator_multiply(x1, _fme);
        double _minus_1 = (_minus - _multiply_2);
        k1 = _minus_1;
        Double _fegg_1 = this.getFegg();
        double _multiply_3 = DoubleExtensions.operator_multiply(x1, _fegg_1);
        Double _flarvae = this.getFlarvae();
        double _multiply_4 = DoubleExtensions.operator_multiply(x2, _flarvae);
        double _minus_2 = (_multiply_3 - _multiply_4);
        Double _fml = this.getFml();
        double _multiply_5 = DoubleExtensions.operator_multiply(x2, _fml);
        Integer _kl = this.getKl();
        double _divide = DoubleExtensions.operator_divide(x2, _kl);
        double _plus = (1 + _divide);
        double _multiply_6 = (_multiply_5 * _plus);
        double _minus_3 = (_minus_2 - _multiply_6);
        l1 = _minus_3;
        Double _flarvae_1 = this.getFlarvae();
        double _multiply_7 = DoubleExtensions.operator_multiply(x2, _flarvae_1);
        Double _fpupae = this.getFpupae();
        double _multiply_8 = DoubleExtensions.operator_multiply(x3, _fpupae);
        double _minus_4 = (_multiply_7 - _multiply_8);
        Double _fmp = this.getFmp();
        double _multiply_9 = DoubleExtensions.operator_multiply(x3, _fmp);
        double _minus_5 = (_minus_4 - _multiply_9);
        m1 = _minus_5;
        Double _fpupae_1 = this.getFpupae();
        double _multiply_10 = DoubleExtensions.operator_multiply(x3, _fpupae_1);
        Double _faov = this.getFaov();
        double _multiply_11 = DoubleExtensions.operator_multiply(x4, _faov);
        double _minus_6 = (_multiply_10 - _multiply_11);
        Double _fma = this.getFma();
        double _multiply_12 = DoubleExtensions.operator_multiply(x4, _fma);
        double _minus_7 = (_minus_6 - _multiply_12);
        double _plus_1 = (_minus_7 + (x5).doubleValue());
        n1 = _plus_1;
        Double _faov_1 = this.getFaov();
        double _multiply_13 = DoubleExtensions.operator_multiply(x4, _faov_1);
        double _minus_8 = (_multiply_13 - (x5).doubleValue());
        o1 = _minus_8;
        double k = ((x1).doubleValue() + ((dt).doubleValue() * k1));
        double l = ((x2).doubleValue() + ((dt).doubleValue() * l1));
        double m = ((x3).doubleValue() + ((dt).doubleValue() * m1));
        double n = ((x4).doubleValue() + ((dt).doubleValue() * n1));
        double o = ((x5).doubleValue() + ((dt).doubleValue() * o1));
        x1 = Double.valueOf(k);
        x2 = Double.valueOf(l);
        x3 = Double.valueOf(m);
        x4 = Double.valueOf(n);
        x5 = Double.valueOf(o);
      }
    }
    this.setEggs(x1);
    this.setLarvae(x2);
    this.setPupae(x3);
    this.setAdults(x4);
    this.setAdults_ov(x5);
  }
  
  public void classify() {
    Double _adults = this.getAdults();
    boolean _lessThan = ((_adults).doubleValue() < 50);
    if (_lessThan) {
      this.setClassCuli(Integer.valueOf(1));
    }
    boolean _and = false;
    Double _adults_1 = this.getAdults();
    boolean _greaterEqualsThan = ((_adults_1).doubleValue() >= 50);
    if (!_greaterEqualsThan) {
      _and = false;
    } else {
      Double _adults_2 = this.getAdults();
      boolean _lessThan_1 = ((_adults_2).doubleValue() < 100);
      _and = _lessThan_1;
    }
    if (_and) {
      this.setClassCuli(Integer.valueOf(2));
    }
    boolean _and_1 = false;
    Double _adults_3 = this.getAdults();
    boolean _greaterEqualsThan_1 = ((_adults_3).doubleValue() >= 100);
    if (!_greaterEqualsThan_1) {
      _and_1 = false;
    } else {
      Double _adults_4 = this.getAdults();
      boolean _lessThan_2 = ((_adults_4).doubleValue() < 200);
      _and_1 = _lessThan_2;
    }
    if (_and_1) {
      this.setClassCuli(Integer.valueOf(3));
    }
    boolean _and_2 = false;
    Double _adults_5 = this.getAdults();
    boolean _greaterEqualsThan_2 = ((_adults_5).doubleValue() >= 200);
    if (!_greaterEqualsThan_2) {
      _and_2 = false;
    } else {
      Double _adults_6 = this.getAdults();
      boolean _lessThan_3 = ((_adults_6).doubleValue() < 300);
      _and_2 = _lessThan_3;
    }
    if (_and_2) {
      this.setClassCuli(Integer.valueOf(4));
    }
    Double _adults_7 = this.getAdults();
    boolean _greaterEqualsThan_3 = ((_adults_7).doubleValue() >= 300);
    if (_greaterEqualsThan_3) {
      this.setClassCuli(Integer.valueOf(5));
    }
  }
  
  public void outputKml(final Integer day, final Date now, final Integer frequencedisplay, final KmlExport kml) {
    Integer _id = this.getId();
    String _plus = ("Site" + _id);
    String _plus_1 = (_plus + "_");
    String _string = now.toString("yyyy-MM-dd");
    String id = (_plus_1 + _string);
    Integer _classCuli = this.getClassCuli();
    String style = ("R0_" + _classCuli);
    Date deb = now;
    Date fin = now.clone();
    fin.addDays((frequencedisplay).intValue());
    Point _geom = this.getGeom();
    kml.addGeometry(style, id, deb, fin, _geom, style, 0);
  }
  
  public Site() {
    super();
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("commune",new Hproperty<String>());
    setCommune(new String());
    defProperty("altitude",new Hproperty<Integer>());
    setAltitude(new Integer("0"));
    defProperty("diff_alt",new Hproperty<Integer>());
    setDiff_alt(new Integer("0"));
    defProperty("kl",new Hproperty<Integer>());
    setKl(new Integer("0"));
    defProperty("nom",new Hproperty<String>());
    setNom(new String());
    defProperty("presence_animaux",new Hproperty<String>());
    setPresence_animaux(new String());
    defProperty("zone_veg",new Hproperty<String>());
    setZone_veg(new String());
    defProperty("occsol",new Hproperty<String>());
    setOccsol(new String());
    defProperty("eau_500",new Hproperty<Double>());
    setEau_500(new Double("0"));
    defProperty("eau_1000",new Hproperty<Double>());
    setEau_1000(new Double("0"));
    defProperty("eau_2000",new Hproperty<Double>());
    setEau_2000(new Double("0"));
    defProperty("ndvi",new Hproperty<Integer>());
    setNdvi(new Integer("0"));
    defProperty("geom",new Hproperty<Point>());
    setGeom(new Point());
    defProperty("date_begin",new Hproperty<String>());
    setDate_begin(new String());
    defProperty("date_end",new Hproperty<String>());
    setDate_end(new String());
    defProperty("nom_station",new Hproperty<String>());
    setNom_station(new String());
    defProperty("dist_station",new Hproperty<Double>());
    setDist_station(new Double("0"));
    defProperty("id_station",new Hproperty<Integer>());
    setId_station(new Integer("0"));
    defProperty("num_station",new Hproperty<Long>());
    setNum_station(new Long("0"));
    defProperty("dist_station_h",new Hproperty<Double>());
    setDist_station_h(new Double("0"));
    defProperty("id_station_h",new Hproperty<Integer>());
    setId_station_h(new Integer("0"));
    defProperty("num_station_h",new Hproperty<Long>());
    setNum_station_h(new Long("0"));
    defProperty("eggs",new Hproperty<Double>());
    setEggs(new Double("0"));
    defProperty("larvae",new Hproperty<Double>());
    setLarvae(new Double("0"));
    defProperty("pupae",new Hproperty<Double>());
    setPupae(new Double("0"));
    defProperty("adults",new Hproperty<Double>());
    setAdults(new Double("0"));
    defProperty("adults_ov",new Hproperty<Double>());
    setAdults_ov(new Double("0"));
    defProperty("prob_imicola",new Hproperty<Double>());
    setProb_imicola(new Double("0"));
    defProperty("imicola",new Hproperty<Double>());
    setImicola(new Double("0"));
    defProperty("fpon",new Hproperty<Integer>());
    setFpon(new Integer("0"));
    defProperty("fegg",new Hproperty<Double>());
    setFegg(new Double("0"));
    defProperty("flarvae",new Hproperty<Double>());
    setFlarvae(new Double("0"));
    defProperty("fpupae",new Hproperty<Double>());
    setFpupae(new Double("0"));
    defProperty("faov",new Hproperty<Double>());
    setFaov(new Double("0"));
    defProperty("fme",new Hproperty<Double>());
    setFme(new Double("0"));
    defProperty("fml",new Hproperty<Double>());
    setFml(new Double("0"));
    defProperty("fmp",new Hproperty<Double>());
    setFmp(new Double("0"));
    defProperty("fma",new Hproperty<Double>());
    setFma(new Double("0"));
    defProperty("temperature",new Hproperty<Double>());
    setTemperature(new Double("0"));
    defProperty("temperature_grad",new Hproperty<Double>());
    setTemperature_grad(new Double("0"));
    defProperty("rain",new Hproperty<Double>());
    setRain(new Double("0"));
    defProperty("rain7",new Hproperty<Double>());
    setRain7(new Double("0"));
    defProperty("rainmoy4_5",new Hproperty<Double>());
    setRainmoy4_5(new Double("0"));
    defProperty("tmin",new Hproperty<Double>());
    setTmin(new Double("0"));
    defProperty("tmax",new Hproperty<Double>());
    setTmax(new Double("0"));
    defProperty("classCuli",new Hproperty<Integer>());
    setClassCuli(new Integer("0"));
    defProperty("date",new Hproperty<Date>());
    setDate(new Date());
    defProperty("ktmin",new Hproperty<KeyMap<Date, Double>>());
    setKtmin(new KeyMap<Date, Double>());
    defProperty("tmoy0_17",new Hproperty<Double>());
    setTmoy0_17(new Double("0"));
    defProperty("tmoy16_18",new Hproperty<Double>());
    setTmoy16_18(new Double("0"));
    defProperty("tmin0_14",new Hproperty<Double>());
    setTmin0_14(new Double("0"));
    defProperty("tmax0_2",new Hproperty<Double>());
    setTmax0_2(new Double("0"));
    defProperty("tmax0_14",new Hproperty<Double>());
    setTmax0_14(new Double("0"));
    defProperty("tmax1_19",new Hproperty<Double>());
    setTmax1_19(new Double("0"));
    defProperty("tmax_11",new Hproperty<Double>());
    setTmax_11(new Double("0"));
    defProperty("humidite",new Hproperty<Double>());
    setHumidite(new Double("0"));
  }
}
