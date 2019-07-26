package com.sda.javabyd3.urdu.designPatternExercises.ex03;

public class StartEngine {

    Car car;

    public void startingEngine(Car car){
        if(car.checkAbsSystem() && car.checkAirBagSystem()
                && car.checkBatter() && car.checkEspSystem()
                && car.checkFual() && car.checkOil()){

            car.startEngine();

        } else System.out.println("Some of system failed...");
    }
}
