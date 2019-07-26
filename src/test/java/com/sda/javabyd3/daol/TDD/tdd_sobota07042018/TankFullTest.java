package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.assertj.core.api.BDDAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class TankFullTest {


    @DataProvider
    public static Object[][] dataProviderAdd() {
        // @formatter:off
        return new Object[][]{
                {20, 60, 20, 20},
                {20, 60, -20, 0},
                {20, 60, 40, 40},
                {20, 40, 30, 20},
        };
        // @formatter:on
    }

    @Test
    public void shouldTankIsFull() {
        //given
        Tank e95tank = new Tank(0, 60);
        FuelStation fuelStation = new FuelStation();
        //when
        fuelStation.tankToFull(e95tank);
        //then
        assertTrue(e95tank.getCapacity() == e95tank.getMaxCapacity());
    }

    @Test
    public void shouldCapacityIsAddedToTank() {
        //given
        int initialCapacity = 20;
        Tank tank = new Tank(initialCapacity, 60);
        FuelStation fuelStation = new FuelStation();
        int fuelToTank = 20;
        //when
        int tankedCapacity = fuelStation.tankSomeCapacity(tank, fuelToTank);
        //then
        assertTrue(tank.getCapacity() == initialCapacity + tankedCapacity);
    }

    @Test
    public void shouldMinusCapacityIsAddedToTank() {
        //given
        int initialCapacity = 20;
        Tank tank = new Tank(initialCapacity, 60);
        FuelStation fuelStation = new FuelStation();
        int fuelToTank = -20;
        //when
        int tankedCapacity = fuelStation.tankSomeCapacity(tank, fuelToTank);
        //then
        assertTrue(tank.getCapacity() >= initialCapacity);
    }

    @Test
    public void shouldHowMuchTankedCapacityCostedE95() {
        //given
        Tank tank = new Tank(20, 60);
        FuelStation fuelStation = new FuelStation();
        //when
        int cost = fuelStation.howMuchCost(fuelStation.tankSomeCapacity(tank, 20), FuelStation.E95_PRICE);
        //then
        assertTrue(cost == 20 * FuelStation.E95_PRICE);
    }

    @Test
    public void shouldONFuelIsTakenFromStationTank() {
        //given
        int initialONLevel = 500;
        int initialE95Level = 500;
        int initialE98Level = 500;
        FuelStation fuelStation = new FuelStation(initialE95Level, initialE98Level, initialONLevel);
        Tank tank = new Tank(20, 60, FuelType.ON);
        //when
        int tankedFuel = fuelStation.tankSomeCapacity(tank, 20);
        //then
        assertTrue(fuelStation.getONLevel() <= initialONLevel);
        assertTrue(fuelStation.getE95Level() == initialE95Level);
        assertTrue(fuelStation.getE98Level() == initialE98Level);

    }

    @Test
    @UseDataProvider("dataProviderAdd")
    public void testAdd(int initialCapacity, int maxCapacity, int fuelToTank, int expectedFuel) {
        // Given:
        Tank tank = new Tank(initialCapacity, maxCapacity);
        FuelStation fuelStation = new FuelStation();
        // When:
        int tankedFuel = fuelStation.tankSomeCapacity(tank, fuelToTank);
        // Then:
        BDDAssertions.then(tank.getCapacity()).isGreaterThanOrEqualTo(initialCapacity)
                .isLessThanOrEqualTo(tank.getMaxCapacity());
        BDDAssertions.then(tankedFuel).isEqualTo(expectedFuel);

    }
}
