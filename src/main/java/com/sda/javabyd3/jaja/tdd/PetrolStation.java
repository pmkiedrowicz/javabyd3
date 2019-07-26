package com.sda.javabyd3.jaja.tdd;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class PetrolStation {

    private double bigTankStation;
    final double price = 4.50;

    private double dieselTank;
    private double petrolTank;
    private double gasTank;

    final double dieselPrice = 4.60;
    final double petrolPrice = 5.00;
    final double dieselprice = 4.60;


    public PetrolStation(double bigTankStation){
        this.bigTankStation = bigTankStation;
    }

    public double fillUpToFull(Tank tank) {
        double tankedFuel = tank.getCapacity() - tank.getStatus();
        tank.setStatus(tank.getCapacity());
        return tankedFuel;

    }

    public double fillUpSpecificValue(Tank tank, double fuelToTank) {
        double tankedFuel = 0;
        if(fuelToTank<0){
            return tankedFuel;
        }
        if (tank.getStatus() + fuelToTank > tank.getCapacity()) {
            tankedFuel = tank.getCapacity() - tank.getStatus();
            tank.setStatus(tank.getCapacity());
        } else {
            tank.setStatus(tank.getStatus() + fuelToTank);
            tankedFuel = fuelToTank;
        }
        return tankedFuel;
    }

    public double costCounter(double tankedFuel) {
        double cost = tankedFuel * price;
        return cost;
    }

    public boolean canITank(double fuelToTank, double bigTankStation) {
        if (bigTankStation > fuelToTank) {
            return true;
        } else return false;
    }
}
