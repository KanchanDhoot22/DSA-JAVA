package com.company;

public class orderAgnosticBS {

    static int oabs(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;

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







    public static void main(String[] args) {
//        int[]arr={100 , 56 , 12 , 10 , 6 , 0 , -33};
        int[]arr={ -12 ,2 , 4 , 16 , 32 , 54 ,91};
        int target = 0;
        int ans = oabs(arr , target);
        System.out.println(ans);





    }
}
