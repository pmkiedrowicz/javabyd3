package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michal Ziolecki.
 */
public class ZadDod4 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd-MM-yyyy" );
        String inputString1 = "13-03-2018";
        String inputString2 = "10-09-1992";
        Date date1;
        Date date2;
        long daysBetweenDates = 0;
        try {
            date1 = simpleDateFormat.parse( inputString1 );
            date2 = simpleDateFormat.parse( inputString2 );
            //wynik w milisekundach zmieniam na dni
            daysBetweenDates = (date1.getTime() - date2.getTime())/(1000*60*60*24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("time " + daysBetweenDates);
    }
}
