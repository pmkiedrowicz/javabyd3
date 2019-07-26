package com.sda.javabyd3.mizi.exg012.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class GenericClassex01 {
    public <E> void genericMethodForTable(E[] table){

        System.out.println("Element of table " + table.getClass().getCanonicalName());
        for(E item: table)
        {
            System.out.print(" " + item);
        }
    }
}
