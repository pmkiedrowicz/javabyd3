package com.sda.javabyd3.mizi.exg012.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class Main01 {
    public static void main(String[] args) {

        Integer[] table1 = {1,2,3,4,5,6};
        Double[] table2 = {2.1,2.2,2.3,2.4,2.5};
        Character[] table3 = {'a','b','c','d','e'};
        GenericClassex01 genericClassex01 = new GenericClassex01();
        System.out.println("tab1-------------");
        genericClassex01.genericMethodForTable( table1 );
        System.out.println("\n tab2-------------");
        genericClassex01.genericMethodForTable( table2 );
        System.out.println("\n tab3-------------");
        genericClassex01.genericMethodForTable( table3 );

    }
}
