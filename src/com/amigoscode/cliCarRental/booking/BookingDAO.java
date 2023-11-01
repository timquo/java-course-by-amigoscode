package com.amigoscode.cliCarRental.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    private static final List<Booking> bookingList = new ArrayList<>();

//    static {
//        // Create mock-up clients and add them to the list
//        Client client1 = new Client("John", "Doe", "123-456-7890", true);
//        Client client2 = new Client("Alice", "Johnson", "987-654-3210", false);
//        Client client3 = new Client("Bob", "Smith", "555-123-4567", true);
//
//        clientList.add(client1);
//        clientList.add(client2);
//        clientList.add(client3);
//    }

    public static List<Booking> getAllBookings() {
        return new ArrayList<>(bookingList);
    }

    public static void addBooking(Booking booking) {
        bookingList.add(booking);
    }
}
