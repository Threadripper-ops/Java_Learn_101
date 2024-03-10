package com.lol.Questions;

import java.util.Arrays;

class Q2540 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6};
        int[]nums2 = {2,3,4,5};
        System.out.println(getCommon(nums1,nums2));

    }
    static public int getCommon(int[] nums1, int[] nums2) {

        int max = nums1.length;


        for (int i = 0; i < max; i++) {
            if( AscBinary(nums1, nums2[i])==nums2[i]){
                return nums2[i];
            }


        }
       return -1;


    }
   static int AscBinary(int [] arr, int target){
        int start =0;
        int end= arr.length -1;

        while (start<=end){
            int mid = start +(end-start)/2;// here we dint use (start+end)/2 as it may cause integer overflow

            if (target<arr[mid]) {
                end = mid - 1;
            }


            else if(target>arr[mid]){
                start=mid+1;
            }
            else return arr[mid];
        }

        return -1;
    }
}