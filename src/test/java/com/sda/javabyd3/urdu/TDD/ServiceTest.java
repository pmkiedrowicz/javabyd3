package com.sda.javabyd3.urdu.TDD;

import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ServiceTest {

    @Test
    public void shouldChangeWheels(){
     //given
       Car car = new Car(60);
        Service service = new Service();
     //when
        service.changeWheels(car);
     //then
        then(car.getWearOfWheels()).isEqualTo(0);
    }
}
