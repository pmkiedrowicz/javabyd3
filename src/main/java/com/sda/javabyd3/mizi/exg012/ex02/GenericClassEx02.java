package com.sda.javabyd3.mizi.exg012.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class GenericClassEx02 {

    public <T> List<T> genericMethodReturningTheList(T[] table){
        List <T> returningList = new ArrayList <>(  );
        //returningList = Arrays.asList( table );
        for(int i = 0; i < table.length; i++ )
        {
            returningList.add( table[i] );
        }

        return  returningList;
    }
}
