package com.amigoscode;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

    public static void task01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text here:");
        String input = scanner.nextLine();
        System.out.println("Here's your string in upper: "
                + input.toUpperCase());
    }

    public static void task02(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Please, give me some valid numbers.");
            return;
        }

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }

    public static void task03() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void task04() {
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What do you call fake spaghetti? An impasta!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the math book sad? It had too many problems.",
                "Why did the bicycle fall over? Because it was two-tired!",
                "Why don't some fish play piano? You can't tuna fish!"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Want to hear a joke? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                System.out.println("Ok, bye!");
                break;
            } else if (input.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            } else {
                System.out.println("Invalid input. Type \"yes\" or \"no\": ");
            }
        }


    }
}