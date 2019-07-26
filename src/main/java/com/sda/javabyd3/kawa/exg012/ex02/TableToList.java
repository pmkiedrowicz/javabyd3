package com.sda.javabyd3.kawa.exg012.ex02;

import java.util.ArrayList;
import java.util.List;

public class TableToList<E> {
    public List<E> addingFromTableToList(E[] arg) {
        List<E> listToReturn = new ArrayList<E>() {{
            for (int i = 0; i < arg.length; i++) {
                add(arg[i]);
            }
        }};
        return listToReturn;
    }

}
