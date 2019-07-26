package com.sda.javabyd3.urdu.sorting;


import java.util.Arrays;

public class MainBubble {

    public static void main(String[] args) {

        int[] numbers = new int[]{11, 10, 5, 6, 9, 22};
        int[] numbers2 = new int[]{10, 15, 20, 4, 66, 9};
        int[] numbers3 = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162};
        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.writeArray(numbers);
        System.out.println("Posortowana tablica :");

        bubbleSort.writeArray(bubbleSort.sortedBubble(numbers));
        System.out.println();
        bubbleSort.writeArray(numbers2);
        System.out.println("Posortowana druga tablica");
        bubbleSort.writeArray(bubbleSort.sortedBubble(numbers2));
        System.out.println(Arrays.toString(bubbleSort.sortedBubble(numbers2)));  //drugi sposób wyświetlenia

        bubbleSort.writeArray(bubbleSort.sortedBubble(numbers3));

    }
}
