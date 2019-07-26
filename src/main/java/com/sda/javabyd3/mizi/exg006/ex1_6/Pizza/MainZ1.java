package com.sda.javabyd3.mizi.exg006.ex1_6.Pizza;

import com.sda.javabyd3.mizi.exg006.ex1_6.Dough.AllAmericanThin;
import com.sda.javabyd3.mizi.exg006.ex1_6.Dough.ChessyBites;
import com.sda.javabyd3.mizi.exg006.ex1_6.Dough.Pan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class MainZ1 {
    public static void main(String[] args) {

        List<Pizza> listOfPizza = new ArrayList <>(  );
        listOfPizza.add( new Hawaiian( new AllAmericanThin() ) );
        listOfPizza.add( new Margherita( new ChessyBites() ) );
        listOfPizza.add( new Veggie( new Pan() ) );

        for(Pizza pizza : listOfPizza)
        {
            pizza.preparePizza();
            System.out.println("---------------------------");
        }
    }
}
