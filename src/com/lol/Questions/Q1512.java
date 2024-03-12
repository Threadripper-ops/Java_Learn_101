package com.lol.Questions;

class Q1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static public int numIdenticalPairs(int[] nums) {
        int count=0;

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                if(nums[i]==nums[j]){
                    count+=1;
                }

            }
        }
        return count;
    }
}