package com.sda.javabyd3.syga.exg002.ex03;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int key = 2;
        SearchKey searchKey = new SearchKey();
        System.out.println(searchKey.contains(array, key));
    }
}
