package com.sda.javabyd3.urdu.exg006interface.exPizza.pizza;

import java.util.ArrayList;
import java.util.List;

public class ListForMargherita {

    List<String> list = new ArrayList<>();

    public ListForMargherita() {
        list.add("ser");
        list.add("pieczarki");
        list.add("czosnek");
        list.add("papryka");
    }

    public List<String> getList(){

        return list;
    }
}
