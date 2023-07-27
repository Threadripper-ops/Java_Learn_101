package com.lol.OOP.access;

public class A {
  protected int num;
    String name;// it

    int[] arr ; //


    public int getNum() {
        return num; // it gets the value of num
    }

    public void setNum(int num) {
        this.num = num; // it sets the value of num
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
