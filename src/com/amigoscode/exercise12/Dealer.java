package com.amigoscode.exercise12;

import java.util.Arrays;

public class Dealer {
    private int capacity;
    private Car[] availableCars;

    public Dealer (int capacity) {
        this.capacity = capacity;
        this.availableCars = new Car[capacity];
    }

    public int getCapacity () {
        return capacity;
    }

    public Car[] getAvailableCars () {
        return availableCars;
    }

    public int getCarsAmount() {
        int carsAmount = 0;
        for (Car car : availableCars) {
            if (car != null) {
                carsAmount++;
            }
        }
        return carsAmount;
    }

    public void addNewCar (Car car) {
        int placesTaken = getCarsAmount();
        if (placesTaken < capacity) {
            availableCars[placesTaken] = car;
            System.out.println("Your " + car.getBrand() + " is hosted in our garage. Nice and cozy.");
        } else {
            System.out.println("404: can't hold your " + car.getBrand() + " — space not found.");
        }
    }

    public Car findCarByManufacturer (String brand) {
        for (Car car : availableCars) {
            if ( (car != null) && car.getBrand().toString().equalsIgnoreCase(brand)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "capacity=" + capacity +
                ", availableCars=" + Arrays.toString(availableCars) +
                '}';
    }
}
