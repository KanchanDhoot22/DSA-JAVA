package com.company;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kanchan Dhoot";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println( name.toString());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('D'));
        System.out.println("        kanch     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
