package com.sda.javabyd3.mizi.exg011.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class Main03 {
    public static void main(String[] args) {
        CountingSortEx03 countingSort = new CountingSortEx03();
        int tableToSort[] = {3, 60, 35, 2, 45, 320, 5, 320};
        int[] sortedTable =  null;

        System.out.println("Table to sort (before sorting): ");
        for(int i = 0; i < tableToSort.length; i ++)
        {
            System.out.print(" | " + tableToSort[i]);
        }

        sortedTable = countingSort.sortedByCounting( tableToSort );
        System.out.println( "\n Sorted table (counting sort): " );
        for(int i =0; i < sortedTable.length; i++)
        {
            System.out.print(" | " + sortedTable[i]);
        }
    }
}
