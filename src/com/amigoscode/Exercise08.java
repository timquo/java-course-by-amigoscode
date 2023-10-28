package com.amigoscode;

public class Exercise08 {

    public static void task01() {
        System.out.println("Available size is: " + TshirtSize.XXL);
    }

    public static void task02() {
        TshirtSize[] sizes = TshirtSize.values();

        for (TshirtSize size : sizes) {
            System.out.println(size.name().toLowerCase());
        }
    }
}