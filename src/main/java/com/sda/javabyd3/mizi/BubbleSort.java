package com.sda.javabyd3.mizi;

/**
 * Created by Michal Ziolecki.
 */
public class BubbleSort {
    public static int[] bubbleSort( int[] tableToSort)
    {
        int checkStatus = 1;
        while(checkStatus> 0)
        {
            checkStatus = 0;
            for(int i =0; i < tableToSort.length - 1; i++)
            {
                if(tableToSort[i] > tableToSort[i+1])
                {
                    checkStatus = 1;
                    int temporaryMemory = tableToSort[i+1];
                    tableToSort[i+1] = tableToSort[i];
                    tableToSort[i] = temporaryMemory;
                }
            }
        }
        return tableToSort;
    }

    public static void main(String[] args) {
        int tableToSort[] = {3, 60, 35, 2, 45, 320, 5};
        int[] sortedTable =  null;

        System.out.println("Table to sort (before sorting): ");
        for(int i = 0; i < tableToSort.length; i ++)
        {
            System.out.print(" | " + tableToSort[i]);
        }

        sortedTable = bubbleSort( tableToSort );
        System.out.println( "\n Sorted table (bubble sort): " );
        for(int i =0; i < sortedTable.length; i++)
        {
            System.out.print(" | " + sortedTable[i]);
        }
    }
}
