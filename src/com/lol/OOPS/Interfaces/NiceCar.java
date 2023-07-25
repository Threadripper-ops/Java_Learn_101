package com.lol.OOPS.Interfaces;

public class NiceCar {
    private Engine engine ;
    private  Media media = new CDPlayer();


    public NiceCar(){ // default constructor
        // it is used to initialize the Power engine
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) { // parameterized constructor
        // it is used to initialize your engine of your choice
        this.engine = engine;
        System.out.println("Engine initialized"+engine );

        // it can be used as follows:

    }


    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
        System.out.println("Engine upgraded to Electric Engine");
    }


}
