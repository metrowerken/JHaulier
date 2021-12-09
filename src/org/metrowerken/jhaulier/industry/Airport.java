package org.metrowerken.jhaulier.industry;
import org.metrowerken.jhaulier.tools.HaulierConstants;
public class Airport {

    private String airportType;
    private String airportContinent = "";
    private String airportArea = "";
    private String airportCountry = "";
    private String airportICAO = "";
    private String airportIATA = "";
    private String airportName = "";
    private double airportLongitude = 0.0;
    private double airportLatitude = 0.0;
    private int airportElevation = 0;

    public Airport(){
        //I may need this one probably more than the full args constructor
    }

    public Airport(String inType, String inContinent, String inArea,String inCountry, String inICAO, String inIATA, String inName, double inLong, double inLat, int inElevation){
        this.airportType = inType;
        this.airportContinent = inContinent;
        this.airportArea = inArea;
        this.airportCountry = inCountry;
        this.airportICAO = inICAO;
        this.airportIATA = inIATA;
        this.airportName = inName;
        this.airportLongitude = inLong;
        this.airportLatitude = inLat;
        this.airportElevation = inElevation;
    }

    public void setAirportType(String airportType) {
        this.airportType = airportType;
    }

    public void setAirportContinent(String airportContinent) {
        this.airportContinent = airportContinent;
    }

    public void setAirportArea(String airportArea) {
        this.airportArea = airportArea;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry;
    }

    public void setAirportICAO(String airportICAO) {
        this.airportICAO = airportICAO;
    }

    public void setAirportIATA(String airportIATA) {
        this.airportIATA = airportIATA;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setAirportLongitude(double airportLongitude) {
        this.airportLongitude = airportLongitude;
    }

    public void setAirportLatitude(double airportLatitude) {
        this.airportLatitude = airportLatitude;
    }

    public void setAirportElevation(int airportElevation) {
        this.airportElevation = airportElevation;
    }

    public String getAirportType() {
        return airportType;
    }

    public String getAirportContinent() {
        return airportContinent;
    }

    public String getAirportArea() {
        return airportArea;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public String getAirportICAO() {
        return airportICAO;
    }

    public String getAirportIATA() {
        return airportIATA;
    }

    public String getAirportName() {
        return airportName;
    }

    public double getAirportLongitude() {
        return airportLongitude;
    }

    public double getAirportLatitude() {
        return airportLatitude;
    }

    public int getAirportElevation() {
        return airportElevation;
    }
}
