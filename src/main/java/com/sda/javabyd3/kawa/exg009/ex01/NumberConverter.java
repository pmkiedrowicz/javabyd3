package com.sda.javabyd3.kawa.exg009.ex01;

import java.util.HashMap;

/**
 * Class converts number value to text value. Ex. if you provide 23 class will convert value to "dwadziescia trzy"
 */
public class NumberConverter {
    HashMap<Integer, String> unityMap = new HashMap<>();

    HashMap<Integer, String> lessThan20Map = new HashMap<>();

    HashMap<Integer, String> tensMap = new HashMap<>();

    /**
     * Class Number converter constructor. Create instance of the class and initialize all internal values.
     */
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

        lessThan20Map.put(10, "dziesiec");
        lessThan20Map.put(11, "jedenascie");
        lessThan20Map.put(12, "dwanascie");
        lessThan20Map.put(13, "trzynascie");
        lessThan20Map.put(14, "czternascie");
        lessThan20Map.put(15, "pietnascie");
        lessThan20Map.put(16, "szesnascie");
        lessThan20Map.put(17, "siedemnascie");
        lessThan20Map.put(18, "osiemnascie");
        lessThan20Map.put(19, "dziewietnascie");

        tensMap.put(2, "dwadziescia");
        tensMap.put(3, "trzydziesci");
        tensMap.put(4, "czterdziesci");
        tensMap.put(5, "piecdziesiat");
        tensMap.put(6, "szescdziesiat");
        tensMap.put(7, "siedemdziesiat");
        tensMap.put(8, "osiemdziesiat");
        tensMap.put(9, "dziewiedziesiat");
    }

    /**
     * Converts providev integer value by user to text value representation. Allowed range is <1,99>
     *
     * @param number Number to convert to text representation.
     * @return Number as text
     */
    public String converToString(int number) {
        if (number > 99 || number < 1)
            throw new IllegalArgumentException("Provided number is out of range [1-99]");
        String result = "";
        if (number < 10) {
            result = unityMap.get(number);
        } else if (number < 20) {
            result = lessThan20Map.get(number);
        } else {
            Integer tensDigit = number / 10;
            Integer unityDigity = number % 10;
            result = tensMap.get(tensDigit);
            if (unityDigity > 0) {
                result += " " + unityMap.get(unityDigity);
            }
        }
        return result;
    }
}
