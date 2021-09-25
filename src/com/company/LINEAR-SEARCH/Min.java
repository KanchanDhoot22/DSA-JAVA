package com.company;

public class Min {
    public static void main(String[] args) {
        int [] arr = {12 , 45 , 3 , 56 , 8 , 67};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
