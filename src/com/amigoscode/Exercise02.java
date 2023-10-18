package com.amigoscode;

import java.util.Arrays;

public class Exercise02 {

    public static void task01() {
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
    }

    public static void task02() {
        int[] numbers = new int[3];
        Arrays.fill(numbers, 4);
        System.out.println(Arrays.toString(numbers));
    }

    public static void task03() {
        int[] numbers = new int[3];
        Arrays.fill(numbers, 4);
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));
    }

    public static void task04() {
        String[] letters = {"a", "b", "c"};
        System.out.println(Arrays.toString(letters));
    }

    public static void task05() {
        String[] letters = {"a", "b", "c"};
        String[] newLetters = letters;
        newLetters[0] = "z";
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(newLetters));
    }

    public static void task06() {
        String[] letters = {"a", "b", "c"};
        String[] newLetters = Arrays.copyOf(letters, letters.length);
        newLetters[0] = "z";
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(newLetters));
    }

    public static void task07() {
        String[] letters = {"a", "b", "c", "d"};
        for (String letter : letters) {
            System.out.println(letter);
        }
    }

    public static void task08() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task09() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void task10() {
        int[] numberArray = new int[11];
        for (int i = 0; i <= 10; i++) {
            numberArray[i] = i;
        }
        System.out.println(Arrays.toString(numberArray));
    }

    public static void task11() {
        int[] numArray = new int[5];
        Arrays.fill(numArray, 5);
        int sum = 0;
        for (int number : numArray) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void task12() {
        String[] phraseArray = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < phraseArray.length; i++) {
            phraseArray[i] = phraseArray[i].toUpperCase();
        }
        System.out.println(Arrays.toString(phraseArray));
    }

    public static void task13() {
        String[] words = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
        }
        System.out.println(Arrays.toString(words));
    }

    public static void task14() {
        String[] content = {"you", "are", "how", "hello"};
        String question = "";
        for (int i = content.length - 1; i >= 0; i--) {
            question += content[i] + " ";
        }
        System.out.println(question.substring(0, question.length() - 1) + "?");
    }

    public static void task15() {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");
        for (String number : numbers) {
            result += Double.parseDouble(number);
        }
        System.out.println("Total: " + result);
    }
}