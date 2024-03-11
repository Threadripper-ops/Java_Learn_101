package com.lol.Questions;

import java.util.Arrays;

class Q41 {

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(firstMissingPositive(nums));
    }
    static public int firstMissingPositive(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        //if the elemsnts are alerady in from 1 to n in array so the missing number is n+1
        // eg {1,2,3,4}
        // smallest positive missing no is n+1= 5;

        return nums.length+1;
    }

    static public   void sort(int[] arr)
    {
        int i=0 ;
         while(i<arr.length ){
             int corr = arr[i]-1;
             if(arr[i]>0&&arr[i]< arr.length&&arr[corr]!=arr[i]){
                 swap(arr,i,corr);
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