package com.sda.javabyd3.toki.tdd2;

public class PetrolStation {
    public int fillupTank(Tank tank) {
        int tankedValue = tank.getCapacity() - tank.getCurrentLevel();
        tank.setCurrentLevel(tank.getCurrentLevel() + tankedValue);
        return tankedValue;
    }

    public int fillFixedValue(Tank tank, int valueToTank) {
        if (valueToTank <= 0) {
            return 0;
        }
        int emptySpace = tank.getCapacity() - tank.getCurrentLevel();
        int tankedValue = valueToTank;
        if (valueToTank > emptySpace) {
            tankedValue = emptySpace;
        }
        tank.setCurrentLevel(tank.getCurrentLevel() + tankedValue);
        return tankedValue;
    }
}
