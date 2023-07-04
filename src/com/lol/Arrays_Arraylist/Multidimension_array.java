package com.lol.Arrays_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_array {
    public static void main(String[] args) {
        /*
        1 2 4
        5 5 6
        6 7 8

         */

       // int [][] arr = new int[4][];
        Scanner in = new Scanner(System.in);

      //  int [][] arr = {
       //         {1,2,4},//0th index
       //         {5,5},//1st index
        //        {6,7,8,78}// 2nd index -> arr[2] = {6,7,8,78}
       // };
        int [][] arr = new int[3][3];

        // input
        // arr.lenth == number of rows

        for(int row = 0; row < arr.length; row++){
            // for each col in every row, input the value
            for(int col=0; col< arr[row].length; col++){
                arr[row][col] = in.nextInt();

            }
        }
        ///Output


       // for(int row = 0; row < arr.length; row++){
            // for each col in every row, input the value
          //  for(int col=0; col< arr[row].length; col++){
          //      System.out.print(arr[row][col]+ " ");


         //   }
          //  System.out.println();
      //  }
        // oR use
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        ///OR use enhanced for loop


        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }



    }


    }

