package com.lol.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayList_eg {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        //Syntax
        //ArrayList<DataType> name= new ArrayList<DataType>();

        ArrayList<Integer> list= new ArrayList<>(2);
     //   list.add(67);
       // list.add(78);
     //   list.add(89);
      //  list.add(90);

        //update
      //  list.set(0,76);
     //   System.out.println(list.contains(424242));

        //remove
     //   list.remove(2);

        //iterate

        ///Input


        for(int i=0;i<5; i++){
            list.add(in.nextInt());

        }

        //Get item in any index

        for(int i=0;i<5; i++){
            System.out.println(list.get(i)); /// pass index at get(),

        }



        System.out.println(list);
    }
}
