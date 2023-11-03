package com.amigoscode.exercise12;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Car.Brand.FORD, false, 12_322_232.99);

        System.out.println(car1);

        car1.setBrand(Car.Brand.TESLA);
        car1.setPrice(99_999.99);
        car1.setElectric(true);

        System.out.println(car1.getBrand());
        System.out.println(car1.getPrice());
        System.out.println(car1.getElectric());

        System.out.println(car1);

        // Exercise 5 starts here:
        Car car2 = new Car(Car.Brand.FORD, false, 12_322_233.99);
        Car car3 = new Car(Car.Brand.BMW, true, 2_322_233.99);

        Dealer dealer = new Dealer(2);
        dealer.addNewCar(car1);
        dealer.addNewCar(car2);
        dealer.addNewCar(car3);

        System.out.println(dealer);

        // Exercise 7 starts here:

        String searchingThisBrand = "Tesla";
        System.out.println("You were searching for " + searchingThisBrand + " and here's what we found: "
                + dealer.findCarByManufacturer(searchingThisBrand));
        String searchingThisBrand2 = "BMW";
        System.out.println("You were searching for " + searchingThisBrand2 + " and here's what we found: "
                + dealer.findCarByManufacturer(searchingThisBrand2));
    }
}
