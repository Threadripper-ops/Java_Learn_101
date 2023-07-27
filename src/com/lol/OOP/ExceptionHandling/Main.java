package com.lol.OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;

        int b = 0;

        try {
         //    int c = a/b;
          //  divide(a, b);
            String name = "null";
            if (name.equals("null")){
                throw new Myexception("name cannot be null");
            }

            //mimic a exception
            throw new Exception("this is a exception for fun");


        }catch (Myexception e){
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("this is a generic exception");
        }

        finally {
            System.out.println("this will always run");
        }

    }
// a function that has a exception declared in itself
    // doesnt need to be handled in the main function
    // so need to put it in try catch block
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException(" Cannot divide by zero");
        }
        return a / b;


    }
}
