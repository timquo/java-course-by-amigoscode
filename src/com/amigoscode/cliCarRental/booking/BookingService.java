package com.amigoscode.cliCarRental.booking;

import com.amigoscode.cliCarRental.car.Car;
import java.util.List;
import java.util.Scanner;
import com.amigoscode.cliCarRental.car.CarService;
import com.amigoscode.cliCarRental.client.ClientService;

public class BookingService {
    public static void bookACar() {
        Scanner scanner = new Scanner(System.in);
        String clientId;
        String carPlate;
        Car car;

        while (true) {
            System.out.print("Type a user ID: ");
            clientId = scanner.nextLine();
            if (!ClientService.clientIdExist(clientId)) {
                System.out.println("This is not a valid user ID.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Type a car plate: ");
            carPlate = scanner.nextLine();
            car = CarService.carByCarPlate(carPlate);
            if (car == null) {
                System.out.println("This is not a valid car plate or the car is not available now.");
            } else {
                break;
            }
        }

        Booking booking = new Booking(clientId, car);
        car.setIsBooked(true);
        BookingDAO.addBooking(booking);
        System.out.println("Booking is successful!");
        System.out.println(booking);
    }

    public static void printBookingList() {
        List<Booking> bookings = BookingDAO.getAllBookings();
        if (bookings.isEmpty()) {
            System.out.println("You have no bookings so far.");
            return;
        }

        for (Booking booking : bookings) {
            System.out.println("Booking ID: " + booking.getBookingId() + " Booking user ID: "
                    + booking.getUserId() + " for the daily rate of $" +
                    String.format("%.2f", booking.getDailyPrice()));
        }
    }

    public static double calculateDailyPrice (Car car) {
        return (double) car.getPrice() / 1000;
    }
}
