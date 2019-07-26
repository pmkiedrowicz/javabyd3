package com.sda.javabyd3.urdu.exg006interface.exPizza.pizza;

import com.sda.javabyd3.urdu.exg006interface.exPizza.dough.AllAmericanThin;
import com.sda.javabyd3.urdu.exg006interface.exPizza.dough.GlutenFree;
import com.sda.javabyd3.urdu.exg006interface.exPizza.dough.Pan;


import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Pizza> listOfPizza = new ArrayList<>();
        listOfPizza.add(new Margherita(new AllAmericanThin()));
        listOfPizza.add(new Hawaiian(new Pan()));
        listOfPizza.add(new Veggie(new GlutenFree()));
        ListForMargherita listForMargherita = new ListForMargherita();

        Margherita margheritaMoja = new Margherita(listForMargherita.getList(), new AllAmericanThin());

        for(int i=0; i<listOfPizza.size();i++){
            System.out.println("Pizza nr: "+ (i+1));
            listOfPizza.get(i).preparePizza();
        }
    }
}
