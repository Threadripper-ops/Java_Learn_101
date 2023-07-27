package com.lol.OOP.Generics.comaparing;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
       int diff = (int)(this.marks - o.marks);


       // if diff== 0 then both are equal
         // if diff > 0 then this object is greater



       return diff;

    }

    @Override
    public String toString() {
        return marks+"; "+ roll;
    }
}
