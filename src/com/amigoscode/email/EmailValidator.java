package com.amigoscode.email;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public boolean isValid(String email) {
//        return email != null && email.contains("@");
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
