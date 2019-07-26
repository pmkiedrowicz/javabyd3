package com.sda.javabyd3.mizi.exg009.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main05 {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList <>(  );
        ConverterToEquation converterToEquation = new ConverterToEquation();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj rownanie");
        String inPutString = scanner.nextLine();
        System.out.println(" Result is: " + converterToEquation.convertStringToEquation( inPutString ) );


    }
}
