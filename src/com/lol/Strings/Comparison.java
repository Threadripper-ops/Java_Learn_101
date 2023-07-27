package com.lol.Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "lola";
        String b = "lola";

       System.out.println(a==b);

        String s1 = new String("lola");
        String s2 = new String("lola");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(0));
    }
}
