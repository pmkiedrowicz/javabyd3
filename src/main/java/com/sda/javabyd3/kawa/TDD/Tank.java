package com.sda.javabyd3.kawa.TDD;

public class Tank {

    private final FuelType fuelType;
    private int status;
    private int max;

    public Tank(FuelType fuelType, int status, int max) {
        this.status = status;
        this.max = max;
        this.fuelType = fuelType;
    }

    public Tank(int initialFuel, int maxCapacity, FuelType fuelType) {
        this.status = initialFuel;
        this.max = maxCapacity;
        this.fuelType = fuelType;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStatus() {
        return status;
    }

    public int getMax() {
        return max;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public boolean isFull() {
        if (status == max)
            return true;
        else
            return false;
    }
}
