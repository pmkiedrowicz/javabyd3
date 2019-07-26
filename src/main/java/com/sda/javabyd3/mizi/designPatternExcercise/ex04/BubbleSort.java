package com.sda.javabyd3.mizi.designPatternExcercise.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sorting( int[] tableToSort, int first, int last)
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

}
