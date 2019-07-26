//Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
//zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej. Np. 23 ->
//dwadzieścia trzy

package com.sda.javabyd3.wowa.exg009.ex01;

import java.util.HashMap;

/**
 * Class converting number value to text value. Ex. if you provide "23" class
 * will convert value to "dwadziescia trzy"
 */

public class NumberConverter
{
    HashMap<Integer, String> unityMap = new HashMap<>();

    HashMap <Integer, String> textMapLess20 = new HashMap<>();

    HashMap <Integer, String> tensMap = new HashMap<>();

    public NumberConverter()
    {
        unityMap.put (1, "jeden");
        unityMap.put (2, "dwa");
        unityMap.put (3, "trzy");
        unityMap.put (4, "cztery");
        unityMap.put (5, "piec");
        unityMap.put (6, "szesc");
        unityMap.put (7, "siedem");
        unityMap.put (8, "osiem");
        unityMap.put (9, "dziewiec");

        textMapLess20.put (10, "dziesieć");
        textMapLess20.put (11, "jedenaście");
        textMapLess20.put (12, "dwanaście");
        textMapLess20.put (13, "trzynaście");
        textMapLess20.put (14, "czternaście");
        textMapLess20.put (15, "pietnaście");
        textMapLess20.put (16, "szesnaście");
        textMapLess20.put (17, "siedemnaście");
        textMapLess20.put (18, "osiemnaście");
        textMapLess20.put (19, "dziewiętnaście");

        tensMap.put (2, "dwadzieścia");
        tensMap.put (3, "trzydzieści");
        tensMap.put (4, "czterdzieści");
        tensMap.put (5, "pięćdziesiąt");
        tensMap.put (6, "sześćdziesiąt");
        tensMap.put (7, "siedemdziesiąt");
        tensMap.put (8, "osiemdziesiąt");
        tensMap.put (9, "dziewięćdziesiąt");
    }
    /**
     * Converts provided integer value by user to text value representation
     * Allowed range is <1,99>
     * @param number Number to convert to text representaion
     * @return Number as text
     */
    public String convertToString (Integer number)
    {
        if (number > 99 || number < 1)
        {
            throw new IllegalArgumentException("Provided number is out of range");
        }
        String result ="";

        if (number < 10)
        {
            result = unityMap.get(number);
        } else if (number < 20)
        {
            result = textMapLess20.get(number);
        } else
        {
            Integer tensDigit = number / 10;
            Integer unityDigit = number%10;
            result = tensMap.get(tensDigit);
            if (unityDigit > 0)
            {
                result = result + " " + unityMap.get(unityDigit);
            }
        }
        return result;
    }
}
