package com.lol.Questions;

import java.util.Arrays;

class Q1480 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
   static public int[] runningSum(int[] nums) {

        int[] arr= new int[nums.length];

        arr[0]=nums[0];


        for (int i = 1; i < nums.length; i++) {
            arr[i]=arr[i-1]+nums[i];
        }
        
        return arr;
    }
}