package com.sda.javabyd3.jaja.exg012.ex02;

import java.util.ArrayList;
import java.util.List;

public class GenericTableToList {

    public <T> void displaysAsList(T[]table){
        List<T> list = new ArrayList<T>();
        for (T element:table) {
            list.add(element);
        }
        System.out.println(list);
    }
}
