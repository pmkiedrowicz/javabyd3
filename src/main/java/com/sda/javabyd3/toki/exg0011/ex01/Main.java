package com.sda.javabyd3.toki.exg0011.ex01;

public class Main {
    public static void main(String[] args) {

        int[] tab = {22, 54, 23, 45, 65, 98};
        int[] tab2;
        BubbleSort bubble=new BubbleSort();
        tab2 = bubble.bubbleSort(tab);

        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i] + " ");
        }
    }
}
