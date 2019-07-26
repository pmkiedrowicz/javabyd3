package com.sda.javabyd3.jaja.designPatternEx.ex03;

public class CarFacade {

    private Car car;

    public CarFacade(){
        this.car = new Car();
    }

    public void carTask(){
        System.out.println("ABS: "+car.checkAbsSystem());
        System.out.println("Air bag: "+car.checkAirBagSystem());
        System.out.println("Battery: "+ car.checkBattery());
        System.out.println("ESP: "+ car.checkEspSystem());
        System.out.println("Fual: " +car.checkFual());
        System.out.println("Oil: " +car.checkOil());
        System.out.println("Engine: " + car.startEngine());
    }
}
