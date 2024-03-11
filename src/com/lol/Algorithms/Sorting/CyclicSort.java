package com.lol.Algorithms.Sorting;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {2,5,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void Cyclic(int[] arr){
        int i=0;

        while(i<arr.length){
            int corr = arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);// we are taking the first index element and swapping it with its correct index element
                
            }else i++;
        }

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
