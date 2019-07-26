package com.sda.javabyd3.jaja.designPatternEx.ex04;

public class Main {

    public static void main(String[] args) {

        SortingTimeCounter sortTime = new SortingTimeCounter();
        SortingStrategy sortingStrategy;
        int[] array = {5, 3, 1, 5, 7, 2, 5};
        System.out.println("Time sort result: ");
        sortingStrategy = new QuickSort();
        long timeQuickSort = sortTime.calculate(array, sortingStrategy);
        System.out.println("Quicksort time: " + timeQuickSort + " ms");
        sortingStrategy = new BubbleSort();
        long timeBubbleSort = sortTime.calculate(array, sortingStrategy);
        System.out.println("Bubblesort time: " + timeBubbleSort + " ms");


//        System.out.println("Quicksort: ");
//        QuickSort quickSort = new QuickSort();
//        int [] num = {5,3,1,5,7,2,5};
//        int[] sortArray = quickSort.calculate(num,0,num.length-1);
//        System.out.println(Arrays.toString(sortArray));
//
//
//        System.out.println("Bubblesort: ");
//        BubbleSort bubbleSort = new BubbleSort();
//        int [] sortBubble = bubbleSort.calculate(num,0,num.length-1);
//        System.out.println(Arrays.toString(sortBubble));
    }
}