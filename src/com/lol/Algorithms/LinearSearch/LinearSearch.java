package com.lol.Algorithms.LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums= {12, 34, 54, 65, 87, 98, 76, 45, 32, 21,686,47,9,57};

        int ans= linearSearch(nums, 475);
        int ans2= linearSearchEle(nums, 47);
        System.out.println(ans);
        System.out.println(ans2);


        int[] num={-1,-24,-34,-6,-42,-455,-3454,-4366,-435,-45};
int ans3= minValue(num);
        System.out.println(ans3);

    }

    //search in the array: return index if item found otw return -1
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;

        }

        // run a for loop

        for (int i = 0; i < arr.length; i++) {

            // checking element at every index

            int element = arr[i]; // assigning element at index i to element variable

            if (arr[i] == target) {
                return i;

            }

        }

        //this will execute if none of the return statements above have executed
        return -1;

    }


    ////searcg the array and return the element

    static int linearSearchEle(int[]arr, int target){
        if (arr.length==0){
            return -1;
        }
        for(int element :arr){
            if (element==target){
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    //Find the min element in the array

    static int minValue(int[] arr){
        if (arr.length==0){
            return -1;
        }
       int element = arr[0];
        for (int i=0;i<arr.length; i++){
            if(arr[i]<element){
                element=arr[i];
            }
        }
        return element;
    }
}
