package com.lol.Questions;

import java.util.Arrays;

public class Q645 {
    public static void main(String[] args) {

        int[] arr= {1,3,2,2,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    static public int[] findErrorNums(int[] nums) {
        sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
               return new int[] {nums[i],i+1};
            }
        }

return new int[]{1,3};



    }

   private static void sort(int[] arr){

        int i= 0 ;
        while (i<arr.length){
            int corr = arr[i]-1;
            if(arr[corr]!=arr[i]){
                swap(arr,corr,i);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
         int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}