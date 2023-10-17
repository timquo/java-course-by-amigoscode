package com.amigoscode;

public class Exercise01 {

    public static void task01() {
        System.out.println("I love cats");
        // System.out.println("I hate cats");
    }

    public static void task02() {
        int annaAge = 10;
        int borisAge = 12;
        boolean isBorisOlder;
        isBorisOlder = borisAge > annaAge;
        System.out.println("It is " + isBorisOlder + " that Boris is older.");
    }

    public static void task03() {
        String firstWord = "foo";
        String secondWord = "bar";
        boolean areWordsEqual;
        areWordsEqual = firstWord == secondWord;
        System.out.println("It is " + areWordsEqual + " that given words are equal.");
    }

    public static void task04() {
        String greeting = "Hello fellow kids!";
        System.out.println(greeting.toUpperCase());
    }

    public static void task05() {
        String greeting = "capitalize me!";
        System.out.println(greeting.substring(0, 1).toUpperCase() +
                greeting.substring(1));
    }

    public static void task06() {
        task02();
    }

}
