package com.lol.Algorithms.BinarySearch;

public class CelingAndFloor {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 7;
        System.out.println(Celling(arr,target));
        System.out.println(Floor(arr,target));

    }

     static int Celling(int [] arr, int target){
        int start =0;
        int end= arr.length -1;

        if(target>arr[arr.length-1]){
            return -1;
        }

        while (start<=end){
            int mid = start +(end-start)/2;// here we didn't use (start+end)/2 as it may cause integer overflow

            if (target<arr[mid]) {
                end = mid - 1;
            }


            else if(target>arr[mid]){
                start=mid+1;
            }
            else return mid;
        }

        return start;
    }

    static int Floor(int[] arr,int target){
            int start =0;
        int end= arr.length -1;

        while (start<=end){
            int mid = start +(end-start)/2;// here we didn't use (start+end)/2 as it may cause integer overflow

            if (target<arr[mid]) {
                end = mid - 1;
            }


            else if(target>arr[mid]){
                start=mid+1;
            }
            else return mid;
        }

        return end;
    }
}
