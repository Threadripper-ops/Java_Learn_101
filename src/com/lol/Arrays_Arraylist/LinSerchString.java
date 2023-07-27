package com.lol.Arrays_Arraylist;

public class LinSerchString {
    public static void main(String[] args) {
        String a= "lola";
        System.out.println(search(a,'l'));

    }


    //foreach loop

    /// to use for each loop you need an array
    // for each loop is used to iterate over an array or a collection
    // so you have to convert string into a character array
    // by using the toCharArray() method

    static boolean search2(String arr, char target){
        if(arr.length()==0){
            return false;
        }
        for(char ch: arr.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String arr, char target){
        if(arr.length()==0){ // this length check is not required as the for loop will not run if the length is 0
            return false;
        }

        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)==target){
                return true;
            }

        }

        return false;

    }

    // searing in a range of index



    static boolean searchInRange(String arr, char target, int start,int end){
        if(arr.length()==0){ // this length check is not required as the for loop will not run if the length is 0
            return false;
        }

        for(int i=start;i<=end;i++){
            if(arr.charAt(i)==target){
                return true;
            }

        }

        return false;

    }
}
