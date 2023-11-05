package com.lol.Recursion;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        permu("","abc");
        System.out.println(permuArr("","abc"));
        System.out.println(perm("","abc"));
    }

    static void permu(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        for(int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i);
            permu(f+ch+s,u.substring(1));

        }
    }

    static ArrayList<String> permuArr(String p, String u){
        if(u.isEmpty()){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(p);
            return bres;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = u.charAt(0);
        for(int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i);
            ans.addAll(permuArr(f+ch+s,u.substring(1)));


        }
        return ans;
    }


    static int perm(String p,String u){
        if(u.isEmpty()){

            return 1;
        }
        int count=0;
        char ch = u.charAt(0);
        for(int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s= p.substring(i);
            count=count+perm(f+ch+s,u.substring(1));


        }
        return count;
    }
}
