package com.sda.javabyd3.kawa.TDD;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.BDDAssertions.then;

@RunWith(DataProviderRunner.class)
public class GasStationTest {

    GasStation gasStation;

    @Before
    public void setUp() throws Exception{
        gasStation = new GasStation();
    }

    @Test
    public void shouldFillCar() {
        //given
        Tank tank = new Tank(0, 60, FuelType.E95);
        //when
        gasStation.fillAnyTank(tank);
        //then
//        assertTrue(tank.isFull());    <- to samo
        then(tank.isFull()).isTrue();
    }

    @Test
    public void shouldFillFuelAnyForCash() {
        //given
        int initialValue = 0;
        Tank tank = new Tank(initialValue, 60, FuelType.E95);
        //when
        int cash = 150;
        gasStation.fillTank(cash);
        //then
        int expected = 30;
        assertEquals(expected, tank.getStatus() + gasStation.fillTank(cash));
    }

    @Test
    public void shouldFillValueOfFuel() {
        //given
        int initialValue = 0;
        Tank tank = new Tank(initialValue, 60, FuelType.E98);
        ValueFromUser valueFromUser = new ValueFromUser(20);
        //when
        gasStation.fillTankWithValueOfFuel(tank, valueFromUser);
        //then

        assertEquals(initialValue + valueFromUser.getValue(), tank.getStatus());
        then(tank.getStatus()).isEqualTo(initialValue + valueFromUser.getValue());

    }

    @Test
    public void shouldGetFuelType() {
        //given
        int initialFuel = 0;
        Tank tank = new Tank(initialFuel, 60, FuelType.ON);
        GasStation gasStation = new GasStation();

        //when
        int filledFuel = gasStation.fillTankForCash(tank, 200);
        tank.setStatus(filledFuel);
        //then
        assertTrue(tank.getStatus() > initialFuel);
        assertTrue(tank.getStatus() <= tank.getMax());

    }

    @Test
    public void shouldNotFillMoreThenCapacity(){
        //given
        int initialValue = 0;
        Tank tank = new Tank(initialValue, 60, FuelType.E98);
        GasStation gasStation = new GasStation();
        ValueFromUser valueFromUser = new ValueFromUser(60);
        //when
        gasStation.fillTankWithValueOfFuel(tank, valueFromUser);
        //then
        then(tank.getStatus()).isLessThanOrEqualTo(tank.getMax());

    }@Test
    public void shouldNotFillNegativeValue(){
        //given
        int initialValue = 0;
        Tank tank = new Tank(initialValue, 60, FuelType.E98);
        GasStation gasStation = new GasStation();
        ValueFromUser valueFromUser = new ValueFromUser(-10);
        //when
        gasStation.fillTankWithValueOfFuel(tank, valueFromUser);
        //then
        then(tank.getStatus()).isLessThanOrEqualTo(tank.getMax());

    }

    @DataProvider
    public static Object[][] dataProviderAdd() {
        // @formatter:off
        return new Object[][] {
                { 0, 60, 60 },
                { 0, 60, -20 },
                /* ... */
        };
        // @formatter:on
    }
    @Test
    @UseDataProvider("dataProviderAdd")
    public void testAdd(int initalValue, int maxCapacity, int value) {
        // Given:
        Tank tank = new Tank(initalValue, maxCapacity, FuelType.E98);
        ValueFromUser valueFromUser = new ValueFromUser(value);
        // When:
        gasStation.fillTankWithValueOfFuel(tank, valueFromUser);

        // Then:
        then(tank.getStatus()).isLessThanOrEqualTo(tank.getMax());

    }

}
