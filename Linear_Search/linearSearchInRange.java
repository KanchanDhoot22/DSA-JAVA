package com.company;

public class linearSearchInRange {

    static int linearSearch2(int[] arr , int target , int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }








    public static void main(String[] args) {
                        int[] arr = {12 , 16 , 34 , 89 , 7 , 45};
                        int target = 16;
        System.out.println(linearSearch2(arr , target , 1 , 5));

    }
}
