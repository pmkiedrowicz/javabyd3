package com.sda.javabyd3.mizi.exg009.ex01;

import java.util.HashMap;

/**
 * Created by Michal Ziolecki.
 */
    /*
     *Class converts number value to textvvalue. Ex if you provide "23"
     * class will conver value to "dwdzieścia trzy"
     */
public class NumberConverter {
    HashMap<Integer, String> textMapLess10 = new HashMap <Integer, String>(  );

    HashMap<Integer, String> textMapLess20 = new HashMap <Integer, String>(  ) {{

    }};

    HashMap<Integer, String> textMapGreaterThan20 = new HashMap <Integer, String>(  );
    public NumberConverter()
    {
         textMapLess10.put(1,"jeden");
         textMapLess10.put(2,"dwa");
         textMapLess10.put(3,"trzy");
         textMapLess10.put(4,"cztery");
         textMapLess10.put(5,"pięć");
         textMapLess10.put(6,"sześć");
         textMapLess10.put(7,"siedem");
         textMapLess10.put(8,"osiem");
         textMapLess10.put(9,"dziewięć");

        textMapLess20.put(10,"dziesięć");
        textMapLess20.put(11,"jedenaście");
        textMapLess20.put(12,"dwanaście");
        textMapLess20.put(13,"trzynaście");
        textMapLess20.put(14,"czternaście");
        textMapLess20.put(15,"piętnaście");
        textMapLess20.put(16,"szesnaście");
        textMapLess20.put(17,"siedemnaście");
        textMapLess20.put(18,"osiemnaście");
        textMapLess20.put(19,"dziewiętnaście");

        textMapGreaterThan20.put(2,"dwadzieścia");
        textMapGreaterThan20.put(3,"trzydzieści");
        textMapGreaterThan20.put(4,"czterdzieści");
        textMapGreaterThan20.put(5,"pięćdziesiąt");
        textMapGreaterThan20.put(6,"sześćdziesiąt");
        textMapGreaterThan20.put(7,"siedemdziesiąt");
        textMapGreaterThan20.put(8,"osiemdziesiąt");
        textMapGreaterThan20.put(9,"dziewięćdziesiąt");

    }
    /*
     *Converts provided integer value by user to
     * text value representation
     * @param number Number to convert to text representation
     * @return Number as text
     */
    public String convertToString(Integer number)
    {
        if(number > 99 || number < 1)
            throw new IllegalArgumentException( "Provided number is out of range" );
        String result = "";
        if(number < 10){
            result = textMapLess10.get( number );
        }
        else if (number < 20)
        {
            result = textMapLess20.get( number );
        }
        else{
            Integer tensDigit = number / 10;
            Integer unityDigit = number % 10;
            if(unityDigit > 0)
            {
                result = textMapGreaterThan20.get( tensDigit ) + " " + textMapLess10.get( unityDigit );
            }
            else{
                result = textMapGreaterThan20.get( tensDigit );
            }

        }
        return result;
    }
}
