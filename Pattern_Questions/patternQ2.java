package com.company;

public class patternQ2 {
    static void pattern2(int n){
        for (int row = 0; row<= n; row++){
            for (int col = 1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }












    public static void main(String[] args) {
        pattern2(5);

    }
}
