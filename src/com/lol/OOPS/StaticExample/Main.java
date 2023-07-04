package com.lol.OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        /* Human ab = new Human(22,"abbas",10000, false);
        Human rah= new Human(23,"Rahul",12000,true);
        System.out.println(ab.married);
        System.out.println(Human.population);
        System.out.println(ab.age);*/

        Main funn = new Main();
        funn.fun2();




    }

    // we know something which is not static belong to object

     void greeting(){      //since main method is static
        //// so we have to make greeting method static too..
        System.out.println("hello");
    }

     static void fun (){
       // greeting();                  /// you cnat use this cause greeting is not static/
                                  // and hence require an instance to be called
                                 // so to use greeting method we have to make it static
         // or we have to create an instance of main class
         Main obj = new Main();
         obj.greeting();
        //or change fun to non static and greeting to static


    }
    void fun2(){
        greeting();
    }
}
