package com.amigoscode.cliCarRental.booking;

import com.amigoscode.cliCarRental.car.Car;
import com.amigoscode.cliCarRental.utils.IdGenerator;

public class Booking {
    private final String userId;
    private final Car car;

    public String getUserId() {
        return userId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    // can probably add time as well
    private final String bookingId;
    private final double dailyPrice;

    public Booking(String userId, Car car) {
        this.userId = userId;
        this.car = car;
        this.bookingId = IdGenerator.getInstance().generateUniqueString();
        this.dailyPrice = BookingService.calculateDailyPrice(car);
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + "\nUser ID: " + userId + "\nCar Details:\n" + car.toString() +
                "\nDaily Price: $" + String.format("%.2f", dailyPrice);
    }

}
