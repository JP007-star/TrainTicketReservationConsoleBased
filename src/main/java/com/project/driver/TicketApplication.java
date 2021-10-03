package com.project.driver;
import com.project.model.TrainDAO;

import java.sql.SQLException;
import java.util.Scanner;
public class TicketApplication {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TrainDAO trainDAO=new TrainDAO();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Train Number:");
        int trainNo= Integer.parseInt(scanner.nextLine());
        trainDAO.findTrain(trainNo);
        System.out.println(trainDAO.findTrain(trainNo));
        System.out.println("Enter the Travel Date:");
        String travelDate=scanner.nextLine();
        System.out.println("Enter Passenger Name:");
        String name=scanner.nextLine();
        System.out.println("Enter Age:");
        int age=scanner.nextInt();
        System.out.println("Enter Gender (M/F):");
        String gender=scanner.next();
        System.out.println('\n'+trainNo+'\n'+ "\n" +travelDate+'\n'+name+'\n'+age+'\n'+gender);
    }
}
