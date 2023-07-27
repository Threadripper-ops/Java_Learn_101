package com.lol.OOP.Generics.comaparing;


import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<6; i++){
            arr.add(i+1);
        }


      //  arr.forEach((item) -> System.out.println(item*2));

        Consumer<Integer> consumer = (item) -> System.out.println(item*2);
        arr.forEach(consumer);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;



        LambdaFunctions lol = new LambdaFunctions();

        System.out.println(lol.operate(10, 20, sum));


    }

   private int operate(int a ,int b , Operation op){
        return op.operation(a, b);
   }
}
 interface Operation {
     int operation(int a, int b);
 }

