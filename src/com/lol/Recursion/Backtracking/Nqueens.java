package com.lol.Recursion.Backtracking;

public class Nqueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        queens(board,0);

    }

    static int queens(boolean[][] board, int r) {

        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        //placing the queen and checking for every column and row
        int count = 0;

        for (int col = 0; col < board.length; col++) {

            // place queen if it is safe

            if(isSafe(board,r,col)){
                board[r][col] = true;
                count += queens(board,r+1);
                board[r][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int col) {

        //check vertically up
        for(int i=0;i<=r;i++){
            if (board[i][col]){
                return false;
            }
        }

        //check diagonally left
        int maxLeft = Math.min(r,col);
        for (int i=1 ;i<=maxLeft;i++){
            if(board[r-i][col-i]){
                return false;
            }
        }

        //check diagonally right
        int maxRight = Math.min(r,board.length-col-1);
        for (int i=1 ;i<=maxRight;i++){
            if(board[r-i][col+i]){
                return false;
            }
        }
        return true;
    }


    private static void display(boolean[][] board) {
        for(boolean[] b:board){
            for(boolean element:b){
                if(element){
                    System.out.print("Q ");
            }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
