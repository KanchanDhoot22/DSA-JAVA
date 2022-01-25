package com.company;
//https://leetcode.com/problems/missing-number/
//amazon question

public class MissingNumber {

    public int missingNumber(int[]arr){
        int i = 0;

        while (i< arr.length){
            int correctIndex = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index< arr.length; index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }

     void swap(int[]arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {

    }
}
