package fr.ocelet.model.dynpopculicoides;

import com.google.common.base.Objects;
import fr.ocelet.datafacer.ocltypes.KmlExport;
import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.geom.ocltypes.Point;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.KeyMap;
import fr.ocelet.runtime.ocltypes.List;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Site extends AbstractEntity {
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setPl(final String pl) {
    setProperty("pl",pl);
  }
  
  public String getPl() {
    return getProperty("pl");
  }
  
  public void setCommune(final String commune) {
    setProperty("commune",commune);
  }
  
  public String getCommune() {
    return getProperty("commune");
  }
  
  public void setAltitude(final Double altitude) {
    setProperty("altitude",altitude);
  }
  
  public Double getAltitude() {
    return getProperty("altitude");
  }
  
  public void setDiff_alt(final Double diff_alt) {
    setProperty("diff_alt",diff_alt);
  }
  
  public Double getDiff_alt() {
    return getProperty("diff_alt");
  }
  
  public void setCoeff_alt(final Double coeff_alt) {
    setProperty("coeff_alt",coeff_alt);
  }
  
  public Double getCoeff_alt() {
    return getProperty("coeff_alt");
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
  
  public void setNdvi_id(final Integer ndvi_id) {
    setProperty("ndvi_id",ndvi_id);
  }
  
  public Integer getNdvi_id() {
    return getProperty("ndvi_id");
  }
  
  public void setNdvi_26(final Integer ndvi_26) {
    setProperty("ndvi_26",ndvi_26);
  }
  
  public Integer getNdvi_26() {
    return getProperty("ndvi_26");
  }
  
  public void setNdvi_map(final KeyMap<Integer, Integer> ndvi_map) {
    setProperty("ndvi_map",ndvi_map);
  }
  
  public KeyMap<Integer, Integer> getNdvi_map() {
    return getProperty("ndvi_map");
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
  
  public void setDist_station_v(final Double dist_station_v) {
    setProperty("dist_station_v",dist_station_v);
  }
  
  public Double getDist_station_v() {
    return getProperty("dist_station_v");
  }
  
  public void setId_station_v(final Integer id_station_v) {
    setProperty("id_station_v",id_station_v);
  }
  
  public Integer getId_station_v() {
    return getProperty("id_station_v");
  }
  
  public void setNum_station_v(final Long num_station_v) {
    setProperty("num_station_v",num_station_v);
  }
  
  public Long getNum_station_v() {
    return getProperty("num_station_v");
  }
  
  public void setProb_bolitinos(final Double prob_bolitinos) {
    setProperty("prob_bolitinos",prob_bolitinos);
  }
  
  public Double getProb_bolitinos() {
    return getProperty("prob_bolitinos");
  }
  
  public void setBolitinos(final Double bolitinos) {
    setProperty("bolitinos",bolitinos);
  }
  
  public Double getBolitinos() {
    return getProperty("bolitinos");
  }
  
  public void setProb_enderleini(final Double prob_enderleini) {
    setProperty("prob_enderleini",prob_enderleini);
  }
  
  public Double getProb_enderleini() {
    return getProperty("prob_enderleini");
  }
  
  public void setEnderleini(final Double enderleini) {
    setProperty("enderleini",enderleini);
  }
  
  public Double getEnderleini() {
    return getProperty("enderleini");
  }
  
  public void setProb_grahamii(final Double prob_grahamii) {
    setProperty("prob_grahamii",prob_grahamii);
  }
  
  public Double getProb_grahamii() {
    return getProperty("prob_grahamii");
  }
  
  public void setGrahamii(final Double grahamii) {
    setProperty("grahamii",grahamii);
  }
  
  public Double getGrahamii() {
    return getProperty("grahamii");
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
  
  public void setProb_kibatiensis(final Double prob_kibatiensis) {
    setProperty("prob_kibatiensis",prob_kibatiensis);
  }
  
  public Double getProb_kibatiensis() {
    return getProperty("prob_kibatiensis");
  }
  
  public void setKibatiensis(final Double kibatiensis) {
    setProperty("kibatiensis",kibatiensis);
  }
  
  public Double getKibatiensis() {
    return getProperty("kibatiensis");
  }
  
  public void setSeuil_pres(final Double seuil_pres) {
    setProperty("seuil_pres",seuil_pres);
  }
  
  public Double getSeuil_pres() {
    return getProperty("seuil_pres");
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
  
  public void setRainlog1_2(final Double rainlog1_2) {
    setProperty("rainlog1_2",rainlog1_2);
  }
  
  public Double getRainlog1_2() {
    return getProperty("rainlog1_2");
  }
  
  public void setRain_8(final Double rain_8) {
    setProperty("rain_8",rain_8);
  }
  
  public Double getRain_8() {
    return getProperty("rain_8");
  }
  
  public void setRain_20(final Double rain_20) {
    setProperty("rain_20",rain_20);
  }
  
  public Double getRain_20() {
    return getProperty("rain_20");
  }
  
  public void setRain_28(final Double rain_28) {
    setProperty("rain_28",rain_28);
  }
  
  public Double getRain_28() {
    return getProperty("rain_28");
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
  
  public void setTmoymax0_2(final Double tmoymax0_2) {
    setProperty("tmoymax0_2",tmoymax0_2);
  }
  
  public Double getTmoymax0_2() {
    return getProperty("tmoymax0_2");
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
  
  public void setHumidite(final Double humidite) {
    setProperty("humidite",humidite);
  }
  
  public Double getHumidite() {
    return getProperty("humidite");
  }
  
  public void setMesure_vent(final String mesure_vent) {
    setProperty("mesure_vent",mesure_vent);
  }
  
  public String getMesure_vent() {
    return getProperty("mesure_vent");
  }
  
  public void setVent(final Double vent) {
    setProperty("vent",vent);
  }
  
  public Double getVent() {
    return getProperty("vent");
  }
  
  public void setVent_1(final Double vent_1) {
    setProperty("vent_1",vent_1);
  }
  
  public Double getVent_1() {
    return getProperty("vent_1");
  }
  
  public void setVoisin_ndvi(final Integer voisin_ndvi) {
    setProperty("voisin_ndvi",voisin_ndvi);
  }
  
  public Integer getVoisin_ndvi() {
    return getProperty("voisin_ndvi");
  }
  
  public void updateTemp() {
    Double _tmin = this.getTmin();
    Double _tmax = this.getTmax();
    double _plus = DoubleExtensions.operator_plus(_tmin, _tmax);
    double _divide = (_plus / 2);
    this.setTemperature(Double.valueOf(_divide));
  }
  
  public void gradientAlt(final Double temperature) {
    Double _diff_alt = this.getDiff_alt();
    double _multiply = ((_diff_alt).doubleValue() * (6.5 / 1000));
    double _minus = ((temperature).doubleValue() - _multiply);
    this.setTemperature_grad(Double.valueOf(_minus));
  }
  
  public void gradAlt() {
    Double _diff_alt = this.getDiff_alt();
    double _multiply = ((_diff_alt).doubleValue() * (6.5 / 1000));
    this.setCoeff_alt(Double.valueOf(_multiply));
  }
  
  public void attributionNdvi(final List<Site> ls) {
    Integer _ndvi = this.getNdvi();
    boolean _equals = ((_ndvi).intValue() == (-99999));
    if (_equals) {
      double dist = 100000.0;
      for (final Site l : ls) {
        if ((((this.getGeom().distance(l.getGeom()) < dist) && ((l.getNdvi()).intValue() != (-99999))) && (!Objects.equal(l.getId(), this.getId())))) {
          dist = this.getGeom().distance(l.getGeom());
          this.setNdvi(l.getNdvi());
          this.setNdvi_id(l.getId());
          InputOutput.<String>println("ndvi attributed");
        }
      }
    } else {
      this.setNdvi_id(Integer.valueOf(0));
    }
  }
  
  public void fillNdviMap(final Integer a, final Integer b) {
    this.getNdvi_map().put(a, b);
  }
  
  public void calcBolitinos() {
    double class_ndvi = 0.0;
    if ((((this.getNdvi()).intValue() > 5690) && ((this.getNdvi()).intValue() < 6650))) {
      class_ndvi = 0.62374;
    }
    if ((((this.getNdvi()).intValue() > 6650) && ((this.getNdvi()).intValue() < 7380))) {
      class_ndvi = 0.79835;
    }
    if ((((this.getNdvi()).intValue() > 7380) && ((this.getNdvi()).intValue() < 7850))) {
      class_ndvi = 0.86642;
    }
    Integer _ndvi = this.getNdvi();
    boolean _greaterThan = ((_ndvi).intValue() > 7850);
    if (_greaterThan) {
      class_ndvi = 1.97628;
    }
    double corine = 0.0;
    String _occsol = this.getOccsol();
    boolean _equals = Objects.equal(_occsol, "2430");
    if (_equals) {
      corine = 2.19826;
    }
    String _occsol_1 = this.getOccsol();
    boolean _equals_1 = Objects.equal(_occsol_1, "2112");
    if (_equals_1) {
      corine = 0.0;
    }
    String _occsol_2 = this.getOccsol();
    boolean _equals_2 = Objects.equal(_occsol_2, "2310");
    if (_equals_2) {
      corine = 2.21140;
    }
    String _occsol_3 = this.getOccsol();
    boolean _equals_3 = Objects.equal(_occsol_3, "2420");
    if (_equals_3) {
      corine = 2.92347;
    }
    String _occsol_4 = this.getOccsol();
    boolean _equals_4 = Objects.equal(_occsol_4, "1120");
    if (_equals_4) {
      corine = 5.36079;
    }
    InputOutput.<String>println(("corine :" + Double.valueOf(corine)));
    double animaux = 0.0;
    String _presence_animaux = this.getPresence_animaux();
    boolean _equals_5 = Objects.equal(_presence_animaux, "Intdrieur");
    if (_equals_5) {
      animaux = 0.19408;
    }
    String _presence_animaux_1 = this.getPresence_animaux();
    boolean _equals_6 = Objects.equal(_presence_animaux_1, "Extdrieur");
    if (_equals_6) {
      animaux = 0.20025;
    }
    if (((Objects.equal(this.getPresence_animaux(), "Intdrieur & Extirieur") || Objects.equal(this.getPresence_animaux(), "Intdrieur & Exterieur")) || Objects.equal(this.getPresence_animaux(), "Intdrieur & Etxnrieur"))) {
      animaux = 1.82176;
    }
    InputOutput.<String>println(("animaux: " + Double.valueOf(animaux)));
    Double _rainlog1_2 = this.getRainlog1_2();
    double _multiply = ((_rainlog1_2).doubleValue() * (-0.68293));
    double _plus = ((-7.51177) + _multiply);
    Double _tmin0_14 = this.getTmin0_14();
    double _multiply_1 = ((_tmin0_14).doubleValue() * 0.28132);
    double _plus_1 = (_plus + _multiply_1);
    double _plus_2 = (_plus_1 + corine);
    double p = (_plus_2 + animaux);
    double _exp = Math.exp(p);
    double _exp_1 = Math.exp(p);
    double _plus_3 = (1 + _exp_1);
    double _divide = (_exp / _plus_3);
    this.setProb_bolitinos(Double.valueOf(_divide));
    Double _prob_bolitinos = this.getProb_bolitinos();
    String _plus_4 = ("prob bolitinos: " + _prob_bolitinos);
    InputOutput.<String>println(_plus_4);
    Double _prob_bolitinos_1 = this.getProb_bolitinos();
    Double _seuil_pres = this.getSeuil_pres();
    boolean _lessThan = (_prob_bolitinos_1.compareTo(_seuil_pres) < 0);
    if (_lessThan) {
      this.setBolitinos(Double.valueOf(0.0));
    }
  }
  
  public void calcEnderleini() {
    double class_ndvi = 0.0;
    if ((((this.getNdvi()).intValue() > 6070) && ((this.getNdvi()).intValue() < 7690))) {
      class_ndvi = (-1.71775);
    }
    Integer _ndvi = this.getNdvi();
    boolean _greaterThan = ((_ndvi).intValue() > 7690);
    if (_greaterThan) {
      class_ndvi = (-0.71894);
    }
    double animaux = 0.0;
    String _presence_animaux = this.getPresence_animaux();
    boolean _equals = Objects.equal(_presence_animaux, "Extdrieur");
    if (_equals) {
      animaux = 2.73359;
    }
    if (((Objects.equal(this.getPresence_animaux(), "Intdrieur & Extirieur") || Objects.equal(this.getPresence_animaux(), "Intdrieur & Exterieur")) || Objects.equal(this.getPresence_animaux(), "Intdrieur & Etxnrieur"))) {
      animaux = 3.66219;
    }
    Double _tmoy16_18 = this.getTmoy16_18();
    double _multiply = ((_tmoy16_18).doubleValue() * 0.49397);
    double _plus = ((-24.10444) + _multiply);
    Double _tmoymax0_2 = this.getTmoymax0_2();
    double _multiply_1 = ((_tmoymax0_2).doubleValue() * 0.42819);
    double _plus_1 = (_plus + _multiply_1);
    Double _humidite = this.getHumidite();
    double _multiply_2 = ((_humidite).doubleValue() * (-0.06037));
    double _plus_2 = (_plus_1 + _multiply_2);
    Double _rain_20 = this.getRain_20();
    double _multiply_3 = ((_rain_20).doubleValue() * 0.06346);
    double _plus_3 = (_plus_2 + _multiply_3);
    double _plus_4 = (_plus_3 + class_ndvi);
    double _plus_5 = (_plus_4 + animaux);
    Double _eau_500 = this.getEau_500();
    double _multiply_4 = ((_eau_500).doubleValue() * 1.36678);
    double p = (_plus_5 + _multiply_4);
    double _exp = Math.exp(p);
    double _exp_1 = Math.exp(p);
    double _plus_6 = (1 + _exp_1);
    double _divide = (_exp / _plus_6);
    this.setProb_enderleini(Double.valueOf(_divide));
    Double _prob_enderleini = this.getProb_enderleini();
    Double _seuil_pres = this.getSeuil_pres();
    boolean _lessThan = (_prob_enderleini.compareTo(_seuil_pres) < 0);
    if (_lessThan) {
      this.setEnderleini(Double.valueOf(0.0));
    }
  }
  
  public void calcGrahamii() {
    double class_ndvi = 0.0;
    if ((((this.getNdvi()).intValue() > 6070) && ((this.getNdvi()).intValue() < 7060))) {
      class_ndvi = 1.32130;
    }
    if ((((this.getNdvi()).intValue() > 7060) && ((this.getNdvi()).intValue() < 7690))) {
      class_ndvi = 0.83841;
    }
    Integer _ndvi = this.getNdvi();
    boolean _greaterThan = ((_ndvi).intValue() > 7690);
    if (_greaterThan) {
      class_ndvi = 1.99477;
    }
    double corine = 0.0;
    String _occsol = this.getOccsol();
    boolean _equals = Objects.equal(_occsol, "2430");
    if (_equals) {
      corine = 0.0;
    }
    String _occsol_1 = this.getOccsol();
    boolean _equals_1 = Objects.equal(_occsol_1, "2112");
    if (_equals_1) {
      corine = 1.46914;
    }
    String _occsol_2 = this.getOccsol();
    boolean _equals_2 = Objects.equal(_occsol_2, "2310");
    if (_equals_2) {
      corine = 2.07308;
    }
    String _occsol_3 = this.getOccsol();
    boolean _equals_3 = Objects.equal(_occsol_3, "2420");
    if (_equals_3) {
      corine = 3.50849;
    }
    String _occsol_4 = this.getOccsol();
    boolean _equals_4 = Objects.equal(_occsol_4, "1120");
    if (_equals_4) {
      corine = 4.27313;
    }
    Double _tmax_11 = this.getTmax_11();
    double _multiply = ((_tmax_11).doubleValue() * (-0.22395));
    double _plus = (2.11346 + _multiply);
    Double _humidite = this.getHumidite();
    double _multiply_1 = ((_humidite).doubleValue() * (-0.03525));
    double _plus_1 = (_plus + _multiply_1);
    Double _rain_28 = this.getRain_28();
    double _multiply_2 = ((_rain_28).doubleValue() * 0.03331);
    double _plus_2 = (_plus_1 + _multiply_2);
    double _plus_3 = (_plus_2 + class_ndvi);
    double _plus_4 = (_plus_3 + corine);
    Double _eau_1000 = this.getEau_1000();
    double _multiply_3 = ((_eau_1000).doubleValue() * 0.27201);
    double p = (_plus_4 + _multiply_3);
    double _exp = Math.exp(p);
    double _exp_1 = Math.exp(p);
    double _plus_5 = (1 + _exp_1);
    double _divide = (_exp / _plus_5);
    this.setProb_grahamii(Double.valueOf(_divide));
    Double _prob_grahamii = this.getProb_grahamii();
    Double _seuil_pres = this.getSeuil_pres();
    boolean _lessThan = (_prob_grahamii.compareTo(_seuil_pres) < 0);
    if (_lessThan) {
      this.setGrahamii(Double.valueOf(0.0));
    }
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
    InputOutput.<String>print(("daupi :" + Double.valueOf(daupi)));
    double animaux = 0.0;
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
    if (((Objects.equal(this.getPresence_animaux(), "Intdrieur & Extirieur") || Objects.equal(this.getPresence_animaux(), "Intdrieur & Exterieur")) || Objects.equal(this.getPresence_animaux(), "Intdrieur & Etxnrieur"))) {
      animaux = 2.66738;
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
    this.setProb_imicola(Double.valueOf(prob));
    InputOutput.<String>println(("prob: " + Double.valueOf(prob)));
    Double _seuil_pres = this.getSeuil_pres();
    boolean _lessThan = (prob < (_seuil_pres).doubleValue());
    if (_lessThan) {
      this.setImicola(Double.valueOf(0.0));
    }
    Double _seuil_pres_1 = this.getSeuil_pres();
    boolean _greaterEqualsThan = (prob >= (_seuil_pres_1).doubleValue());
    if (_greaterEqualsThan) {
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
      String _plus_20 = (_plus_19 + _eau_1000_1);
      String _plus_21 = (_plus_20 + "; eau_2000: ");
      Double _eau_2000_1 = this.getEau_2000();
      String _plus_22 = (_plus_21 + _eau_2000_1);
      InputOutput.<String>println(_plus_22);
      InputOutput.<String>println(("z: " + Double.valueOf(z)));
      this.setImicola(Double.valueOf(Math.pow(10, (z - 1))));
    }
  }
  
  public void calcKibatiensis() {
    double tmin_qual = 0.0;
    if ((((this.getTmax0_14()).doubleValue() > 8.46) && ((this.getTmax0_14()).doubleValue() < 12.2))) {
      tmin_qual = 1.9955767;
    }
    if ((((this.getTmax0_14()).doubleValue() > 12.2) && ((this.getTmax0_14()).doubleValue() < 16.0))) {
      tmin_qual = 0.2488846;
    }
    if ((((this.getTmax0_14()).doubleValue() > 16.0) && ((this.getTmax0_14()).doubleValue() < 18.9))) {
      tmin_qual = 0.5042979;
    }
    Double _tmax0_14 = this.getTmax0_14();
    boolean _greaterThan = ((_tmax0_14).doubleValue() > 18.9);
    if (_greaterThan) {
      tmin_qual = (-0.8201423);
    }
    double corine = 0.0;
    String _occsol = this.getOccsol();
    boolean _equals = Objects.equal(_occsol, "2430");
    if (_equals) {
      corine = 1.4202163;
    }
    String _occsol_1 = this.getOccsol();
    boolean _equals_1 = Objects.equal(_occsol_1, "2112");
    if (_equals_1) {
      corine = 0.0;
    }
    String _occsol_2 = this.getOccsol();
    boolean _equals_2 = Objects.equal(_occsol_2, "2310");
    if (_equals_2) {
      corine = 3.0061298;
    }
    String _occsol_3 = this.getOccsol();
    boolean _equals_3 = Objects.equal(_occsol_3, "2420");
    if (_equals_3) {
      corine = 1.5044477;
    }
    String _occsol_4 = this.getOccsol();
    boolean _equals_4 = Objects.equal(_occsol_4, "1120");
    if (_equals_4) {
      corine = 3.2433749;
    }
    double pluie = 0.0;
    Double _rain = this.getRain();
    boolean _greaterThan_1 = ((_rain).doubleValue() > 0.0);
    if (_greaterThan_1) {
      pluie = 0.8705422;
    }
    double wind_1 = 0.0;
    if (((((this.getVent_1()).doubleValue() < 0.28) && Objects.equal(this.getMesure_vent(), "2")) || (((this.getVent_1()).doubleValue() < 2.60) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind_1 = 0.0;
    }
    if ((((((this.getVent_1()).doubleValue() > 0.28) && ((this.getVent_1()).doubleValue() < 0.97)) && Objects.equal(this.getMesure_vent(), "2")) || ((((this.getVent_1()).doubleValue() > 2.60) && ((this.getVent_1()).doubleValue() < 5.80)) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind_1 = (-0.7224247);
    }
    if ((((((this.getVent_1()).doubleValue() > 0.97) && ((this.getVent_1()).doubleValue() < 1.66)) && Objects.equal(this.getMesure_vent(), "2")) || ((((this.getVent_1()).doubleValue() > 5.80) && ((this.getVent_1()).doubleValue() < 8.99)) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind_1 = (-1.5564980);
    }
    if (((((this.getVent_1()).doubleValue() > 1.66) && Objects.equal(this.getMesure_vent(), "2")) || (((this.getVent_1()).doubleValue() > 8.99) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind_1 = (-0.0513435);
    }
    double wind = 0.0;
    if (((((this.getVent()).doubleValue() < 0.28) && Objects.equal(this.getMesure_vent(), "2")) || (((this.getVent()).doubleValue() < 2.60) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind = 0.0;
    }
    if ((((((this.getVent()).doubleValue() > 0.28) && ((this.getVent()).doubleValue() < 0.97)) && Objects.equal(this.getMesure_vent(), "2")) || ((((this.getVent()).doubleValue() > 2.60) && ((this.getVent()).doubleValue() < 5.80)) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind = 0.2876684;
    }
    if (((((this.getVent()).doubleValue() > 0.97) && Objects.equal(this.getMesure_vent(), "2")) || (((this.getVent()).doubleValue() > 5.80) && Objects.equal(this.getMesure_vent(), "10")))) {
      wind = (-0.86293340);
    }
    Double _humidite = this.getHumidite();
    double _multiply = ((_humidite).doubleValue() * (-0.0394085));
    double _plus = (((-2.8243244) + tmin_qual) + _multiply);
    Double _rain_8 = this.getRain_8();
    double _multiply_1 = ((_rain_8).doubleValue() * 0.0953447);
    double _plus_1 = (_plus + _multiply_1);
    double _plus_2 = (_plus_1 + pluie);
    double _plus_3 = (_plus_2 + wind);
    double _plus_4 = (_plus_3 + wind_1);
    Integer _ndvi_26 = this.getNdvi_26();
    double _multiply_2 = ((_ndvi_26).intValue() * 0.0005190);
    double _plus_5 = (_plus_4 + _multiply_2);
    double _plus_6 = (_plus_5 + corine);
    Double _eau_500 = this.getEau_500();
    double _multiply_3 = ((_eau_500).doubleValue() * 0.6277210);
    double p = (_plus_6 + _multiply_3);
    double _exp = Math.exp(p);
    double _exp_1 = Math.exp(p);
    double _plus_7 = (1 + _exp_1);
    double _divide = (_exp / _plus_7);
    this.setProb_kibatiensis(Double.valueOf(_divide));
  }
  
  public void classify() {
    Double _prob_bolitinos = this.getProb_bolitinos();
    boolean _lessThan = ((_prob_bolitinos).doubleValue() < 0.50);
    if (_lessThan) {
      this.setClassCuli(Integer.valueOf(1));
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
    kml.addGeometry(style, id, deb, fin, this.getGeom(), style, 0);
  }
  
  public Site() {
    super();
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("pl",new Hproperty<String>());
    setPl(new String());
    defProperty("commune",new Hproperty<String>());
    setCommune(new String());
    defProperty("altitude",new Hproperty<Double>());
    setAltitude(new Double("0"));
    defProperty("diff_alt",new Hproperty<Double>());
    setDiff_alt(new Double("0"));
    defProperty("coeff_alt",new Hproperty<Double>());
    setCoeff_alt(new Double("0"));
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
    defProperty("ndvi_id",new Hproperty<Integer>());
    setNdvi_id(new Integer("0"));
    defProperty("ndvi_26",new Hproperty<Integer>());
    setNdvi_26(new Integer("0"));
    defProperty("ndvi_map",new Hproperty<KeyMap<Integer, Integer>>());
    setNdvi_map(new KeyMap<Integer, Integer>());
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
    defProperty("dist_station_v",new Hproperty<Double>());
    setDist_station_v(new Double("0"));
    defProperty("id_station_v",new Hproperty<Integer>());
    setId_station_v(new Integer("0"));
    defProperty("num_station_v",new Hproperty<Long>());
    setNum_station_v(new Long("0"));
    defProperty("prob_bolitinos",new Hproperty<Double>());
    setProb_bolitinos(new Double("0"));
    defProperty("bolitinos",new Hproperty<Double>());
    setBolitinos(new Double("0"));
    defProperty("prob_enderleini",new Hproperty<Double>());
    setProb_enderleini(new Double("0"));
    defProperty("enderleini",new Hproperty<Double>());
    setEnderleini(new Double("0"));
    defProperty("prob_grahamii",new Hproperty<Double>());
    setProb_grahamii(new Double("0"));
    defProperty("grahamii",new Hproperty<Double>());
    setGrahamii(new Double("0"));
    defProperty("prob_imicola",new Hproperty<Double>());
    setProb_imicola(new Double("0"));
    defProperty("imicola",new Hproperty<Double>());
    setImicola(new Double("0"));
    defProperty("prob_kibatiensis",new Hproperty<Double>());
    setProb_kibatiensis(new Double("0"));
    defProperty("kibatiensis",new Hproperty<Double>());
    setKibatiensis(new Double("0"));
    defProperty("seuil_pres",new Hproperty<Double>());
    setSeuil_pres(new Double("0"));
    defProperty("rain",new Hproperty<Double>());
    setRain(new Double("0"));
    defProperty("rain7",new Hproperty<Double>());
    setRain7(new Double("0"));
    defProperty("rainmoy4_5",new Hproperty<Double>());
    setRainmoy4_5(new Double("0"));
    defProperty("rainlog1_2",new Hproperty<Double>());
    setRainlog1_2(new Double("0"));
    defProperty("rain_8",new Hproperty<Double>());
    setRain_8(new Double("0"));
    defProperty("rain_20",new Hproperty<Double>());
    setRain_20(new Double("0"));
    defProperty("rain_28",new Hproperty<Double>());
    setRain_28(new Double("0"));
    defProperty("classCuli",new Hproperty<Integer>());
    setClassCuli(new Integer("0"));
    defProperty("date",new Hproperty<Date>());
    setDate(new Date());
    defProperty("ktmin",new Hproperty<KeyMap<Date, Double>>());
    setKtmin(new KeyMap<Date, Double>());
    defProperty("temperature",new Hproperty<Double>());
    setTemperature(new Double("0"));
    defProperty("temperature_grad",new Hproperty<Double>());
    setTemperature_grad(new Double("0"));
    defProperty("tmoy0_17",new Hproperty<Double>());
    setTmoy0_17(new Double("0"));
    defProperty("tmoy16_18",new Hproperty<Double>());
    setTmoy16_18(new Double("0"));
    defProperty("tmin0_14",new Hproperty<Double>());
    setTmin0_14(new Double("0"));
    defProperty("tmoymax0_2",new Hproperty<Double>());
    setTmoymax0_2(new Double("0"));
    defProperty("tmax0_14",new Hproperty<Double>());
    setTmax0_14(new Double("0"));
    defProperty("tmax1_19",new Hproperty<Double>());
    setTmax1_19(new Double("0"));
    defProperty("tmax_11",new Hproperty<Double>());
    setTmax_11(new Double("0"));
    defProperty("tmin",new Hproperty<Double>());
    setTmin(new Double("0"));
    defProperty("tmax",new Hproperty<Double>());
    setTmax(new Double("0"));
    defProperty("humidite",new Hproperty<Double>());
    setHumidite(new Double("0"));
    defProperty("mesure_vent",new Hproperty<String>());
    setMesure_vent(new String());
    defProperty("vent",new Hproperty<Double>());
    setVent(new Double("0"));
    defProperty("vent_1",new Hproperty<Double>());
    setVent_1(new Double("0"));
    defProperty("voisin_ndvi",new Hproperty<Integer>());
    setVoisin_ndvi(new Integer("0"));
  }
}
