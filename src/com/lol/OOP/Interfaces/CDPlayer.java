package com.lol.OOP.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("I start Music");
    }

    @Override
    public void stop() {
        System.out.println("I stop Music");

    }
}
