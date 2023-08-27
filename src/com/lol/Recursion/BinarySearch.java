package com.lol.Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr={1, 2, 4 , 5, 6, 66,77};
        int target=77;
        System.out.println(search(arr,target,0,arr.length-1));


    }

    static  int search(int[] arr, int target,int s, int e){

        //        int s =0;
//        int e =arr.length-1; these variables will be called inside the recursive fxn, so they cannot be placed in the body  rather it must be passed as an argument



        if(s>e){
            return -1;
        }

        int m =s +(e-s)/2;


        if (arr[m]==target){
            return m;
        }
        if (target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);

    }
}
