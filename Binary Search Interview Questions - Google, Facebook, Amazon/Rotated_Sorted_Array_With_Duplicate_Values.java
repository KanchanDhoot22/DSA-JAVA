package com.company;

public class Rotated_Sorted_Array_With_Duplicate_Values {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if (mid < end && arr[mid]>arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid - 1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }


        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if (mid < end && arr[mid]>arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid - 1]){
                return mid-1;
            }
           // if elements at end , start , middle are equal then just skip the duplicates.
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip the duplicates.
                // NOTE : what if these elements at start and end were the pivots.
                // check if start is pivot.
                if (arr[start] > arr[start + 1]){
                    return start; // start is pivot.
                }
                start++;
                // check whether end is pivot.
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right.
            else if (arr[start] < arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start = mid + 1;
            }
            else {
                end = end -1;
            }


        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if you did not find the pivot it means that array is not rotated.
        if (pivot == -1){
            // just do normal binary search
            return Binarysearch(nums , target , 0 , nums.length-1);

        }
        // if pivot is found , you have found 2 ascending sorted arrays.
        if (nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return Binarysearch(nums , target , 0, pivot-1);
        }
        return Binarysearch(nums , target , pivot+1 , nums.length-1);
    }


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





















    public static void main(String[] args) {

    }
}
