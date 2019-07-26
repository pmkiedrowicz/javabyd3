package com.sda.javabyd3.jaja.exg009.ex01;

import java.util.HashMap;

/**
 * Class converts number value to text value. Ex. if you provide "23"
 * class will convert value to "dwadzieścia trzy"
 */
public class NumberConverter {
    HashMap<Integer, String> textMap = new HashMap<>();
    HashMap<Integer, String> textMapLess20 = new HashMap<>();
    HashMap<Integer, String> textMapGreaterThan20 = new HashMap<>();


    public NumberConverter() {
        textMap.put(1, "jeden");
        textMap.put(2, "dwa");
        textMap.put(3, "trzy");
        textMap.put(4, "cztery");
        textMap.put(5, "pięć");
        textMap.put(6, "sześć");
        textMap.put(7, "siedem");
        textMap.put(8, "osiem");
        textMap.put(9, "dziewięć");

        textMapLess20.put(10, "dziesięć");
        textMapLess20.put(11, "jedenaście");
        textMapLess20.put(12, "dwanaście");
        textMapLess20.put(13, "trzynaście");
        textMapLess20.put(14, "czternaście");
        textMapLess20.put(15, "piętnaście");
        textMapLess20.put(16, "szesnaście");
        textMapLess20.put(17, "siedemnaście");
        textMapLess20.put(18, "osiemnaście");
        textMapLess20.put(19, "dziewiętnaście");

        textMapGreaterThan20.put(2, "dwadzieścia");
        textMapGreaterThan20.put(3, "trzydzieści");
        textMapGreaterThan20.put(4, "czterdzieści");
        textMapGreaterThan20.put(5, "pięćdziesiąt");
        textMapGreaterThan20.put(6, "sześćdziesiąt");
        textMapGreaterThan20.put(7, "siedemdziesiąt");
        textMapGreaterThan20.put(8, "osiemdziesiąt");
        textMapGreaterThan20.put(9, "dziewięćdziesiąt");
    }

    /**
     * Convert providev integer value by user to
     * text value representation. Allowed range is <1,99>
     *
     * @param number NUmber to convert to text representation.
     * @return Number as text
     */
    public String convertToString(Integer number){
        if(number>99 || number <1)
            throw  new IllegalArgumentException("Provided number is out of range.");
        String result = "";
        if (number <10) {
            result = textMap.get(number);
        } else if (number<20){
            result = textMapLess20.get(number);
        }else {
            Integer tenDigit = number /10;
            Integer unityDigit = number % 10;
            result = textMapGreaterThan20.get(tenDigit);
            if (unityDigit>0){
                result +=" "+ textMap.get(unityDigit);
            }
        }
        return result;
    }
}
