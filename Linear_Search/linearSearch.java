package com.company;

public class linearSearch {
    public static void main(String[] args){
        int[]nums={12,45,67,89,4,23,90,2};
        int target = 20;
//        int ans = linearsearch1(nums , target);
//        System.out.println(ans);

    }
    // searching in array : if item found then return its index
//    if item not found then return -1
//        static int linearsearch1(int[] arr , int target){
//        if (arr.length==0){
//            return -1;
//        }
////        run a for loop
//           for (int i=0; i< arr.length; i++ ){
//               //check for every element at index if its equal to target element.
//               int element = arr[i];
//               if (element==target){
//                   return i;
//               }
//           }
//           if target not found
//            return -1;

//        }
    // code to return the element itself
//    static int linearsearch2(int[]arr , int target){
//        if (arr.length==0){
//            return Integer.MAX_VALUE;
//        }
//        // run a for loop
//        for (int element:arr)
//      if (element==target){
//                return element;
//            }
//
//        return Integer.MAX_VALUE;
//    }
    // code to return true or false
    static boolean linearsearch3(int [] arr , int target){
        if(arr.length==0){
            return false;
        }
        for (int element:arr)
        if (element==target){
                 return true;
        }
        return false;

        }

    }

