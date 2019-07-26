package com.sda.javabyd3.mizi.exg011.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class HeapSort {

    public int[] sortingByHeap(int[] table){
        int N = table.length - 1;
        table = heapify(table, N);
        for(int i = N; i >= 0; i--){
            int tmp = table[0];
            table[0] = table[i];
            table[i] = tmp;
            N = N - 1;
            table = maxHeap( table, 0, N );
        }

        return table;
    }
    private int[] heapify(int[] table, int N){

        for(int i = N; i >=0; i-- ){
            table = maxHeap( table, i , N);
        }

        return table;
    }

    private int[] maxHeap(int[] table, int element, int N){
        int max = element;
        int leftChild = element * 2 + 1;
        int rightChild = element * 2;

        if(leftChild <= N && table[leftChild] > table[max]){
            max = leftChild;
        }
        if(rightChild <= N && table[rightChild] > table[max]){
            max = rightChild;
        }

        if(max != element){
            int tmp = table[element];
            table[element] = table[max];
            table[max] = tmp;
            maxHeap( table, max, N );
        }


        return table;

    }
}
