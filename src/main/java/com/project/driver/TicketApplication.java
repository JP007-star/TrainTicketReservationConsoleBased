package com.project.driver;

import java.util.Scanner;

public class TicketApplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Train Number:");
        int trainNo= Integer.parseInt(scanner.nextLine());
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
