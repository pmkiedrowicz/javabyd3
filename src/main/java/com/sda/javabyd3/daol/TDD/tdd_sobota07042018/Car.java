package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

public class Car {
    private int use;
    private boolean clean;
    private boolean change;
    private Tank tank;

    public Car(boolean clean) {
        this.clean = clean;
        this.tank = new Tank(10,50);
    }

    public Car(int use) {
        this.use = use;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }


    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        this.use = use;
    }

    public Tank getTank() {
        return tank;
    }
}
