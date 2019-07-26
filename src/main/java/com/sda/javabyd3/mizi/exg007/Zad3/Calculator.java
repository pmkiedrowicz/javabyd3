package com.sda.javabyd3.mizi.exg007.Zad3;

/**
 * Created by Michal Ziolecki.
 */
public class Calculator {
    public Integer sum(int arg0, int ... args)
    {
        Integer sum = arg0;
        for(int i =0; i < args.length; i++)
        {
            sum += args[i];
        }

        return sum;
    }
}
