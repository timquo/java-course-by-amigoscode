package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Exercise07 {

    public static void task01() {
        System.out.println("Today's date is " + LocalDate.now());
        System.out.println("Current date and time are " + LocalDateTime.now());
    }

    public static void task02() {
        LocalDate dateOfBirth = LocalDate.of(1989, 6, 7);
        System.out.println("My date of birth is — " + dateOfBirth);
    }

    public static void task03() {
        LocalDate dateOfBirth = LocalDate.of(1989, 6, 7);
        LocalDate newDate = dateOfBirth.plusDays(100);
        System.out.println("Here's the new date that occurred 100 days later: " + newDate);
    }

    public static void task04() {
        LocalDate dateOfBirth = LocalDate.of(1989, 6, 7);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(dateOfBirth, currentDate);
        System.out.println("You are " + age + " years old.");
    }

    private static int calculateAge(LocalDate dateOfBirth, LocalDate currentDate) {
        Period difference = dateOfBirth.until(currentDate);
        return difference.getYears();
    }
}