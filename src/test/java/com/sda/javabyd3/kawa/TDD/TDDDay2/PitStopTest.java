package com.sda.javabyd3.kawa.TDD.TDDDay2;

import com.sda.javabyd3.kawa.TDD.FuelType;
import com.sda.javabyd3.kawa.TDD.GasStation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PitStopTest {

    @Mock
    private GasStation gasStation = new GasStation();
    @Mock
    private Tires tires = new Tires();
    @Mock
    private CarWash carWash = new CarWash();
    @InjectMocks
    private PitStop pitStop;

    @Test
    public void shouldPerformService (){
        //given
        pitStop = new PitStop(new Car(FuelType.E98,0, 60,false, 55));
        //when
        pitStop.performService(pitStop.getCar());
        //then
//        BDDMockito.then(carWash).should().washCar(pitStop.getCar());
//        BDDMockito.then(tires).should().changeTires(pitStop.getCar().getTiresUsage());
//        BDDMockito.then(gasStation).should().fillTank(pitStop.getCar().getTank().getStatus());
//        BDDMockito.then(gasStation).should(never()).fillTankForCash(...)
    }
}
