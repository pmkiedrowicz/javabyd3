package com.sda.javabyd3.jaja.tdd;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(DataProviderRunner.class)
public class CarWashTest {

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

    @DataProvider
    public static Object[][] dataProviderCarWashDP() {
        // @formatter:off
        return new Object[][]{
                {false},
                {true},
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderCarWashDP")
    public void shouldWashCar(boolean clean) {
        //given
        Car car = new Car(clean);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();
    }
    @DataProvider
    public static Object[][] dataProviderCarWashWithExpectedResultDP() {
        // @formatter:off
        return new Object[][]{
                {false, true},
                {true, true},
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderCarWashWithExpectedResultDP")
    public void shouldWashCar2(boolean clean, boolean expected) {
        //given
        Car car = new Car(clean);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isEqualTo(expected);
}
}