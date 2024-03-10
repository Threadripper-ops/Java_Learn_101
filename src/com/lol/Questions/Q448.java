package com.lol.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q448 {
    public static void main(String[] args) {
       // int[] nums ={4,3,2,7,8,2,3,1};
         int[] nums = {4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
//        System.out.println(findDisappearedNumbers(nums));

    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> ni= new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                ni.add(i+1);
            }
        }
        return ni;


    }

    static public void sort(int[] arr){
        int n= arr.length;
        int i=0;
        while (i<n){
            int corr= arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);

            }else {
                i++;
            }
        }
    }

  private   static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}