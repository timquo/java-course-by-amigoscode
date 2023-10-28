package com.amigoscode;

import com.amigoscode.email.EmailValidator;

public class Exercise09 {
    public static void  task01() {
        EmailValidator validator = new EmailValidator();
        String email1 = "what@anemail.com";
        String email2 = "info+reply@mail.co.uk";
        String email3 = "---";
        String email4 = "    @";
        System.out.println(validator.isValid(email1));
        System.out.println(validator.isValid(email2));
        System.out.println(validator.isValid(email3));
        System.out.println(validator.isValid(email4));
    }
}