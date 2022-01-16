package com.company;

public class infiniteSortedArray {
    static int Binarysearch(int[] arr , int target , int start , int end){

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
        return -1;
    }
    static int ans(int [] arr , int target){
        // first find the range.
        // start with the box of size 2.
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target>arr[end]){
            int newStart = end + 1;
            //double the box value.
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return Binarysearch(arr , target , start , end);
    }


    public static void main(String[] args) {
        int [] arr = {12 , 23 , 45 , 78 , 102 , 239, 500, 1002, 1222, 1345};
        int target = 1002;
        System.out.println(ans(arr , target));


    }
}
