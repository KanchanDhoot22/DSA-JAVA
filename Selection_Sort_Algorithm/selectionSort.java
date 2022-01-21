package com.company;

import java.util.Arrays;

public class selectionSort {
    static int getMaxIndex(int [] arr , int start , int end){
        int max = start;
        for (int i = start; i<=end; i++){
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selection(int [] arr){
        for (int i = 0; i<arr.length; i++){
            //find the max item in remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , lastIndex);
            swap(arr , maxIndex , lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2 , 4 , 1 , 5 , 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
}
