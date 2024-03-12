package com.lol.Questions;

import java.util.ArrayList;
import java.util.List;

class Q1431 {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));

    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= 0;
        List<Boolean> l1 = new ArrayList<Boolean>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }

        }

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max){
                l1.add(true);
            }else {
                l1.add(false);
            }
        }
        return l1;
    }
}