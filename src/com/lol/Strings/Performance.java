package com.lol.Strings;

public class Performance {
    public static void main(String[] args) {
        String Series ="";
        for (int i=0;i<26;i++){
            char ch =(char)('a'+i);
            Series = Series + ch; // here after every iteration a new obj is created this leads to lot of memory consumption and makes code inefficient

            // to solve this issue we use a data type{class} called stringbuilder that allows modification unlike string


        }
        System.out.println(Series);
    }
}
