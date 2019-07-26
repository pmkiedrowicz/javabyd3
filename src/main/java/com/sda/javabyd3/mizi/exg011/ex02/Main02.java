package com.sda.javabyd3.mizi.exg011.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class Main02 {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int tableToSort[] = {3, 60, 35, 2, 45, 320, 5};
        int[] sortedTable =  null;

        System.out.println("Table to sort (before sorting): ");
        for(int i = 0; i < tableToSort.length; i ++)
        {
            System.out.print(" | " + tableToSort[i]);
        }

        sortedTable = quickSort.quickSortMethod( tableToSort, 0, tableToSort.length-1 );
        System.out.println( "\n Sorted table (counting sort): " );
        for(int i =0; i < sortedTable.length; i++)
        {
            System.out.print(" | " + sortedTable[i]);
        }
    }
}
