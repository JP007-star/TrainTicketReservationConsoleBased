package com.project.model;

public class Ticket {
    int counter=100;
    String pnr;
    String travelDate;
    Train train;
    Ticket ticket;
    Passenger passenger;

    public Ticket( String travelDate, com.project.model.Train train) {
        this.travelDate = travelDate;
        this.train = train;
    }

    public Ticket() {

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
    public String generatePNR(){
        Ticket ticket=new Ticket(travelDate,train);
        char source=train.getSource().charAt(0);
        char destination=train.getDestination().charAt(0);
        String travelDate= ticket.getTravelDate();
        String pnrString=source+""+destination+"_"+travelDate+"_"+counter;
        counter++;
        return pnrString;
    }
}
