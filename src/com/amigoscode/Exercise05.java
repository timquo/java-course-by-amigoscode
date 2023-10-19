package com.amigoscode;

public class Exercise05 {

    public static void task01(int number) {
        System.out.println("Number " + number + " multiplied by 2 is " + (number * 2));
    }

    public static void task02(int numberOne, int numberTwo) {
        System.out.println(numberOne + " + " + numberTwo + " = "
                + (numberOne + numberTwo));
    }

    public static void task03(int number) {
        System.out.println("Your negated number is: " + (-number));
    }

    public static boolean task04(int num1, int num2) {
        return num1 == num2;
    }

    public static void task05(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("The first number is larger");
        } else if (num2 > num1) {
            System.out.println("The second number is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }

    public static String task06(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static int task07(String[] args) {
        return args.length;
    }

    public static void task08(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("This is not a valid sentence!");
            return;
        }

        int numberOfWords = sentence.split(" ").length;
        System.out.println("The sentence contains " + numberOfWords + " words.");
    }
}