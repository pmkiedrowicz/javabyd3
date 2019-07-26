package com.sda.javabyd3.mizi.exg009.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class ConverterToEquation {

    List<String> listOfString;

    public ConverterToEquation(){
        this.listOfString = new ArrayList <>(  );
    }

    public double convertStringToEquation(String inPut){
        CalculatorMethod calculatorMethod = new CalculatorMethod();
        int returnedResult = 0;
        double returnedDevideRelsult = 0;

        if(inPut.contains( "+" )) {
            listOfString = Arrays.asList( inPut.split( "\\+" ) );
            returnedResult = calculatorMethod.sum( Integer.parseInt( listOfString.get( 0 ) ) ,
                    Integer.parseInt( listOfString.get( 1 ) ));
        }
        else if (inPut.contains( "-" )){
            listOfString = Arrays.asList( inPut.split( "\\-" ) );
            returnedResult = calculatorMethod.substract( Integer.parseInt( listOfString.get( 0 ) ) ,
                    Integer.parseInt( listOfString.get( 1 )
            ));
        }
        else if(inPut.contains( "*" )){
            listOfString = Arrays.asList( inPut.split( "\\*" ) );
            returnedResult = calculatorMethod.multiply( Integer.parseInt( listOfString.get( 0 ) ) ,
                    Integer.parseInt( listOfString.get( 1 )
            ));

        }
        else if(inPut.contains( "/" )){
            listOfString = Arrays.asList( inPut.split( "\\/" ) );
            returnedDevideRelsult = calculatorMethod.divide( Integer.parseInt( listOfString.get( 0 ) ) ,
                    Integer.parseInt( listOfString.get( 1 ) ));
            return  returnedDevideRelsult;
        }
        return returnedResult;
    }

}
