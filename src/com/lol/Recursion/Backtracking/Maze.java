package com.lol.Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathArr("",3,3));
//        System.out.println(pathArrdiag("",3,3));

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathobs("",maze,0,0);

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

    static ArrayList<String> pathArrdiag(String p, int r , int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1) {
            ans.addAll(pathArrdiag(p + "V", r - 1, c));
        }
        if(c>1){
            ans.addAll(pathArrdiag(p+"H",r,c-1));
        }
        if(r>1 && c>1){
            ans.addAll(pathArrdiag(p+"D",r-1,c-1));
        }
        return ans;
    }
    //Maze with obstacles//obstacle at 1,1

    static void pathobs(String p,boolean[][] maze, int r , int c){

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return ;

        }

        if(r< maze.length-1) {
            pathobs(p + "D",maze, r + 1, c);
        }
        if(c< maze[0].length-1){
            pathobs(p+"R",maze,r,c+1);
        }



    }

}
