package com.sda.javabyd3.jaja.tdd;

public class PitStop {
    private final PetrolStation petrolStation;
    private final CarWash carWash;
    private final ServiceCar serviceCar;

    public PitStop(PetrolStation petrolStation, CarWash carWash, ServiceCar serviceCar) {
        this.petrolStation = petrolStation;
        this.carWash = carWash;
        this.serviceCar = serviceCar;
    }

    public void performService(Car car) {
        petrolStation.fillUpToFull(car.getTank());
        carWash.washCar(car);
        serviceCar.changeWheel(car);
    }
}
