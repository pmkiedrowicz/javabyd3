package com.sda.javabyd3.urdu.designPatternExercises.ex04;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        SortingTimeCounter sortingTimeCounter = new SortingTimeCounter();

        SortingStrategy sortingStrategy = new QuickSort();
        System.out.println("Zaczynam sortowanie QuickSort: ");
        sortingTimeCounter.calculate(numbers, sortingStrategy);

        SortingStrategy sortingStrategy1 = new BubbleSort();
        System.out.println("Zaczynam sortowanie BubbleSort: ");
        sortingTimeCounter.calculate(numbers, sortingStrategy1);

    }
}
