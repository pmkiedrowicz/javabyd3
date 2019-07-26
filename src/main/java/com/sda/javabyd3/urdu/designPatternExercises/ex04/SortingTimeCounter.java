package com.sda.javabyd3.urdu.designPatternExercises.ex04;

import java.util.concurrent.TimeUnit;

public class SortingTimeCounter {

    long calculate(int[] array, SortingStrategy sortingStrategy){

       long start = System.nanoTime();
       sortingStrategy.sort(array,0,array.length-1);
       long end = System.nanoTime();
       long time= end-start;
       System.out.println("Sortowanie trwało: " + time + " nanosekund");
     //   System.out.println(TimeUnit.NANOSECONDS.toSeconds(time)+ "sekund"); // konwersja na sekundy
        return time;
    }
}
