package com.company;

public class linearSearch_in_range {
    public static void main(String[] args) {
        int[]arr={22 , 33 , 44 , 55 , 66 , 77 , 88};
        int target = 55;
        System.out.println(linearSearch(arr , target , 0 ,2));

    }
    static int linearSearch(int [] arr, int target , int start , int end){
        if (arr.length==0){
            return -1;
        }
//        running a for loop
        for (int index=start ; index<=end ; index++){
//            check for evry element at index if it is equal to target
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }





}

