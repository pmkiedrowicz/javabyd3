package com.sda.javabyd3.kawa.exg012.ex03;

public class Main {
    public static void main(String[] args) {

        GenericListT genericListT = new GenericListT();
        genericListT.addToMyGenericListT("grog");
        genericListT.addToMyGenericListT(40);
        genericListT.addToMyGenericListT('E');
        genericListT.addToMyGenericListT("kkkkk");

        System.out.println(genericListT.getMyGenericListT());
        System.out.println(genericListT.getObjectFromMyList(3));
    }
}
