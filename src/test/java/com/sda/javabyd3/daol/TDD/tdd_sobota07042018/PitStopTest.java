package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;


import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class PitStopTest {
    @Mock
    private FuelStation fuelStation = new FuelStation();
    @Mock
    private CarWash carWash = new CarWash();
    @Mock
    private ServiceCar serviceCar = new ServiceCar();
    @InjectMocks
    private PitStop pitStop;

    @Test
    public void shouldPerformService() {
        //given
        Car car = new Car(false);
        //when
        pitStop.performService(car);
        //then
        BDDMockito.then(carWash).should().washCar(car);
        BDDMockito.then(fuelStation).should().tankToFull(car.getTank());
        BDDMockito.then(fuelStation).should(never()).tankSomeCapacity(eq(car.getTank()),anyInt());
        BDDMockito.then(serviceCar).should().changeTires(car);
    }

    }

