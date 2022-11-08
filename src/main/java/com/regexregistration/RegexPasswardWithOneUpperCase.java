package com.regexregistration;

import java.util.regex.Pattern;

public class RegexPasswardWithOneUpperCase {
    public static void  main(String[] args) {
        String passwardRegex = "^(?=.*[A-Z])[A-Za-z]{8,}$";
        String passward = "anpurAryan";
        boolean result = Pattern.matches(passwardRegex, passward);

        System.out.println(result);
    }

}
