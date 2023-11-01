package com.amigoscode.cliCarRental.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class IdGenerator {
    private final Set<String> generatedStrings = new HashSet<>();
    private final Random random = new Random();

    public String generateUniqueString() {
        String randomString;
        do {
            randomString = generateRandomString();
        } while (!generatedStrings.add(randomString));

        return randomString;
    }

    private String generateRandomString() {
        int STRING_LENGTH = 12;
        StringBuilder sb = new StringBuilder(STRING_LENGTH);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < STRING_LENGTH; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

//    public static void main(String[] args) {
//        IdGenerator generator = new IdGenerator();
//
//        for (int i = 0; i < 10; i++) {
//            String uniqueString = generator.generateUniqueString();
//            System.out.println(uniqueString);
//        }
//    }
}
