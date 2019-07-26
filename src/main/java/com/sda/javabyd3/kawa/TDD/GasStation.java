package com.sda.javabyd3.kawa.TDD;

public class GasStation {
    public int fillTank(int cash) {
        int result = cash / 5;
        return result;
    }


    public void fillTankWithValueOfFuel(Tank tank, ValueFromUser valueFromUser) {
        tank.setStatus(valueFromUser.getValue());
    }

    public int fillTankForCash(Tank tank, int cash) {
        int result = cash / tank.getFuelType().getPrice();
//        tank.setStatus(result);
        return result;
    }

    public void fillAnyTank(Tank tank) {
        tank.setStatus(tank.getMax());
    }
}
