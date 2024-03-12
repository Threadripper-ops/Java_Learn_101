package com.lol.Questions;

import java.util.Arrays;

class Q1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
   static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr= new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           int c=0;
           for (int j = 0; j < nums.length; j++) {
               if(nums[j]<nums[i]){
                   c+=1;

               }
           }
           arr[i]=c;
       }
       return arr;
    }
}