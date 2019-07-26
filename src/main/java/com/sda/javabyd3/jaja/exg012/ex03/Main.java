package com.sda.javabyd3.jaja.exg012.ex03;

public class Main {

    public static void main(String[] args) {
        GenericClass generiscClass = new GenericClass();
        generiscClass.addElement(2);
        generiscClass.addElement("xyz");
        generiscClass.addElement(5);
        generiscClass.addElement("abc");
        generiscClass.addElement("def");
        System.out.println("Elementy listy: ");
        for (Object el : generiscClass.getList()) {
            System.out.println(el);
        }
        System.out.println("Indeks 1: " + generiscClass.getElement(1));

    }
}
