package com.lol.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        car.stop();
////        car.acc();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.start();

        NiceCar niceCar1 = new NiceCar( new ElectricEngine());
        niceCar1.start();












        Engine car1 = new Car();

      //  car1.a;


        //  it cant access "a" as it is defined in car class
       // and not in engine class


        // Engine defines what things car1 can access
        // Car defines which versions of the methods car1 can access

    }
}
