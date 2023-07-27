package com.lol.Arrays_Arraylist.Question_array;

public class Berry {
    String berrry ="blue";
    private String berry;

    public static void main(String[] args) {
        new Berry().juicy("straw");
    }
    void juicy(String berry){
        this.berry = "green";
        System.out.println(berry + "berry ");
    }
}
