package com.lol.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr={4,2,1,5,3};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


//        Arrays.sort();
    }


    static void quicksort(int [] arr, int low, int high){
        if (low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];

       while (start<=end) {

           while (arr[start] < pivot) {
               start++;
           }
           while (arr[end] > pivot) {
               end--;
           }

           if (start <= end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }
       }

       // now pivot is at its correct position
        quicksort(arr,low,end);
       quicksort(arr,start,high);




    }


}
