package com.amigoscode.cliCarRental.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    private static final List<Booking> bookingList = new ArrayList<>();

    public static List<Booking> getAllBookings() {
        return new ArrayList<>(bookingList);
    }

    public static void addBooking(Booking booking) {
        bookingList.add(booking);
    }
}
