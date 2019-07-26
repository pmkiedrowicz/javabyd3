package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

public class PitStop {
    private final FuelStation fuelStation;
    private final CarWash carWash;
    private final ServiceCar serviceCar;

    public PitStop(FuelStation fuelStation, CarWash carWash, ServiceCar serviceCar) {
        this.fuelStation = fuelStation;
        this.carWash = carWash;
        this.serviceCar = serviceCar;


    }

    public void performService(Car car) {
        fuelStation.tankToFull(car.getTank());
        carWash.washCar(car);
        serviceCar.changeTires(car);


    }
}
