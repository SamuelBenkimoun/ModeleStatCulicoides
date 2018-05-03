package fr.ocelet.model.dynpopculicoides;

import fr.ocelet.model.dynpopculicoides.CSV_Humidite;
import fr.ocelet.model.dynpopculicoides.CSV_Vent;
import fr.ocelet.model.dynpopculicoides.CsvData;
import fr.ocelet.model.dynpopculicoides.CsvHum;
import fr.ocelet.model.dynpopculicoides.CsvVent;
import fr.ocelet.model.dynpopculicoides.DataStation;
import fr.ocelet.model.dynpopculicoides.Grid;
import fr.ocelet.model.dynpopculicoides.Grid_1000;
import fr.ocelet.model.dynpopculicoides.Grid_Output;
import fr.ocelet.model.dynpopculicoides.KmlOut;
import fr.ocelet.model.dynpopculicoides.LocStation;
import fr.ocelet.model.dynpopculicoides.Masque;
import fr.ocelet.model.dynpopculicoides.MasqueNdvi;
import fr.ocelet.model.dynpopculicoides.Ndvi;
import fr.ocelet.model.dynpopculicoides.RasterMasque;
import fr.ocelet.model.dynpopculicoides.RasterNdvi;
import fr.ocelet.model.dynpopculicoides.Shp;
import fr.ocelet.model.dynpopculicoides.ShpHum;
import fr.ocelet.model.dynpopculicoides.ShpOutAllDates;
import fr.ocelet.model.dynpopculicoides.ShpStation;
import fr.ocelet.model.dynpopculicoides.ShpVent;
import fr.ocelet.model.dynpopculicoides.Site;
import fr.ocelet.model.dynpopculicoides.SiteNdvi;
import fr.ocelet.model.dynpopculicoides.Station_Hum;
import fr.ocelet.model.dynpopculicoides.Station_Vent;
import fr.ocelet.runtime.Miscutils;
import fr.ocelet.runtime.TextFileWriter;
import fr.ocelet.runtime.model.AbstractModel;
import fr.ocelet.runtime.model.Parameter;
import fr.ocelet.runtime.model.ParameterImpl;
import fr.ocelet.runtime.model.SimulationListener;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.KeyMap;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class DynPopCulicoides extends AbstractModel {
  public DynPopCulicoides() {
    super("DynPopCulicoides");
    Parameter<String> par_region = new ParameterImpl<String>("region","",true,"REUNION",null);
    addParameter(par_region);
    region = "REUNION";
    Parameter<String> par_inputDirNew = new ParameterImpl<String>("inputDirNew","",true,"data/ENTREES",null);
    addParameter(par_inputDirNew);
    inputDirNew = "data/ENTREES";
    Parameter<String> par_inputDirWork = new ParameterImpl<String>("inputDirWork","",true,"data/TRAVAIL",null);
    addParameter(par_inputDirWork);
    inputDirWork = "data/TRAVAIL";
    Parameter<String> par_date_debut = new ParameterImpl<String>("date_debut","",true,"01/01/2016",null);
    addParameter(par_date_debut);
    date_debut = "01/01/2016";
    Parameter<String> par_date_fin = new ParameterImpl<String>("date_fin","",true,"31/12/2016",null);
    addParameter(par_date_fin);
    date_fin = "31/12/2016";
    Parameter<Boolean> par_outputAllDates = new ParameterImpl<Boolean>("outputAllDates","",true,true,null);
    addParameter(par_outputAllDates);
    outputAllDates = true;
    Parameter<Boolean> par_outputLastDate = new ParameterImpl<Boolean>("outputLastDate","",true,true,null);
    addParameter(par_outputLastDate);
    outputLastDate = true;
    Parameter<Boolean> par_exportSHP = new ParameterImpl<Boolean>("exportSHP","",true,true,null);
    addParameter(par_exportSHP);
    exportSHP = true;
    Parameter<String> par_outputDir = new ParameterImpl<String>("outputDir","",true,"output",null);
    addParameter(par_outputDir);
    outputDir = "output";
    Parameter<Boolean> par_exportKML = new ParameterImpl<Boolean>("exportKML","",true,false,null);
    addParameter(par_exportKML);
    exportKML = false;
  }
  
  public static void main(final String[] args) {
    DynPopCulicoides model_DynPopCulicoides = new DynPopCulicoides();
    model_DynPopCulicoides.run_DynPopCulicoides();
  }
  
  public void run_DynPopCulicoides() {
    InputOutput.<String>println("Model DynPopCulicoides ready to run");
    Date debutCalcul = new Date();
    final int frequencedisplay = 1;
    final double dt = 0.1;
    Date bdateuser = Date.fromString("dd/MM/yyyy", this.date_debut);
    Date edateuser = Date.fromString("dd/MM/yyyy", this.date_fin);
    Shp shp = new Shp();
    String nomDeFichier = (this.inputDirWork + "/SHAPEFILE/SITES/elevages_req_correct_merge2.shp");
    shp.setFileName(nomDeFichier);
    ShpStation shpStation = new ShpStation();
    nomDeFichier = (this.inputDirWork + "/SHAPEFILE/STATIONS/31Stations.shp");
    shpStation.setFileName(nomDeFichier);
    ShpHum shpHum = new ShpHum();
    nomDeFichier = (this.inputDirWork + "/SHAPEFILE/STATIONS/Stations_Humidite.shp");
    shpHum.setFileName(nomDeFichier);
    ShpVent shpVent = new ShpVent();
    nomDeFichier = (this.inputDirWork + "/SHAPEFILE/STATIONS/stations_vent_fusion.shp");
    shpVent.setFileName(nomDeFichier);
    CsvData csvData = new CsvData();
    nomDeFichier = (this.inputDirWork + "/CSVDATA/METEO/97404540.csv");
    csvData.setFileName(nomDeFichier);
    CsvHum csvHum = new CsvHum();
    nomDeFichier = (this.inputDirWork + "/CSVDATA/METEO/HUMIDITE/97402240.csv");
    csvHum.setFileName(nomDeFichier);
    CsvVent csvVent = new CsvVent();
    nomDeFichier = (this.inputDirWork + "/CSVDATA/METEO/VENT/97405420.csv");
    csvVent.setFileName(nomDeFichier);
    CsvData csvDataNew = new CsvData();
    nomDeFichier = (this.inputDirNew + "/97404540.csv");
    csvDataNew.setFileName(nomDeFichier);
    CsvData csvDataOut = new CsvData();
    nomDeFichier = (this.outputDir + "/historique_simulations.csv");
    csvDataOut.setFileName(nomDeFichier);
    RasterMasque rasterMasque = new RasterMasque();
    nomDeFichier = (this.inputDirWork + "/IMAGES/T40KCB_NDVI_2016/SEN2COR_MASKS");
    RasterNdvi rasterNdvi = new RasterNdvi();
    MasqueNdvi masqueNdvi = new MasqueNdvi();
    SiteNdvi siteNdvi = new SiteNdvi();
    Grid_1000 grid_1000 = new Grid_1000();
    Grid_Output grid_Output = new Grid_Output();
    KmlOut kmlout = new KmlOut();
    nomDeFichier = (((this.outputDir + "/") + this.region) + "_serietemporelle.kml");
    kmlout.setFileName(nomDeFichier);
    String nomDeDossierTxt = "output/";
    String nomDeFichierTxt = nomDeDossierTxt.concat("output2016.txt");
    String ligneDeTexte = "974PL;id; date_debut; logpluie1-2; pluie20; pluie28; rainmoy4_5;rain_8; occsol; animaux; tmoy0_17; tmin0_14; tmax0_14; tmoy16_18; tmoymax0_2; tmax_11; humidite; vent; vent_1; num_h; prob_bol; prob_end; prob_gr; prob_imic; prob_kib; eau_500; eau_1000; eau_2000; ndvi; ndvi_id; coeff_alt";
    TextFileWriter.printToFile(nomDeFichierTxt, ligneDeTexte);
    ShpOutAllDates shpout = new ShpOutAllDates();
    InputOutput.<String>println("Reading data ... ");
    List<Site> lsitetot = shp.readAllSite();
    InputOutput.<String>println("shp read ...");
    List<LocStation> lstation = shpStation.readAllLocStation();
    List<Station_Hum> lstation_hum = shpHum.readAllStation_Hum();
    List<Station_Vent> lstation_vent = shpVent.readAllStation_Vent();
    List<Masque> masque = rasterMasque.readAllMasque();
    List<Ndvi> ndvi = rasterNdvi.readAllNdvi();
    List<Grid> grid = grid_1000.readAllGrid();
    final KeyMap<Integer, List<DataStation>> allMeteoData = new KeyMap<Integer, List<DataStation>>();
    final KeyMap<Integer, List<CSV_Humidite>> humData = new KeyMap<Integer, List<CSV_Humidite>>();
    final KeyMap<Integer, List<CSV_Vent>> ventData = new KeyMap<Integer, List<CSV_Vent>>();
    int i = 0;
    for (final LocStation s : lstation) {
      {
        Long _numero = s.getNumero();
        String _plus = ((this.inputDirWork + "/CSVDATA/METEO/") + _numero);
        String nomDeFichierCsv = (_plus + ".csv");
        csvData.setFileName(nomDeFichierCsv);
        List<DataStation> DataMeteo = csvData.readAll();
        allMeteoData.put(Integer.valueOf(i), DataMeteo);
        i = (i + 1);
      }
    }
    int k = 0;
    for (final Station_Hum h : lstation_hum) {
      {
        Long _numero = h.getNumero();
        String _plus = ((this.inputDirWork + "/CSVDATA/METEO/HUMIDITE/") + _numero);
        String nomDeFichierCSV = (_plus + ".csv");
        csvHum.setFileName(nomDeFichierCSV);
        List<CSV_Humidite> Data_Humidite = csvHum.readAll();
        Long _numero_1 = h.getNumero();
        String _plus_1 = ((("key : " + Integer.valueOf(k)) + " num: ") + _numero_1);
        InputOutput.<String>println(_plus_1);
        CSV_Humidite _get = Data_Humidite.get(1);
        String _plus_2 = ("data humidite : " + _get);
        InputOutput.<String>println(_plus_2);
        humData.put(Integer.valueOf(k), Data_Humidite);
        k = (k + 1);
        int _size = humData.size();
        String _plus_3 = ("taille humData :" + Integer.valueOf(_size));
        InputOutput.<String>println(_plus_3);
      }
    }
    int k2 = 0;
    for (final Station_Vent v : lstation_vent) {
      {
        Long _numero = v.getNumero();
        String _plus = ((this.inputDirWork + "/CSVDATA/METEO/VENT/") + _numero);
        String nomDeFichierCSV = (_plus + ".csv");
        csvVent.setFileName(nomDeFichierCSV);
        List<CSV_Vent> Data_Vent = csvVent.readAll();
        ventData.put(Integer.valueOf(k2), Data_Vent);
        k2 = (k2 + 1);
        int _size = ventData.size();
        String _plus_1 = ((("k2: " + Integer.valueOf(k2)) + "taille ventData : ") + Integer.valueOf(_size));
        InputOutput.<String>println(_plus_1);
      }
    }
    final Date bdate = Date.fromString("yyyy-MM-dd", "2016-01-01");
    Date bdate1 = Date.fromString("yyyy-MM-dd", allMeteoData.get(Integer.valueOf(0)).get(0).getDateTXT());
    bdate1.addYears(1);
    boolean _isBefore = bdateuser.isBefore(bdate1);
    boolean _equals = (_isBefore == true);
    if (_equals) {
      bdateuser = bdate1;
    }
    Date edate = Date.fromString("yyyy-MM-dd", "2016-12-31   ");
    boolean _isAfter = edateuser.isAfter(edate);
    boolean _equals_1 = (_isAfter == true);
    if (_equals_1) {
      edateuser = edate;
    }
    int _year = bdateuser.getYear();
    String _plus = ((((this.outputDir + "/") + this.region) + "_") + Integer.valueOf(_year));
    String _format = Miscutils.format(Integer.valueOf(bdateuser.getMonth()), "00");
    String _plus_1 = (_plus + _format);
    String _format_1 = Miscutils.format(Integer.valueOf(bdateuser.getDayOfMonth()), "00");
    String _plus_2 = (_plus_1 + _format_1);
    String _plus_3 = (_plus_2 + "_");
    int _year_1 = edateuser.getYear();
    String _plus_4 = (_plus_3 + Integer.valueOf(_year_1));
    String _format_2 = Miscutils.format(Integer.valueOf(edateuser.getMonth()), "00");
    String _plus_5 = (_plus_4 + _format_2);
    String _format_3 = Miscutils.format(Integer.valueOf(edateuser.getDayOfMonth()), "00");
    String _plus_6 = (_plus_5 + _format_3);
    String nomDeFichierShpAll = (_plus_6 + ".shp");
    shpout.setFileName(nomDeFichierShpAll);
    if (((this.outputAllDates).booleanValue() == true)) {
      shpout.remove();
    }
    Date now = bdate.clone();
    double test_display = 0.0;
    Date fin = now.clone();
    for (final Site sit : lsitetot) {
      {
        sit.setNdvi(Integer.valueOf(0));
        sit.setSeuil_pres(Double.valueOf(0.5));
        sit.setVent(Double.valueOf(0.0));
        sit.setVent_1(Double.valueOf(0.0));
        sit.setDist_station(Double.valueOf(1000000.0));
        i = 0;
        for (final LocStation s_1 : lstation) {
          {
            double dist = sit.getGeom().distance(s_1.getGeom());
            Double _dist_station = sit.getDist_station();
            boolean _lessThan = (dist < (_dist_station).doubleValue());
            if (_lessThan) {
              sit.setDist_station(Double.valueOf(dist));
              sit.setNum_station(s_1.getNumero());
              sit.setId_station(Integer.valueOf(i));
              Double _altitude = sit.getAltitude();
              Integer _altitude_1 = s_1.getAltitude();
              double _minus = DoubleExtensions.operator_minus(_altitude, _altitude_1);
              sit.setDiff_alt(Double.valueOf(_minus));
              sit.gradAlt();
            }
            i = (i + 1);
          }
        }
        sit.setDist_station_h(Double.valueOf(10000000000.0));
        k = 0;
        for (final Station_Hum h_1 : lstation_hum) {
          {
            double dist = sit.getGeom().distance(h_1.getGeom());
            Double _dist_station_h = sit.getDist_station_h();
            boolean _lessThan = (dist < (_dist_station_h).doubleValue());
            if (_lessThan) {
              sit.setDist_station_h(Double.valueOf(dist));
              sit.setNum_station_h(h_1.getNumero());
              sit.setId_station_h(Integer.valueOf(k));
              InputOutput.<String>println(("k : " + Integer.valueOf(k)));
            }
            k = (k + 1);
          }
        }
        sit.setDist_station_v(Double.valueOf(100000000.0));
        k2 = 0;
        for (final Station_Vent v_1 : lstation_vent) {
          {
            double dist = sit.getGeom().distance(v_1.getGeom());
            Double _dist_station_v = sit.getDist_station_v();
            boolean _lessThan = (dist < (_dist_station_v).doubleValue());
            if (_lessThan) {
              sit.setDist_station_v(Double.valueOf(dist));
              sit.setNum_station_v(v_1.getNumero());
              sit.setMesure_vent(v_1.getMesure());
              sit.setId_station_v(Integer.valueOf(k2));
            }
            k2 = (k2 + 1);
          }
        }
      }
    }
    int day = 0;
    int day_2 = (day + 1826);
    while ((now.isBefore(edateuser.addDays(1)) == true)) {
      {
        String _string = now.toString("dd/MM/yyyy");
        String _plus_7 = ("date en cours : " + _string);
        this.printOut(_plus_7);
        edateuser.addDays((-1));
        int j = 0;
        if ((day == 1)) {
          masqueNdvi.connect(masque, ndvi);
          masqueNdvi.lisibiliteNDVI();
          siteNdvi.connect(ndvi, lsitetot);
          siteNdvi.setNdvi();
        }
        if (((((((((((((((((((((((((((day == 77) || (day == 87)) || (day == 97)) || (day == 107)) || (day == 117)) || (day == 147)) || (day == 157)) || (day == 167)) || (day == 177)) || (day == 187)) || (day == 197)) || (day == 207)) || (day == 217)) || (day == 228)) || (day == 237)) || (day == 247)) || (day == 257)) || (day == 267)) || (day == 277)) || (day == 287)) || (day == 297)) || (day == 317)) || (day == 327)) || (day == 337)) || (day == 347)) || (day == 357))) {
          rasterMasque.next();
          rasterMasque.update();
          String _fileName = rasterMasque.getFileName();
          String _plus_8 = ("masque filename: " + _fileName);
          InputOutput.<String>println(_plus_8);
          rasterNdvi.next();
          rasterNdvi.update();
          String _fileName_1 = rasterNdvi.getFileName();
          String _plus_9 = ("ndvi filename: " + _fileName_1);
          InputOutput.<String>println(_plus_9);
          masqueNdvi.connect(masque, ndvi);
          masqueNdvi.lisibiliteNDVI();
          InputOutput.<String>println("masque + ndvi ok");
          siteNdvi.connect(ndvi, lsitetot);
          siteNdvi.setNdvi();
        }
        for (final Site sit_1 : lsitetot) {
          {
            InputOutput.<String>println("..................");
            Integer _id = sit_1.getId();
            String _plus_10 = ("id: " + _id);
            InputOutput.<String>println(_plus_10);
            i = (sit_1.getId_station()).intValue();
            k = (sit_1.getId_station_h()).intValue();
            Integer _id_station_h = sit_1.getId_station_h();
            String _plus_11 = ("stat_h " + _id_station_h);
            String _plus_12 = (_plus_11 + " num_stat : ");
            Long _num_station_h = sit_1.getNum_station_h();
            String _plus_13 = (_plus_12 + _num_station_h);
            InputOutput.<String>println(_plus_13);
            Integer _id_station_v = sit_1.getId_station_v();
            String _plus_14 = ("stat_v" + _id_station_v);
            InputOutput.<String>println(_plus_14);
            InputOutput.<String>println(("day: " + Integer.valueOf(day)));
            sit_1.setTmin(allMeteoData.get(Integer.valueOf(i)).get(day_2).getTempMin());
            Double _tmin = sit_1.getTmin();
            Double _coeff_alt = sit_1.getCoeff_alt();
            double _multiply = DoubleExtensions.operator_multiply(_tmin, _coeff_alt);
            sit_1.setTmin(Double.valueOf(_multiply));
            sit_1.setTmax(allMeteoData.get(Integer.valueOf(i)).get(day_2).getTempMax());
            Double _tmax = sit_1.getTmax();
            Double _coeff_alt_1 = sit_1.getCoeff_alt();
            double _multiply_1 = DoubleExtensions.operator_multiply(_tmax, _coeff_alt_1);
            sit_1.setTmax(Double.valueOf(_multiply_1));
            InputOutput.<String>println(("k: " + Integer.valueOf(k)));
            sit_1.setHumidite(humData.get(sit_1.getId_station_h()).get(day).getHum_moy());
            InputOutput.<String>println("ok");
            sit_1.setRain(allMeteoData.get(Integer.valueOf(i)).get(day_2).getRainMM());
            sit_1.setVent(ventData.get(sit_1.getId_station_v()).get(day).getVent());
            if ((day > 1)) {
              sit_1.setVent_1(ventData.get(sit_1.getId_station_v()).get((day - 1)).getVent());
              Double _vent_1 = sit_1.getVent_1();
              String _plus_15 = ("vent: " + _vent_1);
              InputOutput.<String>println(_plus_15);
            }
            if ((day > 7)) {
              sit_1.setRain7(allMeteoData.get(Integer.valueOf(i)).get((day_2 - 7)).getRainMM());
            }
            if ((day > 2)) {
              if ((((allMeteoData.get(Integer.valueOf(i)).get((day_2 - 1)).getRainMM()).doubleValue() != 0) || ((allMeteoData.get(Integer.valueOf(i)).get((day_2 - 2)).getRainMM()).doubleValue() != 0))) {
                Double _rainMM = allMeteoData.get(Integer.valueOf(i)).get((day_2 - 1)).getRainMM();
                Double _rainMM_1 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - 2)).getRainMM();
                double _plus_16 = DoubleExtensions.operator_plus(_rainMM, _rainMM_1);
                double _divide = (_plus_16 / 2.0);
                sit_1.setRainlog1_2(Double.valueOf(Math.log(_divide)));
              } else {
                sit_1.setRainlog1_2(Double.valueOf(0.0));
              }
              Double _rainlog1_2 = sit_1.getRainlog1_2();
              String _plus_17 = ("rainlog1_2: " + _rainlog1_2);
              InputOutput.<String>println(_plus_17);
            }
            if ((day > 8)) {
              sit_1.setRain_8(allMeteoData.get(Integer.valueOf(i)).get((day_2 - 8)).getRainMM());
            }
            if ((day > 20)) {
              sit_1.setRain_20(allMeteoData.get(Integer.valueOf(i)).get((day_2 - 20)).getRainMM());
            }
            if ((day > 28)) {
              sit_1.setRain_28(allMeteoData.get(Integer.valueOf(i)).get((day_2 - 28)).getRainMM());
            }
            if ((day > 17)) {
              sit_1.setTmoy0_17(Double.valueOf(0.0));
              IntegerRange _upTo = new IntegerRange(0, 17);
              for (final Integer d : _upTo) {
                Double _tmoy0_17 = sit_1.getTmoy0_17();
                Double _tempMin = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d).intValue())).getTempMin();
                Double _tempMax = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d).intValue())).getTempMax();
                double _plus_18 = DoubleExtensions.operator_plus(_tempMin, _tempMax);
                double _divide_1 = (_plus_18 / 2);
                double _plus_19 = ((_tmoy0_17).doubleValue() + _divide_1);
                sit_1.setTmoy0_17(Double.valueOf(_plus_19));
              }
              Double _tmoy0_17_1 = sit_1.getTmoy0_17();
              double _divide_2 = ((_tmoy0_17_1).doubleValue() / 18.0);
              sit_1.setTmoy0_17(Double.valueOf(_divide_2));
              Double _tmoy0_17_2 = sit_1.getTmoy0_17();
              Double _coeff_alt_2 = sit_1.getCoeff_alt();
              double _multiply_2 = DoubleExtensions.operator_multiply(_tmoy0_17_2, _coeff_alt_2);
              sit_1.setTmoy0_17(Double.valueOf(_multiply_2));
            }
            if ((day > 18)) {
              sit_1.setTmoy16_18(Double.valueOf(0.0));
              IntegerRange _upTo_1 = new IntegerRange(16, 18);
              for (final Integer d_1 : _upTo_1) {
                Double _tmoy16_18 = sit_1.getTmoy16_18();
                Double _tempMin_1 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_1).intValue())).getTempMin();
                Double _tempMax_1 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_1).intValue())).getTempMax();
                double _plus_20 = DoubleExtensions.operator_plus(_tempMin_1, _tempMax_1);
                double _divide_3 = (_plus_20 / 2);
                double _plus_21 = ((_tmoy16_18).doubleValue() + _divide_3);
                sit_1.setTmoy16_18(Double.valueOf(_plus_21));
              }
              Double _tmoy16_18_1 = sit_1.getTmoy16_18();
              double _divide_4 = ((_tmoy16_18_1).doubleValue() / 3.0);
              sit_1.setTmoy16_18(Double.valueOf(_divide_4));
              Double _tmoy16_18_2 = sit_1.getTmoy16_18();
              Double _coeff_alt_3 = sit_1.getCoeff_alt();
              double _multiply_3 = DoubleExtensions.operator_multiply(_tmoy16_18_2, _coeff_alt_3);
              sit_1.setTmoy16_18(Double.valueOf(_multiply_3));
            }
            if ((day > 14)) {
              sit_1.setTmin0_14(sit_1.getTmin());
              IntegerRange _upTo_2 = new IntegerRange(0, 14);
              for (final Integer d_2 : _upTo_2) {
                Double _tempMin_2 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_2).intValue())).getTempMin();
                Double _tmin0_14 = sit_1.getTmin0_14();
                boolean _lessThan = (_tempMin_2.compareTo(_tmin0_14) < 0);
                if (_lessThan) {
                  sit_1.setTmin0_14(allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_2).intValue())).getTempMin());
                }
              }
              Double _tmin0_14_1 = sit_1.getTmin0_14();
              Double _coeff_alt_4 = sit_1.getCoeff_alt();
              double _multiply_4 = DoubleExtensions.operator_multiply(_tmin0_14_1, _coeff_alt_4);
              sit_1.setTmin0_14(Double.valueOf(_multiply_4));
            }
            if ((day > 3)) {
              Double _tmax_1 = sit_1.getTmax();
              Double _tmin_1 = sit_1.getTmin();
              double _plus_22 = DoubleExtensions.operator_plus(_tmax_1, _tmin_1);
              double _divide_5 = (_plus_22 / 2);
              sit_1.setTmoymax0_2(Double.valueOf(_divide_5));
              IntegerRange _upTo_3 = new IntegerRange(0, 2);
              for (final Integer d_3 : _upTo_3) {
                Double _tempMax_2 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_3).intValue())).getTempMax();
                Double _tempMin_3 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_3).intValue())).getTempMin();
                double _plus_23 = DoubleExtensions.operator_plus(_tempMax_2, _tempMin_3);
                double _divide_6 = (_plus_23 / 2);
                Double _tmoymax0_2 = sit_1.getTmoymax0_2();
                boolean _greaterThan = (_divide_6 > (_tmoymax0_2).doubleValue());
                if (_greaterThan) {
                  Double _tempMax_3 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_3).intValue())).getTempMax();
                  Double _tempMin_4 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_3).intValue())).getTempMin();
                  double _plus_24 = DoubleExtensions.operator_plus(_tempMax_3, _tempMin_4);
                  double _divide_7 = (_plus_24 / 2);
                  sit_1.setTmoymax0_2(Double.valueOf(_divide_7));
                }
              }
              Double _tmoymax0_2_1 = sit_1.getTmoymax0_2();
              Double _coeff_alt_5 = sit_1.getCoeff_alt();
              double _multiply_5 = DoubleExtensions.operator_multiply(_tmoymax0_2_1, _coeff_alt_5);
              sit_1.setTmoymax0_2(Double.valueOf(_multiply_5));
            }
            if ((day > 14)) {
              sit_1.setTmax0_14(sit_1.getTmax());
              IntegerRange _upTo_4 = new IntegerRange(0, 14);
              for (final Integer d_4 : _upTo_4) {
                Double _tempMax_4 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_4).intValue())).getTempMax();
                Double _tmax0_14 = sit_1.getTmax0_14();
                boolean _greaterThan_1 = (_tempMax_4.compareTo(_tmax0_14) > 0);
                if (_greaterThan_1) {
                  sit_1.setTmax0_14(allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_4).intValue())).getTempMax());
                }
              }
              Double _tmax0_14_1 = sit_1.getTmax0_14();
              Double _coeff_alt_6 = sit_1.getCoeff_alt();
              double _multiply_6 = DoubleExtensions.operator_multiply(_tmax0_14_1, _coeff_alt_6);
              sit_1.setTmax0_14(Double.valueOf(_multiply_6));
            }
            if ((day > 19)) {
              sit_1.setTmax1_19(sit_1.getTmax());
              IntegerRange _upTo_5 = new IntegerRange(0, 19);
              for (final Integer d_5 : _upTo_5) {
                Double _tempMax_5 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_5).intValue())).getTempMax();
                Double _tmax1_19 = sit_1.getTmax1_19();
                boolean _greaterThan_2 = (_tempMax_5.compareTo(_tmax1_19) > 0);
                if (_greaterThan_2) {
                  sit_1.setTmax1_19(allMeteoData.get(Integer.valueOf(i)).get((day_2 - (d_5).intValue())).getTempMax());
                }
              }
              Double _tmax1_19_1 = sit_1.getTmax1_19();
              Double _coeff_alt_7 = sit_1.getCoeff_alt();
              double _multiply_7 = DoubleExtensions.operator_multiply(_tmax1_19_1, _coeff_alt_7);
              sit_1.setTmax1_19(Double.valueOf(_multiply_7));
            }
            if ((day > 11)) {
              sit_1.setTmax_11(allMeteoData.get(Integer.valueOf(i)).get((day_2 - 11)).getTempMax());
              Double _tmax_11 = sit_1.getTmax_11();
              Double _coeff_alt_8 = sit_1.getCoeff_alt();
              double _multiply_8 = DoubleExtensions.operator_multiply(_tmax_11, _coeff_alt_8);
              sit_1.setTmax_11(Double.valueOf(_multiply_8));
            }
            if ((day > 5)) {
              Double _rainMM_2 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - 5)).getRainMM();
              Double _rainMM_3 = allMeteoData.get(Integer.valueOf(i)).get((day_2 - 4)).getRainMM();
              double _plus_25 = DoubleExtensions.operator_plus(_rainMM_2, _rainMM_3);
              double _divide_8 = (_plus_25 / 2);
              sit_1.setRainmoy4_5(Double.valueOf(_divide_8));
            }
            sit_1.updateTemp();
            sit_1.gradientAlt(sit_1.getTemperature());
            if ((day == 1)) {
              sit_1.attributionNdvi(lsitetot);
            }
            if (((((((((((((((((((((((((((day == 77) || (day == 87)) || (day == 97)) || (day == 107)) || (day == 117)) || (day == 147)) || (day == 157)) || (day == 167)) || (day == 177)) || (day == 187)) || (day == 197)) || (day == 207)) || (day == 217)) || (day == 228)) || (day == 247)) || (day == 257)) || (day == 267)) || (day == 277)) || (day == 287)) || (day == 297)) || (day == 307)) || (day == 317)) || (day == 327)) || (day == 337)) || (day == 347)) || (day == 357))) {
              sit_1.attributionNdvi(lsitetot);
            }
            sit_1.fillNdviMap(Integer.valueOf(day), sit_1.getNdvi());
            if ((day > 27)) {
              sit_1.setNdvi_26(sit_1.getNdvi_map().get(Integer.valueOf((day - 26))));
            }
            Integer _ndvi = sit_1.getNdvi();
            String _plus_26 = ("ndvi: " + _ndvi);
            String _plus_27 = (_plus_26 + " ndvi_id: ");
            Integer _ndvi_id = sit_1.getNdvi_id();
            String _plus_28 = (_plus_27 + _ndvi_id);
            String _plus_29 = (_plus_28 + "ndvi_25: ");
            Integer _ndvi_26 = sit_1.getNdvi_26();
            String _plus_30 = (_plus_29 + _ndvi_26);
            InputOutput.<String>println(_plus_30);
            boolean _isAfter_1 = now.isAfter(bdateuser);
            boolean _equals_2 = (_isAfter_1 == true);
            if (_equals_2) {
              test_display = Math.IEEEremainder(day, frequencedisplay);
              fin = now.clone();
              fin.addDays(frequencedisplay);
            }
            sit_1.calcImicola(sit_1.getTemperature());
            sit_1.calcBolitinos();
            sit_1.calcGrahamii();
            sit_1.calcEnderleini();
            sit_1.calcKibatiensis();
            ligneDeTexte = sit_1.getPl();
            String _string_1 = sit_1.getId().toString();
            String _plus_31 = (";" + _string_1);
            String _plus_32 = (_plus_31 + ";");
            String _string_2 = now.toString("dd/MM/yyyy");
            String _plus_33 = (_plus_32 + _string_2);
            String _plus_34 = (_plus_33 + ";");
            String _string_3 = sit_1.getRainlog1_2().toString();
            String _plus_35 = (_plus_34 + _string_3);
            String _plus_36 = (_plus_35 + ";");
            String _string_4 = sit_1.getRain_20().toString();
            String _plus_37 = (_plus_36 + _string_4);
            String _plus_38 = (_plus_37 + ";");
            String _string_5 = sit_1.getRain_28().toString();
            String _plus_39 = (_plus_38 + _string_5);
            String _plus_40 = (_plus_39 + ";");
            String _string_6 = sit_1.getRainmoy4_5().toString();
            String _plus_41 = (_plus_40 + _string_6);
            String _plus_42 = (_plus_41 + ";");
            String _string_7 = sit_1.getRain_8().toString();
            String _plus_43 = (_plus_42 + _string_7);
            String _plus_44 = (_plus_43 + ";");
            String _string_8 = sit_1.getOccsol().toString();
            String _plus_45 = (_plus_44 + _string_8);
            String _plus_46 = (_plus_45 + ";");
            String _string_9 = sit_1.getPresence_animaux().toString();
            String _plus_47 = (_plus_46 + _string_9);
            String _plus_48 = (_plus_47 + ";");
            String _string_10 = sit_1.getTmoy0_17().toString();
            String _plus_49 = (_plus_48 + _string_10);
            String _plus_50 = (_plus_49 + ";");
            String _string_11 = sit_1.getTmin0_14().toString();
            String _plus_51 = (_plus_50 + _string_11);
            String _plus_52 = (_plus_51 + ";");
            String _string_12 = sit_1.getTmax0_14().toString();
            String _plus_53 = (_plus_52 + _string_12);
            String _plus_54 = (_plus_53 + ";");
            String _string_13 = sit_1.getTmoy16_18().toString();
            String _plus_55 = (_plus_54 + _string_13);
            String _plus_56 = (_plus_55 + ";");
            String _string_14 = sit_1.getTmoymax0_2().toString();
            String _plus_57 = (_plus_56 + _string_14);
            String _plus_58 = (_plus_57 + ";");
            String _string_15 = sit_1.getTmax_11().toString();
            String _plus_59 = (_plus_58 + _string_15);
            String _plus_60 = (_plus_59 + ";");
            String _string_16 = sit_1.getHumidite().toString();
            String _plus_61 = (_plus_60 + _string_16);
            String _plus_62 = (_plus_61 + ";");
            String _string_17 = sit_1.getVent().toString();
            String _plus_63 = (_plus_62 + _string_17);
            String _plus_64 = (_plus_63 + ";");
            String _string_18 = sit_1.getVent_1().toString();
            String _plus_65 = (_plus_64 + _string_18);
            String _plus_66 = (_plus_65 + ";");
            String _string_19 = sit_1.getNum_station_h().toString();
            String _plus_67 = (_plus_66 + _string_19);
            String _plus_68 = (_plus_67 + ";");
            String _string_20 = sit_1.getProb_bolitinos().toString();
            String _plus_69 = (_plus_68 + _string_20);
            String _plus_70 = (_plus_69 + ";");
            String _string_21 = sit_1.getProb_enderleini().toString();
            String _plus_71 = (_plus_70 + _string_21);
            String _plus_72 = (_plus_71 + ";");
            String _string_22 = sit_1.getProb_grahamii().toString();
            String _plus_73 = (_plus_72 + _string_22);
            String _plus_74 = (_plus_73 + ";");
            String _string_23 = sit_1.getProb_imicola().toString();
            String _plus_75 = (_plus_74 + _string_23);
            String _plus_76 = (_plus_75 + ";");
            String _string_24 = sit_1.getProb_kibatiensis().toString();
            String _plus_77 = (_plus_76 + _string_24);
            String _plus_78 = (_plus_77 + ";");
            String _string_25 = sit_1.getEau_500().toString();
            String _plus_79 = (_plus_78 + _string_25);
            String _plus_80 = (_plus_79 + ";");
            String _string_26 = sit_1.getEau_1000().toString();
            String _plus_81 = (_plus_80 + _string_26);
            String _plus_82 = (_plus_81 + ";");
            String _string_27 = sit_1.getEau_2000().toString();
            String _plus_83 = (_plus_82 + _string_27);
            String _plus_84 = (_plus_83 + ";");
            String _string_28 = sit_1.getNdvi().toString();
            String _plus_85 = (_plus_84 + _string_28);
            String _plus_86 = (_plus_85 + ";");
            String _string_29 = sit_1.getNdvi_id().toString();
            String _plus_87 = (_plus_86 + _string_29);
            String _plus_88 = (_plus_87 + ";");
            Double _coeff_alt_9 = sit_1.getCoeff_alt();
            String _plus_89 = (_plus_88 + _coeff_alt_9);
            ligneDeTexte = ligneDeTexte.concat(_plus_89);
            TextFileWriter.printToFile(nomDeFichierTxt, ligneDeTexte);
            if (((this.exportKML).booleanValue() == true)) {
              sit_1.classify();
            }
            boolean _isAfter_2 = now.isAfter(bdateuser);
            boolean _equals_3 = (_isAfter_2 == true);
            if (_equals_3) {
              if ((test_display == 0)) {
                if (((this.exportKML).booleanValue() == true)) {
                  sit_1.outputKml(Integer.valueOf(day), now, Integer.valueOf(frequencedisplay), kmlout);
                }
                sit_1.setDate_begin(now.toString("yyyy-MM-dd"));
                sit_1.setDate_end(fin.toString("yyyy-MM-dd"));
              }
            }
            j = (j + 1);
          }
        }
        boolean _isAfter_1 = now.isAfter(bdateuser);
        boolean _equals_2 = (_isAfter_1 == true);
        if (_equals_2) {
          if ((test_display == 0)) {
            if (((this.outputAllDates).booleanValue() == true)) {
              InputOutput.<String>println("if ok");
            }
          }
        }
        day = (day + 1);
        now.addDays(1);
      }
    }
    InputOutput.<String>println(".");
    InputOutput.<String>println("Saving kml file...");
    kmlout.saveAsKml();
    InputOutput.<String>println("Geronimo !");
  }
  
  public void simulate(final HashMap<String, Object> in_params) {
    String val_region = (String) in_params.get("region");
    if (val_region != null) region = val_region;
    String val_inputDirNew = (String) in_params.get("inputDirNew");
    if (val_inputDirNew != null) inputDirNew = val_inputDirNew;
    String val_inputDirWork = (String) in_params.get("inputDirWork");
    if (val_inputDirWork != null) inputDirWork = val_inputDirWork;
    String val_date_debut = (String) in_params.get("date_debut");
    if (val_date_debut != null) date_debut = val_date_debut;
    String val_date_fin = (String) in_params.get("date_fin");
    if (val_date_fin != null) date_fin = val_date_fin;
    Boolean val_outputAllDates = (Boolean) in_params.get("outputAllDates");
    if (val_outputAllDates != null) outputAllDates = val_outputAllDates;
    Boolean val_outputLastDate = (Boolean) in_params.get("outputLastDate");
    if (val_outputLastDate != null) outputLastDate = val_outputLastDate;
    Boolean val_exportSHP = (Boolean) in_params.get("exportSHP");
    if (val_exportSHP != null) exportSHP = val_exportSHP;
    String val_outputDir = (String) in_params.get("outputDir");
    if (val_outputDir != null) outputDir = val_outputDir;
    Boolean val_exportKML = (Boolean) in_params.get("exportKML");
    if (val_exportKML != null) exportKML = val_exportKML;
    run_DynPopCulicoides();
  }
  
  public void printOut(final String msg) {
    InputOutput.<String>println(("-->  " + msg));
    for (final SimulationListener sl : this.simlisteners) {
      sl.consoleEvent((msg + "\n"));
    }
  }
  
  private String region;
  
  public void setRegion(final String region) {
    this.region = region;
  }
  
  public String getRegion() {
    return this.region;
  }
  
  private String inputDirNew;
  
  public void setInputDirNew(final String inputDirNew) {
    this.inputDirNew = inputDirNew;
  }
  
  public String getInputDirNew() {
    return this.inputDirNew;
  }
  
  private String inputDirWork;
  
  public void setInputDirWork(final String inputDirWork) {
    this.inputDirWork = inputDirWork;
  }
  
  public String getInputDirWork() {
    return this.inputDirWork;
  }
  
  private String date_debut;
  
  public void setDate_debut(final String date_debut) {
    this.date_debut = date_debut;
  }
  
  public String getDate_debut() {
    return this.date_debut;
  }
  
  private String date_fin;
  
  public void setDate_fin(final String date_fin) {
    this.date_fin = date_fin;
  }
  
  public String getDate_fin() {
    return this.date_fin;
  }
  
  private Boolean outputAllDates;
  
  public void setOutputAllDates(final Boolean outputAllDates) {
    this.outputAllDates = outputAllDates;
  }
  
  public Boolean getOutputAllDates() {
    return this.outputAllDates;
  }
  
  private Boolean outputLastDate;
  
  public void setOutputLastDate(final Boolean outputLastDate) {
    this.outputLastDate = outputLastDate;
  }
  
  public Boolean getOutputLastDate() {
    return this.outputLastDate;
  }
  
  private Boolean exportSHP;
  
  public void setExportSHP(final Boolean exportSHP) {
    this.exportSHP = exportSHP;
  }
  
  public Boolean getExportSHP() {
    return this.exportSHP;
  }
  
  private String outputDir;
  
  public void setOutputDir(final String outputDir) {
    this.outputDir = outputDir;
  }
  
  public String getOutputDir() {
    return this.outputDir;
  }
  
  private Boolean exportKML;
  
  public void setExportKML(final Boolean exportKML) {
    this.exportKML = exportKML;
  }
  
  public Boolean getExportKML() {
    return this.exportKML;
  }
}
