package com.company;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 123.6789f;
        // if you have to print till 2 decimal number :
        System.out.printf("formatted number is %.2f" , a);
        System.out.println();


        System.out.println(Math.PI);
        System.out.println();
        System.out.printf("PI %.3f" , Math.PI);
        System.out.println();

        System.out.printf("Hello my name is %s and i am %s" , "kanchan" , "cute");

    }
}
