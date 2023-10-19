package com.amigoscode;

public class Exercise03 {

    public static void task01() {
        int movie01Rank = 98;
        int movie02Rank = 87;
        if (movie01Rank == movie02Rank) {
            System.out.println("Movies are equally good!");
        } else {
            System.out.println("Movies are ranked differently.");
        }
    }

    public static void task02() {
        String login = "Bob";
        String password = "Bob";
        if (login == password) {
            System.out.println("Your login and password are the same, aren't they, "
            + login + "?");
        }
    }

    public static void task03() {
        String firstString = new String("word");
        String secondString = new String("word");
        if (firstString == secondString) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }
        if (firstString.equals(secondString)) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }
    }

    public static void task04() {
        int firstNumber = 6;
        int secondNumber = 3;
        if (firstNumber > secondNumber) {
            System.out.println("First number is BIGGER!");
        } else if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("First number is smaller!");
        }
    }

    public static void task05() {
        int firstNumber = 6;
        int secondNumber = 3;
        int thirdNumber = 7;
        if (firstNumber > secondNumber && firstNumber < thirdNumber) {
            System.out.println("1st number is more than 2nd and less that 3rd!");
        } else {
            System.out.println("Houston, we have a problem!");
        }
    }

    public static void task06() {
        String word = "Hello!";
        if (word.charAt(0) == 'H') {
            System.out.println("Major success!");
        } else {
            System.out.println("Failures can happen too.");
        }
    }

    public static void task07() {
        String password = "panda bear";
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == 'n') {
                System.out.println("We have a match!");
                break;
            }
        }
    }

    public static void task08() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even!");
            }
        }
    }
}