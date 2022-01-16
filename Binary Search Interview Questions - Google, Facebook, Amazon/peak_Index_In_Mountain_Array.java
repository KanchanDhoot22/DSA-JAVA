package com.company;

public class peak_Index_In_Mountain_Array {

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
 public static void main(String[] args) {

    }
}
