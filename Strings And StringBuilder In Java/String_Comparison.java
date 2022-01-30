package com.company;

public class String_Comparison {
    public static void main(String[] args) {
        String a = "Kanchan";
        String b = "Kanchan";
        String c = a;
        System.out.println(c==a); // gives true

        // ==

//        System.out.println(a==b);  // will give true because they are pointing to same object

        String name1 = new String("java");
        String name2 = new String("java");
        System.out.println(name1==name2); // will give false because these are pointing to different objects.

              // if just have to check values
        System.out.println(name1.equals(name2));  // gives true
        // string method
        System.out.println(name1.charAt(0));
    }
}
