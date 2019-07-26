package com.sda.javabyd3.urdu.sorting;

public class MainCount {

    public static void main(String[] args) {

        int[] numbers = new int[]{11, 10, 5, 6, 9, 22};
        int[] numbers2 = new int[]{10, 15, 33, 4, 66, 9};
        int[] numbers3 = new int[]{1,84,32,70,4};

        BubbleSort bubbleSort = new BubbleSort();
        CountedSort countedSort = new CountedSort();

       bubbleSort.writeArray( countedSort.sortedCount(numbers));

       bubbleSort.writeArray( countedSort.sortedCount(numbers2));

       bubbleSort.writeArray( countedSort.sortedCount(numbers3));


    }
}
