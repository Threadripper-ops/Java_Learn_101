package com.lol.Algorithms.Sorting;

import java.util.Arrays;

public class InssertionSort {
    public static void main(String[] args) {
        int[] arr= {2,4,1,4,2,3,-33,-43};
        Sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void Sort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j> 0 ; j--) {

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }
    }

    private static void swap(int[] arr,int a, int b) {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
