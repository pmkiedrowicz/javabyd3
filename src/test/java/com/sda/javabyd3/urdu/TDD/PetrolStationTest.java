package com.sda.javabyd3.urdu.TDD;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(DataProviderRunner.class)
public class PetrolStationTest {
    PetrolStation petrolStation;

    @Before
    public void setUp() throws Exception {
        petrolStation = new PetrolStation();
    }

    @Test
    public void shouldFillUpCarToFull() {
        //given
        Tank tank = new Tank(30, 60);
      //  PetrolStation petrolStation = new PetrolStation();

        //when
        double tankedFuel = petrolStation.fillUpToFull(tank);

        //then
        assertTrue(tank.getCapacity() == tank.getStatus());
        then(tank.getStatus()).isEqualTo(tank.getCapacity());
    }

    @DataProvider
    public static Object[][] dataProviderFiller() {
        // @formatter:off
        return new Object[][]{
                {30, 60, 20},
                {30, 60, 50},
                {30, 60, -50},
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderFiller")
    public void shouldFillUpCarSpecificValueDP(double initialValue, double capacity, double fuelToTank) {
        //given
       // double initialValue = 30;
        Tank tank = new Tank(initialValue, capacity);
        // PetrolStation petrolStation = new PetrolStation();
        //when
      //  double fuelToTank = 20;
        petrolStation.fillUpSpecificValue(tank, fuelToTank);
        //then
        assertTrue(tank.getStatus() >=initialValue);
        then(tank.getStatus()).isLessThanOrEqualTo(tank.getCapacity());
    }

    @Test
    public void shouldFillUpCarSpecificValue() {
        //given
        double initialValue = 30;
        Tank tank = new Tank(initialValue, 60);
       // PetrolStation petrolStation = new PetrolStation();
        //when
        double fuelToTank = 20;
        petrolStation.fillUpSpecificValue(tank, fuelToTank);
        //then
        assertTrue(tank.getStatus() == initialValue + fuelToTank);
        then(tank.getStatus()).isEqualTo(initialValue+fuelToTank);
    }

    @Test
    public void shouldFillUpCarSpecificValueMoreThanCapacity() {
        //given
        Tank tank = new Tank(30, 60);
       // PetrolStation petrolStation = new PetrolStation();
        //when
        petrolStation.fillUpSpecificValue(tank, 50);
        //then
        assertTrue(tank.getStatus() == tank.getCapacity());

    }
    @Test
    public void shouldFillUpCarMinusValue() {
        //given
        double initialValue=30;
        Tank tank = new Tank(initialValue, 60);
       // PetrolStation petrolStation = new PetrolStation();
        //when
        petrolStation.fillUpSpecificValue(tank, -50);
        //then
        assertTrue(tank.getStatus() >= initialValue);
        then(tank.getStatus()).isGreaterThanOrEqualTo(initialValue);
    }

    @DataProvider
    public static Object[][] dataProviderHowManyFuel() {
        // @formatter:off
        return new Object[][]{
                {30, 60, 20, 20},
                {30, 60, 50, 30},
                {30, 60, -50, 0},
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderHowManyFuel")
    public void howManyFuelWasTankedToFullDP(double initialValue, double capacity, double fuelToTank, double expected) {
        //given
        Tank tank = new Tank(initialValue, capacity);
        // PetrolStation petrolStation = new PetrolStation();
        //when
        double tankedFuel = petrolStation.fillUpSpecificValue(tank,fuelToTank);
        //then
    //    assertTrue(tankedFuel == expected);
        then(tankedFuel).isEqualTo(expected);
        assertTrue(tank.getStatus() >=initialValue);

        then(tank.getStatus()).isLessThanOrEqualTo(tank.getCapacity())
                              .isGreaterThanOrEqualTo(initialValue);

    }

    @Test
    public void howManyFuelWasTankedToFull() {
        //given
        double initialValue = 10;
        Tank tank = new Tank(initialValue, 60);
       // PetrolStation petrolStation = new PetrolStation();
        //when
        double tankedFuel = petrolStation.fillUpToFull(tank);
        //then
        assertTrue(tankedFuel == tank.getCapacity() - initialValue);
    }

    @Test
    public void howManyFuelWasTankedWithSpecificValue() {
        //given
        Tank tank = new Tank(10, 60);
       // PetrolStation petrolStation = new PetrolStation();
        //when
        double fuelToTank = 30;
        double tankedFuel = petrolStation.fillUpSpecificValue(tank, fuelToTank);
        //then
        assertTrue(tankedFuel == fuelToTank);
    }

    @Test
    public void howManyFuelWasTankedWithSpecificValueMoreThanCapacity() {
        //given
        double initialValue = 10;
        Tank tank = new Tank(initialValue, 60);
      //  PetrolStation petrolStation = new PetrolStation();
        //when
        double tankedFuel = petrolStation.fillUpSpecificValue(tank, 80);
        //then
        assertTrue(tankedFuel == tank.getCapacity() - initialValue);
    }

    @Test
    public void isPriceIsCorrectTankedToFull() {
        //given
        Tank tank = new Tank(10, 60);
      //  PetrolStation petrolStation = new PetrolStation();
        //when
        double costOfTankedFuel = petrolStation.costCounter(petrolStation.fillUpToFull(tank));
        //then
        assertTrue(costOfTankedFuel == 225);
    }

    @Test
    public void isPriceIsCorrectTankedSpecificValue() {
        //given
        Tank tank = new Tank(10, 60);
     //   PetrolStation petrolStation = new PetrolStation();
        //when
        double costOfTankedFuel = petrolStation.costCounter(petrolStation.fillUpSpecificValue(tank, 30));
        //then
        assertTrue(costOfTankedFuel == 135);
    }

    @Test
    public void isEnoughFuelInTankStation() {
        //given
        Tank tank = new Tank(10, 60);
        PetrolStation petrolStation = new PetrolStation(1000);
        //when
        boolean result = petrolStation.canITank(petrolStation.fillUpToFull(tank), petrolStation.getBigTankStation());
        //then
        assertTrue(result);
    }

    @Test
    public void isNotEnoughFuelInTankStation() {
        //given
        Tank tank = new Tank(10, 60);
        PetrolStation petrolStation = new PetrolStation(30);
        //when
        boolean result = petrolStation.canITank(petrolStation.fillUpToFull(tank), petrolStation.getBigTankStation());
        //then
        Assert.assertFalse(result);
    }
 /*   @Test
    public void shouldTank(){
        //given
        Tank tank = new Tank(10,60);
        PetrolStation petrolStation = new PetrolStation();
        //when

        //then
    } */


}