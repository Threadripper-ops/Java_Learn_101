package com.lol.Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subsequ("","abc"));
        subseqAscii("","andi");

    }

    static void subseq(String p, String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
       // if( p.isEmpty() && u.isEmpty()){
      //      return;
      //  }
        char ch = u.charAt(0);
        subseq(p+ch,u.substring(1));
        subseq(p,u.substring(1));
    }
///returning an arralist of string
    static ArrayList <String> subsequ(String p, String u){
       ArrayList<String> s = new ArrayList<>();
       if(u.isEmpty()){
            s.add(p);
            return s;
        }
        // if( p.isEmpty() && u.isEmpty()){
        //      return;
        //  }
        char ch = u.charAt(0);
       ArrayList <String> left=  subsequ(p+ch,u.substring(1));
       ArrayList<String> right= subsequ(p,u.substring(1));

      left.addAll(right);
      return left;
    }
    static void subseqAscii(String p, String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        // if( p.isEmpty() && u.isEmpty()){
        //      return;
        //  }
        char ch = u.charAt(0);
        subseqAscii(p+ch,u.substring(1));
        subseqAscii(p+(ch+0),u.substring(1));
        subseqAscii(p,u.substring(1));
    }
}
