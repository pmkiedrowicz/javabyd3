package com.sda.javabyd3.jaja.tdd;

import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ServiceTest {

    @Test
    public void shouldChangeWheel(){
        //given
        Car car = new Car(50);
        ServiceCar serviceCar = new ServiceCar();
        //when
        serviceCar.changeWheel(car);
        //then
        then(car.getUse()).isEqualTo(100);
    }
}
