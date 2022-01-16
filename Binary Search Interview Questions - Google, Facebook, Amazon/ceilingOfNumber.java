package com.company;

public class ceilingOfNumber {
    // ceiling is smallest no. >= target
    static int ceiling(int[] arr , int target){
        // but what if target element is greater than greatest element in array.
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element.
//            int mid = (start + end)/2; //possibility of start + end to exceed the limit of integer in java.
            // better way to find mid:
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;

            }
            else if (target> arr[mid]){
                start = mid + 1;
            }
            else {
                // ans found.
                return mid;
            }



        }
        return start;
    }










    public static void main(String[] args) {
        int[]arr={ -12 ,2 , 4 , 16 , 32 , 54 ,91};
        int target = 30;
        int ans = ceiling(arr , target);
        System.out.println(ans);







    }
}
