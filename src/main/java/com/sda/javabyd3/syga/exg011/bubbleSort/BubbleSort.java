package com.sda.javabyd3.syga.exg011.bubbleSort;

public class BubbleSort {
    public int[] bubblesort(int[] tabOfNumber) {

        int temp;
        int zmiana =1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tabOfNumber.length -1; i++){
                if (tabOfNumber[i]>tabOfNumber[i+1]){
                    temp = tabOfNumber[i+1];
                    tabOfNumber[i+1] = tabOfNumber[i];
                    tabOfNumber[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < tabOfNumber.length; i++) {
            System.out.println(tabOfNumber[i]+" ");
        }
        return tabOfNumber;
    }
}
