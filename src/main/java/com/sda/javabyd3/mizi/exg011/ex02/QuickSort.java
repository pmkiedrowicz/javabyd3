package com.sda.javabyd3.mizi.exg011.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class QuickSort {
    public int[] quickSortMethod(int[] table, int left, int right){

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

        if(q > left) quickSortMethod( table, left, q );
        if(p < right) quickSortMethod( table, p, right );

        return table;
    }

}
