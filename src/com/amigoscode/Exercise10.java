package com.amigoscode;

public class Exercise10 {
    public static void task01(String[] args) {
        int finalSum = 0;
        StringBuilder leftoverString = new StringBuilder();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                finalSum += num;
            } catch (NumberFormatException e) {
                if (leftoverString.length() > 0) {
                    leftoverString.append(", ");
                }
                leftoverString.append(arg);
            }
        }

        System.out.println("Given number sum to: " + finalSum);

        if (leftoverString.length() > 0) {
            System.out.println("and these are not the numbers: " + leftoverString);

        }
    }

    public static void task02() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
        }
    }
}