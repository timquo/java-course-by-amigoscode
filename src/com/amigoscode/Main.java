package com.amigoscode;

// import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // int[] numbers = new int[3];
        System.out.println("test");

        // following line runs all the homework modules
        homework();
    }

    public static void homework() {
        Exercise01.task01();
        Exercise01.task02();
        Exercise01.task03();
        Exercise01.task04();
        Exercise01.task05();
        Exercise01.task06();
        System.out.println("First set of exercises is done!");

        Exercise02.task01();
        Exercise02.task02();
        Exercise02.task03();
        Exercise02.task04();
        Exercise02.task05();
        Exercise02.task06();
        Exercise02.task07();
        Exercise02.task08();
        Exercise02.task09();
        Exercise02.task10();
        Exercise02.task11();
        Exercise02.task12();
        Exercise02.task13();
        Exercise02.task14();
        Exercise02.task15();
        System.out.println("Second set of exercises is done!");

        Exercise03.task01();
        Exercise03.task02();
        Exercise03.task03();
        Exercise03.task04();
        Exercise03.task05();
        Exercise03.task06();
        Exercise03.task07();
        Exercise03.task08();
        System.out.println("Third set of exercises is done!");

        System.out.println(Exercise04.task01("Hello World!"));
        System.out.println(Exercise04.task02("   amig os cod e  "));
        String[] ex04Task03Array = {"hello", "ola", "bye", "bingo"};
        System.out.println(Exercise04.task03(ex04Task03Array));
        System.out.println("Fourth set of exercises is done!");
        }
    }

