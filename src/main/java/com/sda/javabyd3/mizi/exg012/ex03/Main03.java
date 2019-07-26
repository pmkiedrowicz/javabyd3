package com.sda.javabyd3.mizi.exg012.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class Main03 {
    public static void main(String[] args) {
        GenericMethodEx03 genericMethodEx03 = new GenericMethodEx03();
        genericMethodEx03.addToList( 2 );
        genericMethodEx03.addToList( 3 );
        genericMethodEx03.addToList( 4 );

        System.out.println("Element of list: ");
        for(Object el : genericMethodEx03.getListOfObject()){
            System.out.print(" " + el);
        }
    }
}
