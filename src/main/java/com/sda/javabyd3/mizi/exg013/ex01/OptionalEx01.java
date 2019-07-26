package com.sda.javabyd3.mizi.exg013.ex01;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class OptionalEx01 {
    // test of this method are in PotionalEx01Test
    public String stringObjCreator(String text){
       // Scanner scanner = new Scanner( System.in );
        //System.out.println("Write here something to create object: ");
        String inPut = text;

        return inPut;
    }

    public ExampleObject ObjCreator(){
        ExampleObject exampleObject = new ExampleObject();
        return exampleObject;
    }
}
