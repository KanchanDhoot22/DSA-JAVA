package com.company;

public class FirstAndLastPosition {

    static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1 , -1};
        //check for the first occurence of target
       int start = search(nums , target , true);
       int end = search(nums , target , false);
       ans[0]= start;
       ans[1] = end;
       return ans;



    }
    // this function just returns the index value of target
   static int search(int [] nums , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start<=end){
            int mid = start = (end - start)/2;
            if (target<nums[mid]){
                end = mid - 1;
            }
            else if (target>nums[mid]){
                start = mid + 1;
            }
            else {
                //potential ans found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
            return ans;
    }





















    public static void main(String[] args) {
//                        int [] nums = {2 , 4 , 4 , 4 , 12 , 12 , 56 , 91 , 91 , 91 , 91 , 103};
//                        int target = 91;
//          int[] t = searchRange(nums , target);
//        System.out.println("hi");
//        System.out.println(t);




    }
}
