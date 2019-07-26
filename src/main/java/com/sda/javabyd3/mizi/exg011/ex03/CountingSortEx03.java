package com.sda.javabyd3.mizi.exg011.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class CountingSortEx03 {
    public int[] sortedByCounting(int[] table){

        int min = table[0];
        int max = table[0];

        for(int i =0; i < table.length; i ++){
            if(min >= table[i]) min = table[i];
            if(max <= table[i]) max = table[i];
        }
        int size = max - min + 1;
        int[] countingTable = new int [size];

        for(int i = 0; i < countingTable.length; i++){
            countingTable[i] = 0;
        }

        for(int i = 0; i < table.length; i++){
            countingTable[(table[i]-min)]++;
        }

        System.out.println("\n counting table: ");
        for(int i = 0; i < countingTable.length; i++){
            if(countingTable[i] != 0 )
            System.out.print(" number: " + (i+min) + " = " + countingTable[i] + "; ");
        }

        int iterator = 0;
        for( int i = 0; i < countingTable.length; i++ ){
            if(countingTable[i] !=0){
                for(int j = 0; j < countingTable[i] ; j++){
                    table[iterator] = i + min;
                    iterator++;
                }
            }
        }

        return table;
    }
}
