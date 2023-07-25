package com.lol.OOPS.Generics;

import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private final int Default_Size = 10;
    private int size = 0;

    public CustomArraylist(){
        this.data = new int[Default_Size];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;

    }

    private boolean isFull(){
        return size == data.length;

    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current items in new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set( int index, int value){
        data[index] = value;


    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", Default_Size=" + Default_Size +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        System.out.println(list);

    }



}
