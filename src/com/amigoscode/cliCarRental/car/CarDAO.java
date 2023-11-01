package com.amigoscode.cliCarRental.car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private static final Car[] garage = new Car[CarSpace.values().length];

    // Create a private static instance of IdGenerator
    private static final CarDAO instance = new CarDAO();

    // Make the constructor private to prevent external instantiation
    private CarDAO() {
    }

    public static CarDAO getInstance() {
        return instance;
    }

    public static CarSpace findAvailableSpace() {
        for (CarSpace space : CarSpace.values()) {
            if (garage[space.ordinal()] == null) {
                return space;
            }
        }
        return null;
    }

    public static boolean parkCar(Car car, CarSpace space) {
        int index = space.ordinal();
        if (index >= 0 && index < garage.length && garage[index] == null) {
            garage[index] = car;
            return true;
        }
        return false;
    }

    public static List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        for (Car car : garage) {
            if (car != null) {
                cars.add(car);
            }
        }
        return cars;
    }
}
