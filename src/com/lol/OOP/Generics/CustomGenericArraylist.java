package com.lol.OOP.Generics;

import java.util.Arrays;

public class CustomGenericArraylist<T> {
    private Object[] data;
    private final int Default_Size = 10;
    private int size = 0;

    public CustomGenericArraylist(){
        this.data = new Object[Default_Size];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;

    }

    private boolean isFull(){
        return size == data.length;

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current items in new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){

        return (T)data[index];
    }

    public int size(){

        return size;
    }

    public void set( int index, T value){
        data[index] = value;


    }

    @Override
    public String toString() {
        return "CustomGenericArraylist{" +
                "data=" + Arrays.toString(data) +
                ", Default_Size=" + Default_Size +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArraylist<Integer> list = new CustomGenericArraylist<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        System.out.println(list);

    }



}
