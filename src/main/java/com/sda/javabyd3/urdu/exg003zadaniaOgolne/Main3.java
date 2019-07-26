package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanText = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String text = scanText.nextLine();
        ReverseText met3 = new ReverseText();
       // met3.reverseText(text);
        System.out.println(met3.reverseText(text));

    }
}
