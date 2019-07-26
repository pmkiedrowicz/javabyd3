package com.sda.javabyd3.migr.exg009.ex01;

import java.util.HashMap;

/**
 * Class converts number value to text value. Ex. if you provide 23
 * class will convert value to "dwadzieścia trzy"
 */

public class NumberConverter {

    HashMap<Integer, String> unityMap = new HashMap<Integer, String>() {{
        put(1, "jeden");
        put(2, "dwa");
        put(3, "trzy");
        put(4, "cztery");
        put(5, "pięć");
        put(6, "sześć");
        put(7, "siedem");
        put(8, "osiem");
        put(9, "dziewięć");

    }};

    HashMap<Integer, String> textMapLess20 = new HashMap<Integer, String>() {{
        put(10, "dziesięć");
        put(11, "jedenaście");
        put(12, "dwanaście");
        put(13, "trzynaście");
        put(14, "czternaście");
        put(15, "piętnaście");
        put(16, "szesnaście");
        put(17, "siedemnaście");
        put(18, "osiemnaście");
        put(19, "dziewiętnaście");


    }};

    HashMap<Integer, String> tensMap = new HashMap<Integer, String>() {{
        put(2, "dwadzieście");
        put(3, "trzydzieści");
        put(4, "czterdzieści");
        put(5, "pięćdzieśiąt");
        put(6, "sześćdzesiąt");
        put(7, "siedemdzieśiąt");
        put(8, "osiemdziesiąt");
        put(9, "dziewięćdziesiąt");


    }};


    /**
     * Converts provided integer value by user to text value representation. Allowed range is <1,99>
     *
     * @param number Number to convert to text representation
     * @return Number as text
     */

    public String convertToString(Integer number) {

        if (number > 99 || number < 1)
            throw new IllegalArgumentException("Provided number is out of range");
        String result = "";
        if (number < 10) {
            result = unityMap.get(number);
        } else if (number < 20) {
            result = textMapLess20.get(number);
        } else {
            Integer tensDigit = number / 10;
            Integer unityDigit = number % 10;
            result = tensMap.get(tensDigit);
            if (unityDigit >0){
                result += " " + unityMap.get(unityDigit);
            }
        }
        return result;
    }
}
