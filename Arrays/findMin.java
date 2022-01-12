package com.company;

public class findMin {
    static int min(int[] arr){
        int ans = arr[0];
        for (int i =1; i< arr.length; i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }






    public static void main(String[] args) {
                          int[]arr = {12 , -9 , 15 , 3 , 67 , 88 , 1};
        System.out.println(min(arr));
    }
}
