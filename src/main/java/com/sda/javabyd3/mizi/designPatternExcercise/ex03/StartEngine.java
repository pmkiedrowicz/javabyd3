package com.sda.javabyd3.mizi.designPatternExcercise.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class StartEngine implements SystemEngineControl {

    Car car;

   public StartEngine(){
       this.car = new Car();
   }

    @Override
    public boolean engineControl() {
        if(car.checkAbsSystem()== false) {
            System.out.println(" Check Abs ");
            return false;
        }
        else if(car.checkAirBagSystem()== false)
        {
            System.out.println(" Check Airbag ");
            return false;
        }
        else if(car.checkBatter()== false){
            System.out.println(" Check Batter ");
            return false;
        }
        else if(car.checkEspSystem()== false){
            System.out.println(" Check Esp system ");
            return false;
        }
        else if(car.checkOil()== false){
            System.out.println(" Check level of oil ");
            return false;
        }
        else if(car.checkFual()== false){
            System.out.println(" Check level of fuel ");
            return false;
        }
        else {
            System.out.println("Engine is ready to start...");
            return car.startEngine();
        }
    }
}
