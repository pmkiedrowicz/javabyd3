package com.sda.javabyd3.mizi.designPatternExcercise.ex04;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        SortingTimeCounter sortingTimeCounter = new SortingTimeCounter();
        SortingStrategy sortingStrategy;
        long time = 0;
        int[] tab = {1,5,4,3,8,10,101,20,15,17,16,48,49,5,33,5,12,15};
        System.out.println("Choose method of sorting - write 'bubble' or 'quick': ");
        String inPut = scanner.nextLine();
        if(inPut.equals( "bubble" )) {
            System.out.println("Bubble sort started: ");
            sortingStrategy = new BubbleSort();
            time = sortingTimeCounter.calculate( tab, sortingStrategy );
        }
        else if(inPut.equals( "quick" )) {
            System.out.println("QuickSort started: ");
            sortingStrategy = new QuickSort();
            time = sortingTimeCounter.calculate( tab, sortingStrategy );
        }
        else{
            System.out.println("wrong input");
        }

        System.out.println("Time [ms]: " + time);
    }
}
