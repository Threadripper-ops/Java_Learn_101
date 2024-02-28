package com.lol.Recursion.Backtracking;

public class SudokuSolver  {
    public static void main(String[] args) {

        int[][] board = {
            {0, 0, 0, 0, 0, 8, 4, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 7, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 0, 0, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 4},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };


        if (solve(board)){
              display(board);
         }
         else {
              System.out.println("no solution");
       };

    }


    static boolean solve(int [][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean Emptyleft = true;
        //thsi is how we are replacing r,c form the argument

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    Emptyleft = false;
                    break;

                }

            }

            // if i found some empty element in row ,then break the loop
            if (!Emptyleft) {
                break;
            }
        }
        if (Emptyleft) {
            return true;

        }
        //backtracking
        for (int number = 1; number <=9 ; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if (solve(board)){
                    //found the answer
//                    display(board);
                    return true;
                }
                else {
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;
    }


    static void display(int [][] board){
        for (int [] row: board){
            for (int num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }


        //sudoku is solved

      static boolean isSafe(int [][] board, int row ,int col, int num){
        //check row
          for (int i=0;i< board.length;i++){

              //check if the number is already in the row or not
              if(board[row][i]==num){
                  return false;
              }
          }

            //check column
          for (int [] nums: board){

              //check if the number is already in the row or not
              if(nums[col]==num){
                  return false;
              }
          }

          int sqrt = (int) Math.sqrt(board.length);
          int startrow = row- row % sqrt;
            int startcol = col - col % sqrt;
          for (int r = startcol; r < startcol+sqrt; r++) {
              for (int c = startcol; c < startcol+sqrt; c++) {

                  if(board[r][c]==num){
                      return false;
                  }

              }

          }
          return true;
      }




}
