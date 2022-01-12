package com.company;

public class LinearSeacrchInStrings {

//    static boolean search(String str , char target){
//        if (str.length()==0){
//            return false;
//        }
//        for (int i=0 ; i<str.length(); i++){
//            if (target == str.charAt(i)) {
//
//                return true;
//            }
//        }
//        return false;
//    }
    static boolean search1(String str , char target){
        if (str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {

                    String str = "kanchan";
                    char target = 'h';
        System.out.println(search1(str , target));
    }
}
