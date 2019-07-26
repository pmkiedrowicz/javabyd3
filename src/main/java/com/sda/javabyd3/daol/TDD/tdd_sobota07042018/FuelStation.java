package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FuelStation {

    public static final int E95_PRICE = 5;
    public static final int E98_PRICE = 6;
    public static final int ON_PRICE = 4;

    private int E95Level;
    private int E98Level;
    private int ONLevel;

    public FuelStation(int E95Level, int E98Level, int ONLevel) {
        this.E95Level = E95Level;
        this.E98Level = E98Level;
        this.ONLevel = ONLevel;
    }

    public void tankToFull(Tank tank) {
        tank.setCapacity(tank.getMaxCapacity());
    }

    public int tankSomeCapacity(Tank tank, int fuelToTank) {
        if(fuelToTank <= 0){
            return 0;
        }
        int emptySpace = tank.getMaxCapacity() - tank.getCapacity();
        int tankedValue = fuelToTank;
        if (fuelToTank > emptySpace) {
            tankedValue = emptySpace;
        }
        tank.setCapacity(tank.getCapacity() + tankedValue);
        return tankedValue;
    }

    public int howMuchCost(int fuelToTank, int price) {
        return fuelToTank * price;
    }

    public int getE95Level() {
        return E95Level;
    }

    public void setE95Level(int e95Level) {
        E95Level = e95Level;
    }

    public int getE98Level() {
        return E98Level;
    }

    public void setE98Level(int e98Level) {
        E98Level = e98Level;
    }

    public int getONLevel() {
        return ONLevel;
    }

    public void setONLevel(int ONLevel) {
        this.ONLevel = ONLevel;
    }
}
