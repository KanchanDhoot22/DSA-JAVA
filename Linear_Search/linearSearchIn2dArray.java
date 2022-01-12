package com.company;

import java.util.Arrays;

public class linearSearchIn2dArray {
    static int[] search3(int[][] arr , int target){
        for(int row=0; row<arr.length; row++){
            for (int col=0 ; col<arr[row].length; col++){
                if (arr[row][col]==target){
                   return new int[]{row , col};
                }
            }
        }
        return new int[]{-1 , -1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
       for(int [] ints : arr) {
           for (int element : ints) {
               if (element > max) {
                   max = element;
               }
           }
       }
         return max;

    }







    public static void main(String[] args) {
        int [][] arr = {
                {23 , 67, 45},
                 {2 , 6, 12},
                 {4 , 3 , 90}
        };
        int target = 6;
//        int [] ans = max(arr); //format of return value (row , col)
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
