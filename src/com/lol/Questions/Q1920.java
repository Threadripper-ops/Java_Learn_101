package com.lol.Questions;

import java.sql.Array;
import java.util.Arrays;

class Q1920 {
    public static void main(String[] args) {

        int[] no = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(no)));

    }
    static public int[] buildArray(int[] nums) {
       int[] arr= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]= nums[nums[i]];
        }
        return arr;
        
    }
}