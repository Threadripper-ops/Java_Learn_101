package com.lol.OOPS.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop Electric Engine");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate Electric Engine");

    }


    }

