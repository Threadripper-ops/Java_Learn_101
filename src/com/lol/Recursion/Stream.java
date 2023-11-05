package com.lol.Recursion;



public class Stream {

    public static void main(String[] args) {
        String u = "aaabbbcccdddeeefff";
        skip("", u,'a');

        System.out.println(skipret(u,'a'));

        System.out.println(skip(u,"dd"));


        String a= "asdjkhfdfhaappldjf";

        System.out.println(skipapple(a));
        System.out.println(skipapp(a));



    }

    static void skip(String p, String u,char a) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);

        if (ch == a) {
            skip(p, u.substring(1),a);
        } else {
            skip(p + ch, u.substring(1),   a );
        }
    }



    static String skipret(String u ,char a) {
        if (u.isEmpty()) {
            return "";
        }
        char ch = u.charAt(0);
        if (ch==a){
            return skipret(u.substring(1),a);
        }
        else {
            return ch + skipret(u.substring(1),a);
        }


    }

    static String skip (String p,String target) {
        if (p.isEmpty()) {
            return "";
        }

        //   String ch = p.substring(0,1);// We can also discard it

        if (p.startsWith(target)) {
            return skip(p.substring(target.length()), target);
        } else {
            return p.substring(0, 1).concat(skip(p.substring(1), target));
            // or p.charAt(0)+skip((p.substring(1),target)
        }


    }

    static String skipapple(String s){
        if (s.isEmpty()){
            return "";

        }

        if (s.startsWith("apple")){
            return skipapple(s.substring(5));
        }
        else {
            return s.charAt(0)+skipapple(s.substring(1));
        }
    }

    //skip app when substring is apple
    static String skipapp(String s){
        if (s.isEmpty()){
            return "";

        }

        if (s.startsWith("app") && !s.startsWith("apple")){
            return skipapp(s.substring(3));
        }
        else {
            return s.charAt(0)+skipapp(s.substring(1));
        }
    }

}
