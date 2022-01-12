package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArrays {
    public static void main(String[] args) {
/*

                  1 2 3
                  4 5 6
                  7 8 9


3 rows and 3 columns.


 */
//        int [][] arr = new int[3][]; //adding no. of rows is mandatory.
        Scanner sc = new Scanner(System.in);
//        arr.length -----> no. of rows
//        int [][] arr = {
//                {1 , 2 , 3}, //0th index
//                {4 , 5}, //1st index
//                {6, 7 , 8 , 9} //2nd index arr[2]; = {6 , 7 , 8 ,9}
//        };
           int arr [][] = new int[3][2];
           // input
            for (int row = 0 ; row< arr.length; row++){
//                for each col in every row
                for (int col=0; col<arr[row].length; col++){
                    arr[row][col]=sc.nextInt();
                }
            }
            // output
//        for (int row = 0 ; row< arr.length; row++){
//                for each col in every row
//            for (int col=0; col<arr[row].length; col++){
//                System.out.println(arr[row][col]+" ");
//            }
//        }
        // output
//        for (int row = 0 ; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
         //output using for each loop.
        for (int [] a:arr
             ) {
            System.out.println(Arrays.toString(a));

        }

    }
}
