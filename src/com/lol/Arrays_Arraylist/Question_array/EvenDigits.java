package com.lol.Arrays_Arraylist.Question_array;
///https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {

        int[] nums ={5552 ,9013,4822,1771};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
/// fxn to check if the number is even or not

    private static boolean even(int num){
        int numberOfDigits= countDigits(num);
        return numberOfDigits % 2 == 0;


    }




    private static int countDigits(int num){

        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        return (int) Math.log10(num)+1;

        // or
//        int count=0;
//        while(num!=0){
//            num=num/10;
//            count++;
//        }
//        return count;

        //private static boolean even(int num) {
//    String s= String.valueOf(num);
//    return s.length() % 2 == 0;
//
//}
//
}
}
