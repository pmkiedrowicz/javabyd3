package com.sda.javabyd3.urdu.TDD;

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

    @DataProvider
    public static Object[][] dataProviderWash() {
        // @formatter:off
        return new Object[][]{
                {true},
                {false}
        };
                // @formatter:on
         }
    @Test
    @UseDataProvider("dataProviderWash")
    public void shouldWashCarDP(boolean clean) {
        //given
        Car car = new Car(clean);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();

    }
    @DataProvider
    public static Object[][] dataProviderWash2() {
        // @formatter:off
        return new Object[][]{
                {true, true},
                {false,true}
        };
        // @formatter:on
    }
    @Test
    @UseDataProvider("dataProviderWash2")
    public void shouldWashCarDP2(boolean clean, boolean expected) {
        //given
        Car car = new Car(clean);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isEqualTo(expected);

    }

    }
