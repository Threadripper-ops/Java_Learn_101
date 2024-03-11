package com.lol.Questions;

import java.util.Arrays;

class Q1470 {
    public static void main(String[] args) {
        int [ ] arr= {1,2,3,3,4,5};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }
    static public int[] shuffle(int[] nums, int n) {

        int[] arr= new int[2*n];

        for (int i = 0; i < nums.length/2; i++) {
            arr[2*i]=nums[i];
            arr[(2*i )+1]= nums[n+i];


        }


        return arr;
    }
}