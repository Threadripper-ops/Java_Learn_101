package com.lol.Recursion;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {

        int [] arr={2,3,4,5,3,73,7,5,5,3};

        System.out.println(findAllindexArrWa(arr,5,0));
        findAllindex(arr,5,0);

//        System.out.println(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        System.out.println(findAllindexArr(arr,5,0,list2));

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;//index out of bound case

        }
        return arr[index] == target || find(arr, target, index + 1);
    }


    static int findindex(int [] arr,int target,int index){
        if(index==arr.length){
            return -1;

        }
        if (arr[index]==target){
            return index;
        }
        else{
            return findindex(arr,target,index+1);
        }

    }


   static ArrayList<Integer> list = new ArrayList<>(); // if we dont want to declare it globally then there are 2 other ways
    // 1. pass it as a parameter
    // 2. return it

    static void findAllindex(int[] arr, int target, int index) {
 // We cannot declare arraylist inside this fxn as it will be created again and again and we will lose the previous values.ie it wont be passed on to the next fxn call
        //so to avoid this we can either declare it globally or pass it as a parameter

        if (index == arr.length) {
            return ;//index out of bound case

        }
        if (arr[index] == target){
            list.add(index);
        }
            findAllindex(arr, target, index + 1);// adding it under else will give only one index

    }

// Pass it as a parameter method:
     static ArrayList<Integer> findAllindexArr(int[] arr, int target, int index,ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;//index out of bound case

        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllindexArr(arr, target, index + 1,list);// adding it under else will give only one index

    }

    static ArrayList<Integer> findAllindexArrW(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;//index out of bound case

        }
        //This will contain answer for that particular fxn call
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> AnsfromBelowCalls = findAllindexArrW(arr, target, index + 1);// this will conatin answer from below calls

        list.addAll(AnsfromBelowCalls);// this will contain answer from AnsfromBelowCalls list

        return list;
    }


    // SAME CODE AS ABOVE BUT DIIFENT CODING STYLE

    static ArrayList<Integer> findAllindexArrWa(int[] arr, int target, int index) {

        ArrayList<Integer> AnsfromBelowCalls;

        if (index == arr.length) {
            return list;//index out of bound case

        }
        //This will contain answer for that particular fxn call
        if (arr[index] == target){
            list.add(index);
        }
        return  AnsfromBelowCalls = findAllindexArrWa(arr, target, index + 1);// this will conatin answer from below calls


    }

}