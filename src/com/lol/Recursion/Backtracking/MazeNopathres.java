package com.lol.Recursion.Backtracking;

import java.util.Arrays;

public class MazeNopathres {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        pathobs("",maze,0,0);
        int[][] path = new int[maze.length][maze[0].length];
        patharr("",maze,0,0,path,0);

    }


    static void pathobs(String p,boolean[][] maze, int r , int c){

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return ;

        }

        // i am considering this block in my path
        maze[r][c] = false;

        if(r< maze.length-1) {
            pathobs(p + "D",maze, r + 1, c);
        }
        if(c< maze[0].length-1){
            pathobs(p+"R",maze,r,c+1);
        }

        if(r>0){
            pathobs(p+"U",maze,r-1,c);
        }
        if(c>0){
            pathobs(p+"L",maze,r,c-1);
        }
        /// this line is where the function is returning
        //so before the fxn gets removed,also revert the changes made

        maze[r][c] = true;



    }

    // printing the array path with steps
    static void patharr(String p,boolean[][] maze, int r , int c, int[][] path,int steps){

        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = steps;
            System.out.println(p);
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if(!maze[r][c]){
            return ;

        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = steps;

        if(r< maze.length-1) {
            patharr(p + "D",maze, r + 1, c,path,steps+1);
        }
        if(c< maze[0].length-1){
            patharr(p+"R",maze,r,c+1,path,steps+1);
        }

        if(r>0){
            patharr(p+"U",maze,r-1,c,path,steps+1);
        }
        if(c>0){
            patharr(p+"L",maze,r,c-1,path,steps+1);
        }
        /// this line is where the function is returning
        //so before the fxn gets removed,also revert the changes made

        maze[r][c] = true;
        path[r][c] = 0;



    }
}
