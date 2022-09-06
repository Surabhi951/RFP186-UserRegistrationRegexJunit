package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {

        UserRegistrationRegex userRegistrationRegex = new UserRegistrationRegex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        userRegistrationRegex.validFirstName(firstName);
    }
}
