package com.lol.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        //the function creates a new object and returns it

        mergeSortIn(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));//the original array is not changed

        //if wanna update the original array Use this
        //arr=mergeSort(arr);

    }

    static int[] mergeSort(int[] arr) {
        //base condition

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];
        //taking pointer variable that was used to compare two elemwnts of 2 arrays and one pointer variable for mix array
        int i = 0;//for first array
        int j = 0;//for second array
        int k = 0;//for mix array

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }
        //if one array is exhausted
        //so add rem elements in array

        //if second array is exhausted
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        //if first array is exhausted
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortIn(int[] arr, int start, int end) {
        //base condition

        if (end-start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortIn(arr, start, mid);
        mergeSortIn(arr, mid, end);
        mergeInplace(arr, start, mid, end);
    }

    private static void mergeInplace(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];
        //taking pointer variable that was used to compare two elemwnts of 2 arrays and one pointer variable for mix array
        int i = start;//for first array
        int j = mid;//for second array
        int k = 0;//for mix array

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

            //if second array is exhausted
            while (i < mid) {
                mix[k] = arr[i];
                i++;
                k++;
            }
            //if first array is exhausted
            while (j < end) {
                mix[k] = arr[j];
                j++;
                k++;
            }

        for (int s = 0; s < mix.length; s++) {
            arr[start + s] = mix[s];
        }

        }


    }





