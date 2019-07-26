package com.sda.javabyd3.jaja.zadania_dodatkowe001.exg001.ex05;

import java.awt.*;

public class Main {

    public static void main(String[]agrs){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe();
            }
        });
    }
}



