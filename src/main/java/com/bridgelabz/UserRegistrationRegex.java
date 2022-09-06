package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {

    public boolean validFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("First name is valid");
        }
        else{
            System.out.println("First name is Invalid");
        }
        return match.matches();
    }
}
