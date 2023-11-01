package com.amigoscode.cliCarRental.car;

public class Car {
    private final String plateNumber;
    private final CarBrand brand;
    private final int priceInDollars;
    private final boolean isElectric;
    private String parkingSpace;
    private boolean isBooked;

    public Car(String plateNumber, CarBrand brand, int priceInDollars, boolean isElectric) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.priceInDollars = priceInDollars;
        this.isElectric = isElectric;
        this.isBooked = false;
        this.parkingSpace = null;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public int getPrice() {
        return priceInDollars;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public String getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "Plate Number: " + plateNumber + ", Brand: " + brand + ", Price: $" + priceInDollars +
                ", Electric: " + (isElectric ? "Yes" : "No") + ", Is booked: " + (isBooked ? "Yes" : "No") +
                ", Parking Space: " + parkingSpace;
    }

}
