package com.amigoscode.exercise12;

public class Car {
    private Brand brand;
    private boolean electric;
    private double price;

    public enum Brand {
        TOYOTA, TESLA, FORD, BMW
    }

    public Car(Brand brand, boolean electric, double price) {
        this.brand = brand;
        this.electric = electric;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean getElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        Car.this.electric = electric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s%s car ($%.2f)", brand, electric ? " electric" : "", price);
    }

}
