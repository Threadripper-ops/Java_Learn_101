package com.lol.Arrays.Question_array;

import java.util.Arrays;

import static com.lol.Arrays.Question_array.Swap.swap;

public class Max_item {
    public static void main(String[] args) {
        int[] arr = {1,23,43,5,6,575,};
        System.out.println(max(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    private static int max(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }

        }
        return max;
    }
    ///Or method 2

  /*  private static int max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }
        return max;
    } */

    ///To find max in a range

    static int Maxrange(int[] arr, int start, int end){

        //working on edge case

        if (end <start || arr ==null || start<0 || end>arr.length){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i<end; i++){
            if(arr[i]>maxVal){
                maxVal= arr[i];
            }
        }
        return maxVal;



    }


    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            // swap
            swap(arr, start, end);
                start++;
                end--;
            }
        }

    }


