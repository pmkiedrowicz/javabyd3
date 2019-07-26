package com.sda.javabyd3.toki.tdd2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class PetrolStationTest {


    PetrolStation petrolStation;

    //czysty stan na wejsciu
    @Before
    public void setUp() throws Exception {
        petrolStation = new PetrolStation();
    }


    @Test
    public void shouldfillupTank() {
        //given
        Tank tank = new Tank(0, 60);
//        PetrolStation petrolStation = new PetrolStation();
        //when
        petrolStation.fillupTank(tank);
        //then
        then(tank.isFull()).isTrue();
    }

    @Test
    public void shouldFillFixedValue() {
        //given
        int initialLevel = 10;
        Tank tank = new Tank(initialLevel, 40);
        //PetrolStation petrolStation=new PetrolStation();
        //when
        petrolStation.fillFixedValue(tank, 30);
        //then
        then(tank.getCurrentLevel()).isGreaterThan(initialLevel);
        then(tank.getCurrentLevel()).isLessThanOrEqualTo(tank.getCapacity());
    }

    @Test
    public void shouldNotFillMoreThenCapacity() {
        //given
        int initialLevel = 10;
        Tank tank = new Tank(initialLevel, 40);
        int valueToTank = tank.getCapacity() - tank.getCurrentLevel() + 10;
        //PetrolStation petrolStation=new PetrolStation();
        //when
        petrolStation.fillFixedValue(tank, valueToTank);
        //then
        then(tank.getCurrentLevel()).isGreaterThanOrEqualTo(initialLevel);
        then(tank.getCurrentLevel()).isLessThanOrEqualTo(tank.getCapacity());
    }

    @Test
    public void shouldNotFillNegativeValue() {
        //given
        int initialLevel = 10;
        Tank tank = new Tank(initialLevel, 40);
        int valueToTank = -10;
        //PetrolStation petrolStation=new PetrolStation();
        //when
        petrolStation.fillFixedValue(tank, valueToTank);
        //then
        then(tank.getCurrentLevel()).isGreaterThanOrEqualTo(initialLevel);
        then(tank.getCurrentLevel()).isLessThanOrEqualTo(tank.getCapacity());
    }
}
