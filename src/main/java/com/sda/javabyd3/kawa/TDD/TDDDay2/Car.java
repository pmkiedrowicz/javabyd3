package com.sda.javabyd3.kawa.TDD.TDDDay2;

import com.sda.javabyd3.kawa.TDD.FuelType;
import com.sda.javabyd3.kawa.TDD.Tank;

public class Car extends Tank{

    private boolean clean;
    private int tiresUsage;
    Tank tank;

    public Car(FuelType fuelType, int status, int max , boolean clean, int tiresUsage) {
        super(fuelType, status, max);
        this.clean = clean;
        this.tiresUsage = tiresUsage;

    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public int getTiresUsage() {
        return tiresUsage;
    }

    public void setTiresUsage(int tiresUsage) {
        this.tiresUsage = tiresUsage;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
