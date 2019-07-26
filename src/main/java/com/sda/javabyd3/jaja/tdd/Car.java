package com.sda.javabyd3.jaja.tdd;

public class Car {

    private boolean clean;
    private Tank tank;
    private int use;

    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        this.use = use;
    }

    public Car(boolean clean){
        this.clean = clean;
        this.tank = new Tank(10,50);
    }

    public Car(int use){
        this.use = use;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public Tank getTank() {
        return tank;
    }

        }


