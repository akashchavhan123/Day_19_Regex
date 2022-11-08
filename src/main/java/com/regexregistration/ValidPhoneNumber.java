package com.regexregistration;

import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static void  main(String[] args) {
        String phoneNumberRegex = "^[0-9]{2}\\s[0-9]{10}$";
        String phoneNumber = "91 8904165452";
        boolean result = Pattern.matches(phoneNumberRegex, phoneNumber);

        System.out.println(result);
    }
}
