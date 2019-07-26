package com.sda.javabyd3.mizi.designPatternExcercise.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sorting(int[] table, int left, int right){


        int pivot = table[(right + left)/2];
        int temporaryField;
        int p = left;
        int q = right;

        do{
            while(table[p] < pivot) p++;
            while(table[q] > pivot) q--;
            if(p <= q)
            {
                temporaryField = table[p];
                table[p] = table[q];
                table[q] = temporaryField;
                p++;
                q--;
            }
        }while(p <= q);

        if(q > left) sorting( table, left, q );
        if(p < right) sorting( table, p, right );

        return table;
    }

}
