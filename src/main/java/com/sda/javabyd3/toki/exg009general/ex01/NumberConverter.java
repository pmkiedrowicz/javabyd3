package com.sda.javabyd3.toki.exg009general.ex01;

import java.util.HashMap;

/**
 * Class converts number value to text value. Ex, if U privide 23
 * class will convert value to "dwadziescia trzy".
 */
public class NumberConverter {
    HashMap<Integer, String> unityMap = new HashMap<Integer, String>();
    HashMap<Integer, String> textMapLess20 = new HashMap<Integer, String>();
    HashMap<Integer, String> tensMap = new HashMap<Integer, String>();

    public NumberConverter() {
        unityMap.put(1, "jeden");
        unityMap.put(2, "dwa");
        unityMap.put(3, "trzy");
        unityMap.put(4, "cztery");
        unityMap.put(5, "piec");
        unityMap.put(6, "szesc");
        unityMap.put(7, "siedem");
        unityMap.put(8, "osiem");
        unityMap.put(9, "dziewiec");

        textMapLess20.put(10, "dziesiec");
        textMapLess20.put(11, "jedenascie");
        textMapLess20.put(12, "dwanascie");
        textMapLess20.put(13, "trzynascie");
        textMapLess20.put(14, "czternascie");
        textMapLess20.put(15, "pietnascie");
        textMapLess20.put(16, "szesnascie");
        textMapLess20.put(17, "siedemnascie");
        textMapLess20.put(18, "osiemnascie");
        textMapLess20.put(19, "dziewiecnascie");

        tensMap.put(2, "dwadziescia");
        tensMap.put(3, "trzydziesci");
        tensMap.put(4, "czterdziesci");
        tensMap.put(5, "piecdziesiat");
        tensMap.put(6, "szescdziesiat");
        tensMap.put(7, "siedemdziesiat");
        tensMap.put(8, "osiemdziesiat");
        tensMap.put(9, "dziewiecdziesiat");
    }

    /**
     * Converts privided integer vale by user to
     * text value representation.
     *
     * @param number Number to convert to text representation.
     * @return Number as text
     */

    public String convertToString(Integer number) {
        if (number > 99 || number < 1)
            throw new IllegalArgumentException("This number is wrong. Type a number in range 1-99");
        String result = "";
        if (number < 10) {
            result = unityMap.get(number);
        } else if (number < 20) {
            result = textMapLess20.get(number);
        } else {
            Integer tensDigit = number / 10;
            Integer unityDigit = number % 10;
            if (number % 10 == 0) {
                result = tensMap.get(tensDigit);
            } else {
                result = tensMap.get(tensDigit) + " " + unityMap.get(unityDigit);
            }
        }
        return result;
    }
}
