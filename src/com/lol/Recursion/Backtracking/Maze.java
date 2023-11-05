package com.lol.Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathArr("",3,3));

    }

    static int count(int r , int c){

        if(r==1 || c==1){
            return 1;
        }

        return count (r-1,c)+count(r,c-1);
    }

    static void path(String p,int r , int c){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1) {
            path(p + "D", r - 1, c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }

    }

    static ArrayList<String> pathArr(String p, int r , int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1) {
            ans.addAll(pathArr(p + "D", r - 1, c));
        }
        if(c>1){
            ans.addAll(pathArr(p+"R",r,c-1));
        }
        return ans;
    }



}
