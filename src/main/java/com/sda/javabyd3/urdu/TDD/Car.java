package com.sda.javabyd3.urdu.TDD;


public class Car {

    private boolean clean;
    private int wearOfWheels;
    private Tank tank;

    public Car(){
      this.tank = new Tank(30,60);
    }

    public Car(boolean clean) {
        this.clean = clean;
    }

    public Car(int wear) {
        this.wearOfWheels = wear;
    }

    public Car(boolean clean, int wearOfWheels) {
        this.clean = clean;
        this.wearOfWheels = wearOfWheels;
        this.tank = new Tank(60,60);
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public int getWearOfWheels() {
        return wearOfWheels;
    }

    public void setWearOfWheels(int wearOfWheels) {
        this.wearOfWheels = wearOfWheels;
    }

    public Tank getTank() {
        return tank;
    }

    public void doLap() {
        setWearOfWheels(getWearOfWheels()+1);
        tank.setStatus(tank.getStatus()-1);
    }
}
