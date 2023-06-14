package com.lol.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       ///Initialisation


        // Creating 3 arraylist inside the arraylist
        for(int  i = 0; i<3; i++){
            list.add(new ArrayList<>());

        }

        // add elements to the 3 arraylist
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(in.nextInt()); // get the
                // arraylist at index i and add the element at j
            }
        }
        System.out.println(list);




    }
}
