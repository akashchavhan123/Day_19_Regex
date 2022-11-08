package com.regexregistration;

import java.util.regex.Pattern;

public class ValidFirstName {
    public static void  main(String[] args) {
        String firstNameRegex = "^[A-Z]{1}[a-zA-z]{2,}$";
        String FirstName = "Anupama";
        boolean result = Pattern.matches(firstNameRegex, FirstName);

        System.out.println(result);
    }
}
