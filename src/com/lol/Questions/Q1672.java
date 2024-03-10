package com.lol.Questions;

class Q1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(accounts));


    }
    static public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            int amount =0;

            for (int j = 0; j < accounts[i].length; j++) {


                amount += accounts[i][j];
            }



            max = Math.max(amount,max);
        }
        return max;
    }
}