package com.sda.javabyd3.kawa.TDD.TDDDay2;

import com.sda.javabyd3.kawa.TDD.FuelType;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(DataProviderRunner.class)
public class CarWashTest {


    @Test
    public void shouldWash() {
        //given
        Car car = new Car(FuelType.E95, 0,40,false, 70);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();
    }

    @DataProvider
    public static Object [][] dataProviderAdd(){
        // @formatter:off
        return new Object[][] {
                { true },
                { false },
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderAdd")
    public void testAdd(boolean clean){
        //given
        Car car = new Car(FuelType.E95, 0,40,clean, 70);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isTrue();
    }

    @DataProvider
    public static Object [][] dataProviderAddWithEx(){
        // @formatter:off
        return new Object[][] {
                { true, true },
                { false, true },
                /* ... */
        };
        // @formatter:on
    }

    @Test
    @UseDataProvider("dataProviderAddWithEx")
    public void testAddWithExpected(boolean clean, boolean expected){
        //given
        Car car = new Car(FuelType.E95, 0,40,clean, 70);
        CarWash carWash = new CarWash();
        //when
        carWash.washCar(car);
        //then
        then(car.isClean()).isEqualTo(expected);
    }
}
