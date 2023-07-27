package com.lol.OOP.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop Power Engine");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate Power Engine");

    }
}
