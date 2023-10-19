package com.amigoscode;

public class Exercise04 {

    public static String task01(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }

    public static String task02(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String output = input.replaceAll("\\s", "");
        output = Character.toUpperCase(output.charAt(0)) + output.substring(1);
        return output;
    }

    public static String task03(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }

        String longestStrings = "";
        int maxStringLength = 0;

        for (String word : array) {
            if (word != null && word.length() > maxStringLength) {
                maxStringLength = word.length();
                longestStrings = word;
            } else if (word != null && word.length() == maxStringLength && !longestStrings.contains(word)) {
                longestStrings += ", " + word;
            }
        }
        return longestStrings;
    }
}