package com.company;

public class rotatedSortedArray {
    // this will not work for duplicate values.
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

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
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
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }

}
