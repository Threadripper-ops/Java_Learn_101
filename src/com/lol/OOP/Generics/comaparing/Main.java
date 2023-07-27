package com.lol.OOP.Generics.comaparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12, 90.44f);
        Student s2 = new Student(13, 97.44f);
        Student s3 = new Student(14, 96.44f);
        Student s4 = new Student(15, 95.44f);
        Student s5 = new Student(16, 94.44f);

        Student[] list = {s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // as in the student class we used compareto in marks so it will sort acc to marks

        System.out.println(Arrays.toString(list));

        // to sort using your own logic use
        Arrays.sort(list, new Comparator<Student>(){


            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.roll - o2.roll); // to sort acc to roll
            }
        });
        System.out.println(Arrays.toString(list));







        if (s1.compareTo(s2)<0) {   // to compare two students we need to implement Comparable interface in student class
                                   // now just replace (S1 > s2) with (s1.compareTo(s2) > 0)

            System.out.println("s2 is greater");


        }
       else if (s1.compareTo(s2)==0){
            System.out.println("both are equal");
        }
       else {
            System.out.println("s1 is greater");
        }
        }
    }

