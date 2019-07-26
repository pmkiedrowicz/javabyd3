package com.sda.javabyd3.daol.exampleOthersSorting.Bubble;

public class Main {
    public static void main(String[] args) {
        int[] table = {4,7,1,3,9,2,5};

        SortBubble sortBubble = new SortBubble();
        System.out.println("Table before sorted: ");
        sortBubble.seeTable(table);

        sortBubble.sortBubble(table);
        System.out.println();
        System.out.println("Table after sorted: ");
        sortBubble.seeTable(table);
    }
}
