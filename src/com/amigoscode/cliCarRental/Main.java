package com.amigoscode.cliCarRental;

import java.util.Scanner;
import com.amigoscode.cliCarRental.client.ClientService;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Runs indefinitely until "7" is entered
        while (true) {
            System.out.println("Type a number and press ENTER:");
            System.out.println("1️⃣ - Book Car");
            System.out.println("2️⃣ - View All User Booked Cars");
            System.out.println("3️⃣ - View All Bookings");
            System.out.println("4️⃣ - View Available Cars");
            System.out.println("5️⃣ - View Available Electric Cars");
            System.out.println("6️⃣ - View all users");
            System.out.println("7️⃣ - Exit");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Running module one...");
                    break;
                case 2:
                    System.out.println("Running module two...");
                    break;
                case 3:
                    System.out.println("Running module three...");
                    break;
                case 4:
                    System.out.println("Running module four...");
                    break;
                case 5:
                    System.out.println("Running module five...");
                    break;
                case 6:
                    System.out.println("Running module six...");
                    ClientService.printClientList();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("This is not a valid input. Try entering 1, 2, 3, 4, 5, 6 or 7.");
                    break;
            }
        }
    }
}
