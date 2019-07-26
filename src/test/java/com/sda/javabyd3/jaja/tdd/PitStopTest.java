package com.sda.javabyd3.jaja.tdd;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class PitStopTest {

    @Mock
    private PetrolStation petrolStation =  new PetrolStation();
    @Mock
    private CarWash carWash = new CarWash();
    @Mock
    private ServiceCar serviceCar = new ServiceCar();
    @InjectMocks
    private PitStop pitStop;

    @Test
    public void shouldPerformService(){
        //given
        Car car = new Car(false);
        //when
        pitStop.performService(car);
        //then
        then(carWash).should().washCar(car);
        then(petrolStation).should().fillUpToFull(car.getTank());
        then(petrolStation).should(never())
                .fillUpSpecificValue(eq(car.getTank()),anyInt());// 'never' chcemy sprawdzic, ze nie zostala wywolana
        then(serviceCar).should().changeWheel(car);
    }
}
