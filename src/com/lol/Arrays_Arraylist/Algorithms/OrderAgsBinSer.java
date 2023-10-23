package com.lol.Arrays_Arraylist.Algorithms;

public class OrderAgsBinSer {
    public static void main(String[] args) {

        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr= {99,98,97,96,95,94,93,92,91,90,89,88,87,86,85};
        int target=89;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        // find whether array is sorted in asc or dsc

        boolean isAsc = arr[start]<arr[end];

        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
