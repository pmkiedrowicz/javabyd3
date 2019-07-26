package com.sda.javabyd3.mizi.exg015.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main1 {
    public static void main(String[] args) {
        EyeEnum colorGreen = EyeEnum.GREEN;
        List<Person015> listOfPerson =  new ArrayList <>(  );
        listOfPerson.add( new Person015( "Michal", "Ziolecki", EyeEnum.BROWN, SexEnum.MALE ) );
        listOfPerson.add( new Person015( "Xyz", "Zyx", EyeEnum.BLUE, SexEnum.FEMALE ) );
        listOfPerson.add( new Person015( "Xyz2", "Zyx2", colorGreen, SexEnum.MALE ) );

        System.out.println("List of person: ");
        for(Person015 person: listOfPerson){
            System.out.println(person);
        }
    }
}
