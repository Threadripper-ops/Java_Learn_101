package com.lol.Recursion;

//import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class FiboGoldenRatio {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fibno(i));
        }
    }


    static int fibno(int n){

        double v = Math.pow(((1 - sqrt(5) )/ 2),n);
        double u = Math.pow(((1 + sqrt(5) ))/ 2,n);

        return (int) ((u-v)/sqrt(5));


    }
}
