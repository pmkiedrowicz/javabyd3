package com.sda.javabyd3.mizi.exg011.ex04;



/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int tableToSort[] = {3, 60, 35, 2, 45, 320, 5};
        int[] sortedTable =  null;

        System.out.println("Table to sort (before sorting): ");
        for(int i = 0; i < tableToSort.length; i ++)
        {
            System.out.print(" | " + tableToSort[i]);
        }

        sortedTable = heapSort.sortingByHeap( tableToSort );
        System.out.println( "\n Sorted table (heap sort): " );
        for(int i =0; i < sortedTable.length; i++)
        {
            System.out.print(" | " + sortedTable[i]);
        }
    }
}
