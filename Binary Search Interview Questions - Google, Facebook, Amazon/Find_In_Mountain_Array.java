package com.company;

public class Find_In_Mountain_Array {

    // method for finding peak element
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start)/2;

            if (arr[mid]>arr[mid+1]){
                // you are in decreasing part of array
                // arr[mid] may be the ans but check out left part
                end = mid;
            }
            else {
                // you are in increasing part of array
                start = mid + 1; // beacuse we know that mid+1 element is greater tha mid element
            }
        }
        // in the end.. start==end and pointing to the largest number due to above two checks
        //start and end are always trying to find the largest element in above two checks
        // hence , when both pointing to one elemnt then that is the maximum one
        return start; //or end as both are same
    }

    static int oabs(int[]arr , int target , int start , int end){


        // find whether the array is sorted in ascending or descending order.
        boolean isAsc;
        if (arr[start]< arr[end]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }
        while (start<=end){
            //find the middle element.
//            int mid = (start + end)/2; //possibility of start + end to exceed the limit of integer in java.
            // better way to find mid:
            int mid = start + (end - start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;

                }
                else {
                    start = mid + 1;
                }

            }
            else {
                if (target>arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }






        }
        return -1;

    }
    int search(int[]arr , int target){
        int peak =peakIndexInMountainArray(arr);
        int firstTry = oabs(arr , target , 0 , peak);
        if (firstTry!= -1){
            return firstTry;
        }
        //otherwise try to search in next part that has decreasing array
        return oabs(arr , target , peak+1 , arr.length-1);

    }




















    public static void main(String[] args) {


    }
}
