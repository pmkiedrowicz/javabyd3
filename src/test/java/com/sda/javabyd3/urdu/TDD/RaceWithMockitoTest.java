package com.sda.javabyd3.urdu.TDD;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeast;

@RunWith(MockitoJUnitRunner.class)
public class RaceWithMockitoTest {

    @Mock
    private PetrolStation petrolStation = new PetrolStation();
    @Mock
    private Service service = new Service();
    @Mock
    private CarWash carWash = new CarWash();

    @InjectMocks
    private PitStop pitStop;

    @Test
    public void shouldDoLapM() {
        //given
        Car car = new Car(true, 0);
        //when
        for (int i = 0; i < 100; i++) {

            if (i % 5 == 0) {
                car.setClean(false);
            }
            car.doLap();
            pitStop.isServiceNeed(car);
        }
        //then
        then(carWash).should(atLeast(1)).washCar(car);
        then(service).should(atLeast(1)).changeWheels(car);
        then(petrolStation).should(atLeast(1)).fillUpToFull(car.getTank());
    }


}
