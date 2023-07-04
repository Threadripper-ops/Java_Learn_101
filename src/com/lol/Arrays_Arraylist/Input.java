package com.lol.Arrays_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1]= 45;
        arr[3]= 34;
        arr[4]= 56;
        System.out.println(arr[3]);



        /// inout using for loop
      // for(int i=0; i< arr.length; i++){
      //  arr[i] =in.nextInt();
     //   }
      //  System.out.println(Arrays.toString(arr));
       // for (int num : arr) { /// for every element in array , print the element
         //   System.out.println(num+" "); // here num represent element of the array
       // }

        /// FOr array of object

        String[] str = new String[4];
    for (int i = 0; i< str.length; i++){
    str[i] = in.next();
    }
        System.out.println(Arrays.toString(str));
    // to modify the element
        str[1] = "lola";
System.out.println(Arrays.toString(str));


    }

}
