package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationRegexTest {
    static UserRegistrationRegex userRegistration;

    @BeforeAll
    public static void initialize() {
        userRegistration = new UserRegistrationRegex();
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Surabhi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("surabhi");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.validLastName("Bhagat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnFalse() {
        boolean result = userRegistration.validLastName("bhagat");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validEmail("xyz123@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validEmail("Xyz.co.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validMobileNo("91 8695462369");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validMobileNo("8659421369");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validPasswordRule1("abc@xyz123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validPasswordRule1("abc@123");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validPasswordRule2("Abc@1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validPasswordRule2("abc@1234");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validPasswordRule3("xyz@abc1.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validPasswordRule3("xyz@abcd");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnTrue(){
        boolean result=userRegistration.validPasswordRule4("xyz@1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnFalse(){
        boolean result=userRegistration.validPasswordRule4("xyz123ab");
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com" , "abc111@abc.com" ,"abc-100@abc.net" , "abc.100@abc.com.au" , "abc@1.com"})
    public void givenEmail_WhenValid_ShouldReturnTrue(String email) {
        Assertions.assertTrue(userRegistration.validEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",  "abc@gmail.com.1a"})
    public void givenEmail_WhenInValid_ShouldReturnFalse(String email) {
        Assertions.assertFalse(userRegistration.validEmail(email));
    }
}
