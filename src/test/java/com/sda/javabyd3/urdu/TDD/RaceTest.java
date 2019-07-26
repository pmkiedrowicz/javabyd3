package com.sda.javabyd3.urdu.TDD;

import org.junit.Assert;
import org.junit.Test;


public class RaceTest {

    private PetrolStation petrolStation = new PetrolStation();

    private Service service = new Service();

    private CarWash carWash = new CarWash();


    @Test
    public void shouldDoLap(){
       //given
        Car car = new Car(true,0);
        int wheel=0, wash=0, tank=0;
       //when
        for (int i = 0; i < 100; i++) {

           if(i%5==0){car.setClean(false);}

            car.doLap();
            if(car.getWearOfWheels()>=30){
                service.changeWheels(car);
                wheel++;
            }
            if(car.getTank().getStatus()<30){
                petrolStation.fillUpToFull(car.getTank());
                tank++;
            }
            if(!car.isClean()){
                carWash.washCar(car);
                wash++;
            }
        }
       //then
        Assert.assertTrue("wheel =" + wheel,wheel==3);
        Assert.assertTrue("tank =" + tank,tank==3);
        Assert.assertTrue("wash =" + wash,wash==20);

      // then(carWash).should(atLeast(1)).washCar(car);
     //   then(service).should(atLeast(1)).changeWheels(car);
      //  then(petrolStation).should(atLeast(1)).fillUpToFull(car.getTank());
    }



}
