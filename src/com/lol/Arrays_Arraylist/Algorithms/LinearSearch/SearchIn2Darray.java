package com.lol.Arrays_Arraylist.Algorithms.LinearSearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 89;
        System.out.println(Arrays.toString(Search(a, target)));
        System.out.println(Max(a));

    }

    static int[] Search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if (element == target) {
                    return new int[]{i, j};
                }

            }
        }

        //OR enhanced for loop
//        for (int[] ints : arr) {
//            for (int j = 0; j < ints.length; j++) {
//                int element = ints[j];
//                if (element == target) {
//                    return j;
//                }
//
//            }
//        }

        return new int[]{-1};
    }



    /// took some time to understand this
    static int Max(int[][] arr) {
        int max = arr[0][0];;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max) {
                    max = arr[row][col];// since you want it to iterate through all the elements

                    // do not add a return statement here as it will return the first element only

                }

            }
        }
        return max;

    }
}
