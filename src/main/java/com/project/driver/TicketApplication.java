package com.project.driver;

import com.project.model.Passenger;
import com.project.model.TrainDAO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class TicketApplication {
    final static String DATE_FORMAT = "dd-MM-yyyy";
    public static void main(String[] args) {
        TrainDAO trainDAO=new TrainDAO();
        ArrayList<Passenger> passengerArrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Train Number:");
        int trainNo= Integer.parseInt(scanner.nextLine());
        System.out.println(trainDAO.findTrain(trainNo));
        if(trainDAO.findTrain(trainNo)!="Train with given Train number does not exist!") {
            System.out.println("Enter the Travel Date:");
            String travelDate = scanner.nextLine();
            System.out.println(isDateValid(travelDate));
            if(isDateValid(travelDate)!="TravelDate is before current date!...") {
                System.out.println("Enter the No of Passengers:");
                int noOfPassengers = Integer.parseInt(scanner.nextLine());
                for (int i = 1; i <= noOfPassengers; i++) {
                    System.out.println("Enter Passenger Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Gender (M/F):");
                    char gender = scanner.nextLine().charAt(0);
                    Passenger passenger = new Passenger(name, age, gender);
                    passengerArrayList.add(passenger);
                }
                for (Passenger passenger : passengerArrayList) {
                    System.out.println(passenger);
                }
            }
        }
    }


    public static String isDateValid(String date)
    {
        try {
            DateFormat travelDate = new SimpleDateFormat(DATE_FORMAT);
            travelDate.setLenient(false);
            travelDate.parse(date);
            DateFormat currentDate = new SimpleDateFormat(DATE_FORMAT);
            Date todayDate = new Date();
            if(travelDate.parse(date).after(todayDate)){
                  return "";
            }
            else
            return "TravelDate is before current date!...";
        } catch (ParseException e) {
            return "TravelDate is before current date!...";
        }
    }
}
