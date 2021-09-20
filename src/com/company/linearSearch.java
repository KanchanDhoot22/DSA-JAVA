package com.company;

public class linearSearch {

    public static void main(String[] args) {
        int [] nums ={23 , 56 , 88 , 99 , 45 , -1 , -42};
        int target = 45;
        int ans =linearSearch(nums , target);
        System.out.println(ans);

    }
//    searching in the array : return the index if item found.
//    otherwise if itm not found return -1.
    static int linearSearch (int [] arr , int target){
        if (arr.length==0){
            return -1;
        }
//        run a for loop
        for (int index=0; index<arr.length; index++){
//            check for element at every index if element = target
            int element = arr[index];
            if (element==target){
                return index;
            }


        }
//        this line will execute if none of the above return statement works.
//        hence target not found.
        return -1;



    }





}
