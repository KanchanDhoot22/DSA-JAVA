package com.company;

public class binarySearch {
    //return the index
    /// return -1 if the target element does not exist in the array
    static int Binarysearch(int[] arr , int target){
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
        return -1;
    }


    public static void main(String[] args) {
        int[]arr={ -12 ,2 , 4 , 16 , 32 , 54 ,91};
        int target = 54;
        int ans = Binarysearch(arr , target);
        System.out.println(ans);

    }






}
