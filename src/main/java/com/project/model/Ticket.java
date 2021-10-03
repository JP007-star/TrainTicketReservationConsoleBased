package com.project.model;

public class Ticket {
    int counter;
    String pnr;
    String travelDate;
    Train train;
    Passenger passenger;

    public Ticket(int counter, String pnr, String travelDate, com.project.model.Train train, Passenger passenger) {
        this.counter = counter;
        this.pnr = pnr;
        this.travelDate = travelDate;
        this.train = train;
        this.passenger = passenger;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
