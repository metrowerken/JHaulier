package org.metrowerken.jhaulier.industry;
import java.util.Date;

public class Contract {
    private Airport contractDepartureAirport = null;
    private Airport contractArrivalAirport = null;
    private Date contractDepartureTime = null;
    private Date contractArrivalTime = null;
    private int contractPAX = 0;
    private double contractCargo = 0.0;
    private double contractPrice = 0.0;

    public Contract(Airport inDepartureAirport, Airport inArrivalAirport, Date inDepartureTime, Date inArrivalTime, int inPAX, double inCargo, double inPrice){
        this.contractDepartureAirport = inDepartureAirport;
        this.contractArrivalAirport = inArrivalAirport;
        this.contractDepartureTime = inDepartureTime;
        this.contractArrivalTime = inArrivalTime;
        this.contractPAX = inPAX;
        this.contractCargo = inCargo;
        this.contractPrice = inPrice;
    }

    public Airport getContractDepartureAirport() {
        return contractDepartureAirport;
    }

    public void setContractDepartureAirport(Airport contractDepartureAirport) {
        this.contractDepartureAirport = contractDepartureAirport;
    }

    public Airport getContractArrivalAirport() {
        return contractArrivalAirport;
    }

    public void setContractArrivalAirport(Airport contractArrivalAirport) {
        this.contractArrivalAirport = contractArrivalAirport;
    }

    public Date getContractDepartureTime() {
        return contractDepartureTime;
    }

    public void setContractDepartureTime(Date contractDepartureTime) {
        this.contractDepartureTime = contractDepartureTime;
    }

    public Date getContractArrivalTime() {
        return contractArrivalTime;
    }

    public void setContractArrivalTime(Date contractArrivalTime) {
        this.contractArrivalTime = contractArrivalTime;
    }

    public int getContractPAX() {
        return contractPAX;
    }

    public void setContractPAX(int contractPAX) {
        this.contractPAX = contractPAX;
    }

    public double getContractCargo() {
        return contractCargo;
    }

    public void setContractCargo(double contractCargo) {
        this.contractCargo = contractCargo;
    }

    public double getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(double contractPrice) {
        this.contractPrice = contractPrice;
    }
}
