//Zaimplementuj metodę preparePizzaDough() w każdej klasie. Niech ta metoda
//wyświetla tekst na konsoli “Przygotowywanie ciasta <nazwa_ciasta>”

package com.sda.javabyd3.wowa.exg006.ex01toex06.PizzaDough;

public class GlutenFree implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Preparing GlutenFree dough");
    }
}
