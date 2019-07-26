package com.sda.javabyd3.jaja.zadania_dodatkowe001.exg001.ex05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    int counter = 0;

    public TicTacToe() {
        setSize(400, 400);
        setVisible(true);
        setTitle("Kółko i krzyżyk");
        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("");
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (counter % 2 == 0) {
                        button.setText("O");
                        System.out.println("O");
                    } else {
                        button.setText("X");
                        System.out.println("X");
                    }
                    button.setEnabled(false);
                    counter++;
                }
            });
        }
    }
}

