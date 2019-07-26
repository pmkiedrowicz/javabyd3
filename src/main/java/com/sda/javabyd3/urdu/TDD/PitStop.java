package com.sda.javabyd3.urdu.TDD;

public class PitStop {

    private final PetrolStation petrolStation;
    private final Service service;
    private final CarWash carWash;

    public PitStop(PetrolStation petrolStation, Service service, CarWash carWash) {
        this.petrolStation = petrolStation;
        this.service = service;
        this.carWash = carWash;
    }

    public void performService(Car car) {
        petrolStation.fillUpToFull(car.getTank());
        carWash.washCar(car);
        service.changeWheels(car);
    }

    public void isServiceNeed(Car car) {
        if(car.getWearOfWheels()>=30){
            service.changeWheels(car);

        }
        if(car.getTank().getStatus()<30){
            petrolStation.fillUpToFull(car.getTank());

        }
        if(!car.isClean()){
            carWash.washCar(car);

        }
    }
}
