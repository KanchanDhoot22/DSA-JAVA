package com.company;

public class evenDigits {
    static int findNumbers(int[]nums){
        int count=0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
            return count;
    }
    //to count the number of digits in a number
    static int digits(int num){
        if (num<0){
            num = num*-1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }




        return count;


    }
    static int digits2(int num){
        if (num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    //function to check whether a digit contains even number of digits or not.
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits%2==0){
            return true;
        }
        return false;

    }



    public static void main(String[] args) {

int [] nums = {12 , 3 , 456 , 1234 , 78, 9, 34};
        System.out.println(findNumbers(nums));


    }
}
