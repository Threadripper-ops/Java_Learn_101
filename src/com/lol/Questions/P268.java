package com.lol.Questions;

import java.util.Arrays;

public class P268 {
    public static void main(String[] args) {
        
        int[] arr= {0,1,3};
        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));

    }

    static public int missingNumber(int[] nums) {
        int i=0;

        int n = nums.length;
       while (i<n){

           int corr = nums[i];
           if(nums[i]<n && nums[i]!=nums[corr]){
               swap(nums,i,corr);

           }else i++;

       }

        for (int j = 0; j <n; j++) {

            if(nums[j]!=j){
                return j;

            }

        }
        return n;


    }
    
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
