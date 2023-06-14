package com.lol.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // int a = 90;// you cnt inilialise the
        // same variable again in the same scope.
      //  System.out.println(marks);
        String name = "lol";



        {
            // int a = 78; // already inilialised outside the block in the same method scope so cant be initialised again.
            int c = 89;
            a = 100;
            System.out.println(a);
            name = "tumpa"; // here we are not creating a new object
                             // but changing the value of the object.
            System.out.println(name);

            // value initialised in this block will remin in the block

            // scoping in for loops
            for (int i = 0 ; i<4; i++){
              System.out.println(i);
              int num = 99;
            // int a= 767;// here we are creating a new variable
                // which is only valid in the scope of the for loop.
                // this is called shadowing.
                // the value of a is not changed.
                // the value of a is changed in the scope of the for loop.
                // the value of a is not changed in the scope of the method.
                // the value of a is not changed in the scope of the block.


            }


        }
        System.out.println(a);
        System.out.println(name);
        //  System.out.println(c); // cant be used outside the block


    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}


