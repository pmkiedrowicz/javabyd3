package com.sda.javabyd3.mabr.algorytmy;

public class MainBubble {

    public static void main(String[] args) {

        int[] list = new int[] {3,9,1,7,3};

        Bubble bubble = new Bubble();

        System.out.println("Original Random array: ");
        bubble.PrintArray(list);

        bubble.BubbleSort(list);

        System.out.println("\nAfter bubble sort: ");
        bubble.PrintArray(list);
    }
}

