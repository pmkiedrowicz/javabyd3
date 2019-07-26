//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie oblicz
//pierwiastek kwadratowy wszystkich liczb. Każda wartość powinna być zaokrąglona
//do 2 miejsca po przecinku.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex07;

public class Stream_7Run
{
    public static void main(String[] args)
    {
        int [] numbers = { 148 , 105 , 36 , 37 , 56 , 132 , 121 , 36 , 180 ,
                8 , 61 , 171 , 180 , 6 , 65 , 0 , 66 , 58 , 162 , 25 , 128 , 35 , 32 , 4 , 104 ,
                6 , 75 , 31 , 66 , 125 , 188 , 159 , 121 , 61 , 173 , 188 , 34 , 141 , 182 ,
                192 , 18 , 18 , 165 , 136 , 76 , 64 , 41 , 195 , 147 , 74 };

        Stream_7 zad7 = new Stream_7();
        zad7.printArr(numbers);
        zad7.printSqrtArr(numbers);
    }
}
