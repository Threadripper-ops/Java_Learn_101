package com.lol.Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 5, 23, 4};
         SelectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    //Both the sort and selection sort are same, just the inner loop is different
    // the sort for each item in the array
    //  find the smallest item in the unsorted part of the array
    //  swap the smallest item with the current item
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }

            }

        }}

//for each item in the array
//  find the maximum item in the unsorted part of the array
//  swap the maximum item with the last item in the unsorted part
        static void SelectionSort ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                // find max item in the array and swap with the elemnt in last array
                int last = arr.length - i - 1;
                int maxindex = maxIndex(arr, 0, last);
                swap(arr, maxindex, last);


            }


        }

        static int maxIndex ( int[] arr, int first, int last ){

            int max = first;

            for (int i = first; i < last; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }


            }
            return max;
        }

        static void swap( int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }


    }



