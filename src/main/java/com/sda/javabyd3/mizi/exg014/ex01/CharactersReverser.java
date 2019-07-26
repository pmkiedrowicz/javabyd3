package com.sda.javabyd3.mizi.exg014.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class CharactersReverser {

    public String reverser(String stringToReverse){
        String reverseString = "";

        for(int i = stringToReverse.length() - 1; i >= 0; i--){
            reverseString += stringToReverse.charAt( i );
        }
        return reverseString;
    }

    public String reverserWithRecursionMethod(String stringToReverse,String reverse ,int positionToReverse){
        String reverseStringWithRecursion = reverse;
        if( positionToReverse < stringToReverse.length()){
            reverseStringWithRecursion = reverserWithRecursionMethod(stringToReverse, reverseStringWithRecursion,
                    positionToReverse + 1);
            reverseStringWithRecursion += stringToReverse.charAt( positionToReverse );
        }

        return reverseStringWithRecursion;
    }
}
