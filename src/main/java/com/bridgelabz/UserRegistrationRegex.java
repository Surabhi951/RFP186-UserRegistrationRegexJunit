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

    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(lastName);
        if (match.matches())
            System.out.println("Last name is Valid");
        else
            System.out.println("Last name is InValid");
        return match.matches();
    }

    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@(.+)$");
        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email is Valid");
        else
            System.out.println("Email is InValid");
        return match.matches();
    }

    public boolean validMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile("^[\\d]{2}\\s[\\d]{10}$");
        Matcher match = pattern.matcher(mobileNo);
        if (match.matches())
            System.out.println("Mobile number is Valid");
        else
            System.out.println("Mobile number is InValid");
        return match.matches();
    }
}
