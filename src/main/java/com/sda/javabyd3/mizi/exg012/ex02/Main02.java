package com.sda.javabyd3.mizi.exg012.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class Main02 {
    public static void main(String[] args) {
        Integer[] table1 = {1,2,3,4,5,6};
        GenericClassEx02 genericClassEx02 = new GenericClassEx02();

        System.out.println("Returned list below: ");
        for (Integer element: genericClassEx02.genericMethodReturningTheList( table1 )){
            System.out.print(" " + element);
        }
    }
}
