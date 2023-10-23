package com.lol.Arrays_Arraylist.Algorithms;

public class BInarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5,9, 7, 6, 66, 77};
        int target = 77;
        System.out.println(AscBinary(arr, target));

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
            else return mid;
        }

        return -1;
    }
}
