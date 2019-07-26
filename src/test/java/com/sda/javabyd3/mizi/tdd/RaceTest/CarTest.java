package com.sda.javabyd3.mizi.tdd.RaceTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeast;


/**
 * Created by Michal Ziolecki.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    /**
     * junit.Assert method test
     * */
   Car car = new Car();
    PitStop pitStop = new PitStop();

    @Test
    public void levelOfFuel() throws Exception {
        Assert.assertEquals( 98.0, car.levelOfFuel(), 0.0 );
    }

    @Test
    public void dirtiness() throws Exception {
        Assert.assertTrue( car.dirtiness( ) );
    }

    @Test
    public void TireWear() throws Exception {
        Assert.assertEquals( 99 , car.tireWear() );
    }

    /**
     * Mockito method test
     * */

    @Mock
    Car car_Mockito = new Car();
    @Mock
    PitStop pitStop_Mockito = new PitStop();

    @Test
    public void testEncirclement() throws Exception{
        for(int i =0; i < 100; i++){
            car_Mockito.doEncirclement(i);

            if(car_Mockito.getFuel() < 50){
                car_Mockito.setFuel( pitStop_Mockito.refueling( car_Mockito.getFuel() ) );
            }
            if(car_Mockito.isTireProblem() < 70){
                car_Mockito.setTireProblem( pitStop_Mockito.changeTires( car_Mockito.isTireProblem() ) );
            }
            if(car_Mockito.isDirt()){
                car_Mockito.setDirt( pitStop_Mockito.washCar( car_Mockito.isDirt() ) );
            }
        }
        then(pitStop_Mockito).should(atLeast( 3 )).refueling( car_Mockito.getFuel() );
        then(pitStop_Mockito).should(atLeast(  3 )).changeTires( car_Mockito.isTireProblem() );


    }


}