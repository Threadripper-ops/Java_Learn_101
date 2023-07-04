package com.lol.Arrays_Arraylist;

public class Main {
    public static void main(String[] args) {
        //Q store a roll no
        int a = 10;

        // Q store a name
        String n = "bunga";

        // array syntax
        // datatype[] variable_name = new datatype [size];


        //Q store 5 roll no
        int[] rollNo = new int[5];

        /// or
         int[] roll2= {23,4,34,35,64,66};

         int[] ros; // declaration of array . ros is getting defined in stack memory.
        ros = new int[5]; //intiailisation: actually here the actual object is getting created in heap.
        // ros is a reference variable which is pointing to the object created in heap.


        String[] arr= new String[4];
        System.out.println(arr[0]); // null

        for( String element : arr){
            System.out.println(element);
        }


    }
}
