package com.lol.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(Arrays);
        System.out.println(findDuplicates(nums));
    }
   static public List<Integer> findDuplicates(int[] nums) {

        List<Integer> l1= new ArrayList<Integer>(nums.length);

        int i = 0;
        while (i<nums.length){
            int corr = nums[i]-1;
            if(nums[corr]!=nums[i]){
                swap(nums,corr,i);
            }
            else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                l1.add(nums[j]);
            }
        }

        return l1;
    }

    static void swap(int[] arr, int a , int b){
         int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}