package com.sda.javabyd3.mizi.designPatternExcercise.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class SortingTimeCounter {

    public long calculate(int[] array, SortingStrategy sortingStrategy){

        long start = System.currentTimeMillis();
        System.out.println("start time ms: " + start);
        sortingStrategy.sorting( array, 0, array.length - 1 );
        long end = System.currentTimeMillis();
        System.out.println("end time ms: " + end);
        long time =  end - start;

        return time;
    }

}
