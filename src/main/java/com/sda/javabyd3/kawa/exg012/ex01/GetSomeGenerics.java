package com.sda.javabyd3.kawa.exg012.ex01;

public class GetSomeGenerics<E> {
    public void gettingSomeGenerics(E[] arg) {
        for (int i = 0; i < arg.length; i++) {
            if (i == arg.length - 1) {
                System.out.println(arg[i] + " ");
            } else {
                System.out.print(arg[i] + " , ");
            }
        }

    }
}
