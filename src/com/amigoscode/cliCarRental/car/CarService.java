package com.amigoscode.cliCarRental.car;

import java.util.List;

public class CarService {
    // Populate garage with cars
    public static void parkTemplateCars() {
        Car car1 = new Car("ABC123", CarBrand.TOYOTA, 25000, false);
        Car car2 = new Car("XYZ789", CarBrand.BMW, 45000, true);
        Car car3 = new Car("ELE456", CarBrand.TESLA, 60000, true);
        Car car4 = new Car("123XXX", CarBrand.FORD, 35000, false);
        Car car5 = new Car("456ABC", CarBrand.TOYOTA, 28000, false);
        Car car6 = new Car("749ESE", CarBrand.TESLA, 65000, true);
        Car car7 = new Car("ABC789", CarBrand.HONDA, 30000, true);
        Car car8 = new Car("XDZ133", CarBrand.FORD, 42000, true);
        Car car9 = new Car("EGH233", CarBrand.TESLA, 68000, true);
        Car car10 = new Car("XDD426", CarBrand.BMW, 48000, true);
        Car car11 = new Car("151EDE", CarBrand.TESLA, 72000, true);


        Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11};

        for (Car car : cars) {
            CarSpace space = CarDAO.findAvailableSpace();
            if (space != null) {
                CarDAO.parkCar(car, space);
                car.setParkingSpace(String.valueOf(space));
            } else {
                System.out.println("Warning: no available parking space for " + car.getPlateNumber());
            }
        }
    }

    public static void viewAllBookedCars() {
        List<Car> cars = CarDAO.getAllCars();
        boolean flag = true;
        for (Car car : cars) {
            if (car.getIsBooked()) {
                System.out.println(car);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("There are no booked cars. Try booking one?");
        }
    }

    public static void viewAllAvailableCars() {
        List<Car> cars = CarDAO.getAllCars();
        boolean flag = true;
        for (Car car : cars) {
            if (!car.getIsBooked()) {
                System.out.println(car);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("There are no free cars. Try again later!");
        }
    }

    public static void viewAllAvailableElectricCars() {
        List<Car> cars = CarDAO.getAllCars();
        boolean flag = true;
        for (Car car : cars) {
            if (!car.getIsBooked() && car.getIsElectric()) {
                System.out.println(car);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("There are no free electric cars. Try again later!");
        }
    }

    public static Car carByCarPlate(String carPlate) {
        List<Car> cars = CarDAO.getAllCars();
        for (Car car : cars) {
            if (carPlate.equals(car.getPlateNumber()) && !car.getIsBooked()) {
                return car;
            }
        }
        return null;
    }

}
