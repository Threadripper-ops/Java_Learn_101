package com.lol.Algorithms.Sorting;


import java.util.Arrays;

import static com.lol.Algorithms.Sorting.SelectionSort.swap;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {2,4,2,5,23,4};
        Sort(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void Sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }

            }

        }
    }



}
