package com.sda.javabyd3.mizi.exg015.ex02;

import com.sda.javabyd3.mizi.exg015.ex01.EyeEnum;
import com.sda.javabyd3.mizi.exg015.ex01.Person015;
import com.sda.javabyd3.mizi.exg015.ex01.SexEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main2 {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[36m";
        final String ANSI_YELLOW = "\u001B[33m";
        EyeEnum colorGreen = EyeEnum.GREEN;
        List<Person015> listOfPerson =  new ArrayList<>(  );
        listOfPerson.add( new Person015( "Michal", "Ziolecki", EyeEnum.BROWN, SexEnum.MALE ) );
        listOfPerson.add( new Person015( "Xyz", "Zyx", EyeEnum.BLUE, SexEnum.FEMALE ) );
        listOfPerson.add( new Person015( "Xyz2", "Zyx2", colorGreen, SexEnum.MALE ) );

        System.out.println("List of person: ");
        for(Person015 person: listOfPerson){
            switch (person.getSex()){
                case FEMALE:
                    System.out.println(ANSI_GREEN + person + ANSI_RESET);
                    break;
                case MALE:
                    System.out.println(ANSI_YELLOW  + person.toString() + ANSI_RESET);
            }
        }
    }
}
