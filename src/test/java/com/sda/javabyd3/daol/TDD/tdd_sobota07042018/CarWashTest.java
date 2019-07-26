package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(DataProviderRunner.class)
public class CarWashTest {

    @DataProvider
    public static Object[][] dataProviderWashCar() {
        // @formatter:off
        return new Object[][]{
                {false},
                {true}
                // @formatter:on
        };
    }

    @DataProvider
    public static Object[][] dataProviderWashCarWithExpectedState() {
        // @formatter:off
        return new Object[][]{
                {false, true},
                {true, true}
                // @formatter:on
        };
    }

    @Test
    public void shouldWashCar() {
        //given
        Car car = new Car(false);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();
    }

    @Test
    public void shouldNotWashCar() {
        //given
        Car car = new Car(true);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();
    }

    @Test
    @UseDataProvider("dataProviderWashCar")
    public void shouldCarWashProvider(boolean currentCleanState) {
        //given
        Car car = new Car(currentCleanState);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();

    }

    @Test
    @UseDataProvider("dataProviderWashCarWithExpectedState")
    public void shouldCarWashProviderWithExpectedState(boolean currentCleanState,
                                                       boolean expectedCleanState) {
        //given
        Car car = new Car(currentCleanState);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isEqualTo(expectedCleanState);

    }
}
