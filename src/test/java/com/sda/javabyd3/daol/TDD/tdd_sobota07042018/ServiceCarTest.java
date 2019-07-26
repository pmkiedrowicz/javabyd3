package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ServiceCarTest {

    @Test
    public void shouldTiresEnd (){
        //given
        Car car = new Car(50);
        ServiceCar serviceCar = new ServiceCar ();
        //when
        serviceCar.changeTires(car);
        //then
        then(car.getUse()).isEqualTo(100);
    }
}
