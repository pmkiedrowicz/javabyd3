package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Palindron pali = new Palindron();
        Scanner scanText = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = scanText.nextLine();

        System.out.println(pali.isPalindron(text)?"Wprowawdzony tekst '" +text+"' jest palindromem":
                "Wprowadzony tekst "+ text+" nie jest palindormem");
    }
}
