package com.company;


import java.util.Arrays;

public class PassingArrayInFunction {
    public static void main(String[] args) {
int [] nums ={2 , 45 , 66 ,89};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));



    }

static void change(int [] arr){
    arr[0]=99;
}}