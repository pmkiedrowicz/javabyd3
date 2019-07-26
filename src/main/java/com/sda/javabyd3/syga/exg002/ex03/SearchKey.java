package com.sda.javabyd3.syga.exg002.ex03;

public class SearchKey {
    public SearchKey(){

    }

    public boolean contains(int[] array, int key){
        boolean bool = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                bool = true;
                break;
            }else bool = false;
        }
        return bool;
    }
}
