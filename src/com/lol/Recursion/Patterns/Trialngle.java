package com.lol.Recursion.Patterns;

public class Trialngle {
    public static void main(String[] args) {
        print1(5,0);

     }

    // for normal triangle

    static void print1(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){

            print1(r,c+1);
            System.out.print("*");
        }else {

            print1(r-1,0);
            System.out.println();
        }



    }

    static void print(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("*");
            print(r,c+1);
        }else {
            System.out.println();
            print(r-1,0);
        }



    }
}
