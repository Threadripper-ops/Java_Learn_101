package com.lol.OOP.Object_Cloning;

public class Human implements Cloneable{
    protected int age;
    protected String name;
    int[] arr;
//This is also a deep copy constructor
//    public Human(Human H) {  // this is a copy constructor
//        this.age = H.age;
//        this.name = H.name;
//
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,7,5,9};
    }
////THIS is a shallow copy
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }//clonenotSupportedException is thrown when clone() is not overridden in the class
    // and you have not implemented the cloneable interface.

    //THIS is method for shallow copying a deep copy
    // so basically we are making a deep copy of the object

    // deep copy can also be done by the copy constructor
   public Object deepClone() throws CloneNotSupportedException{
        Human h = (Human) super.clone();//this is a shallow copy


//        h.arr = arr.clone();//this is a deep copy
//        return h;

       //OR
       h.arr = new int[h.arr.length];
       for(int i=0;i<h.arr.length;i++){
           h.arr[i]=arr[i];
       }
       return h;
   }


}


