package com.sda.javabyd3.kawa.TDD.TDDDay2;

import com.sda.javabyd3.kawa.TDD.FuelType;
import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class CarWorkShopTest {

    @Test
    public void shouldChangeTires () {
        //given
        Car car = new Car(FuelType.E95, 0,40,false, 70);
        Tires tires = new Tires();
        //when
        boolean test = tires.changeTires(car.getTiresUsage());
        //then
        then(test).isTrue();
    }
}
