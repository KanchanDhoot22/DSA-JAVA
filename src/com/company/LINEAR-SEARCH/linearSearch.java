package com.company;

public class linearSearch {

    public static void main(String[] args) {
      int [] arr = {22 , 34 , 19 , 45 , 99 , 11};
       int target = 45;
      boolean ans = linearSearch3(arr,target);
       System.out.println(ans);

//    SEARCH THE ELEMENT AND RETURN TRUE OR FALSE.

    }

    static boolean linearSearch3(int[]arr ,int target){
        if (arr.length==0){
            return false;
        }
//       run a for loop
        for (int element : arr){
            if (element==target){
                return true;
            }
        }
//     this line will execute if none of the return statements above have executed
//       hence the target not found
       return false;
    }



//    SEARCH THE TARGET AND RETURN THE ELEMENT.
    static int linearsearch2(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
//        run a for loop
        for (int element : arr){
            if (element==target){
                System.out.println(element);
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

//    SEARCH THE TARGET AND RETURN ITS INDEX
static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
    //        run a for loop
    for (int index = 0 ; index< arr.length; index++){
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
