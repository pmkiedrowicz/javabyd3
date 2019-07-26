package com.sda.javabyd3.mizi;

/**
 * Created by Michal Ziolecki.
 */
public class CountingSort {

    public static int[][] countingSortO2(int[] tableToSort)
    {
        int min = 0;
        int max = 0;
        for(int i =0; i < tableToSort.length; i++)
        {
            if(tableToSort[i] > max) max = tableToSort[i];
            if(tableToSort[i] < min) min = tableToSort[i];
        }

        int lengthOfMyMap = max - min + 1;
        int[][] myHashMap = new int[2][lengthOfMyMap];

        for(int i = 0; i < lengthOfMyMap; i ++)
        {
            myHashMap[0][i] = i + min;
            myHashMap[1][i] = 0;
        }

        for(int i = 0; i < myHashMap[0].length; i++)
        {
            for(int j = 0; j < tableToSort.length; j++)
            {
                if(tableToSort[j] == myHashMap[0][i]) myHashMap[1][i] += 1;
            }
        }
        return myHashMap;
    }

    public static int[] countingSortO(int[] tableToSort)
    {
        int min = tableToSort[0];
        int max = tableToSort[0];
        for(int i =0; i < tableToSort.length; i++)
        {
            if(tableToSort[i] > max) max = tableToSort[i];
            if(tableToSort[i] < min) min = tableToSort[i];
        }
        int length = max - min;
        int[] counter = new int[length+1];

        for(int i = 0; i < counter.length; i++)
        {
            counter[i] = 0;
        }

        int amountOfElements = 0;
        for(int i = 0; i < tableToSort.length; i++)
        {
            counter[tableToSort[i] - min] += 1;
            amountOfElements++;
        }

        //System.out.println( "\n Sorted table (counting sort - complexity O^1): " );
        int[] finishTable = new int [amountOfElements];
        //System.out.println("ilosc elementow: " + amountOfElements);
       // System.out.println("min: " + min);
        for(int i = 0; i < counter.length; i++)
        {
            for(int j = 0; j < counter[i]; j++)
            {
                finishTable[amountOfElements-1] = i + min;
                amountOfElements--;
            }
        }
        return finishTable;
    }

    public static void main(String[] args) {
        int tableToSort[] = {3, 60, 35, 2, 45,20, 5, 60};
        int[][] myHashMap_O2 = null;
        int[] returnTablecomplexity_O;

        System.out.println("--------------------------");
        System.out.println("Table to sort (before sorting): ");
        for(int i = 0; i < tableToSort.length; i ++)
        {
            System.out.print(" | " + tableToSort[i]);
        }

        System.out.println("\n --------------------------");
        returnTablecomplexity_O = countingSortO( tableToSort );
        System.out.println( "\n Sorted table (counting sort - complexity O^1): " );
        for(int i = 0; i < returnTablecomplexity_O.length; i ++)
        {
            System.out.print(" | " + returnTablecomplexity_O[i]);
        }

        System.out.println("\n --------------------------");
        myHashMap_O2 = countingSortO2( tableToSort );
        System.out.println( "\n Sorted table (counting sort - complexity O^2): " );
        for(int i = 0; i < myHashMap_O2[0].length; i++)
        {
            if(myHashMap_O2[1][i] != 0)
            {

                for(int j = myHashMap_O2[1][i]; j > 0 ; j--)
                {
                    System.out.print(" " + myHashMap_O2[0][i] + "|");
                }
            }

        }
    }
}
