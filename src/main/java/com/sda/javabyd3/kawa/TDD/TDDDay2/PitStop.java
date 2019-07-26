package com.sda.javabyd3.kawa.TDD.TDDDay2;

public class PitStop {

    private Car car;

    public PitStop(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void performService(Car car) {
        car.isFull();
        car.setClean(true);
        car.setTiresUsage(10);
    }
}
