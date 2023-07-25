package com.lol.OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son shiv= new Son(14);
        shiv.career("Engineer");
        shiv.partner("Aashi", 20);

        Daughter Ria = new Daughter("Rids",22);
        Ria.career("Housewife");
        Ria.partner("Ash", 21);

        Parent hello = new Son(67);
        hello.career("Teacher");

     //   Parent mom = new Parent(); you cannot create an object of an abstract class
        //because it is incomplete and you cannot complete it without overriding the abstract methods




        Parent.hello();


    }
}
