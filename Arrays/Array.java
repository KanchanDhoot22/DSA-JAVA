package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Array of primitives
//        storing 5 roll numbers.
//          int [] rollnos = {1 , 2 , 3, 4, 5,}; //array is created to store roll numbers.
//String arr [] = new String[5];
int arr [] = new int[5];
//arr[0]=23;
//arr[1]= 4;
//arr[2]= 6;
//arr[3]=99;
//arr[4]= 34;
//        System.out.println(arr[4]);
//        giving input to an array using for loops;
//        System.out.println("enter any 5 integers to create an array.");
//        for (int i=0 ; i< arr.length ; i++){
//                arr[i]= sc.nextInt();
//        }
//        System.out.println("your array has been created , the values are as follows:");
//        for (int i=0 ; i< arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }
//        we can also use for each loop to print the array.
//for(int num : arr){
//    System.out.println(num); //here num represents the element value in array simililar to arr[i];
//
//
//}
//        Using toString(); method to print the array and THE BEST
//        System.out.println(Arrays.toString(arr));
//              Array of objects
        String [] str = new String[5];
        for (int i=0; i<str.length; i++){
            str[i]=sc.next();
        }
            str[1]="total";
        System.out.println(Arrays.toString(str));




    }
}
