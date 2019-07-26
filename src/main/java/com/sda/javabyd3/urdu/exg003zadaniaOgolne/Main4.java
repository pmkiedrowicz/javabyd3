package com.sda.javabyd3.urdu.exg003zadaniaOgolne;


import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        ReplacePolishChar replace = new ReplacePolishChar();
        ChangePolishChar change = new ChangePolishChar();
        ChangePolishCharStringBuilder changeBuilder = new ChangePolishCharStringBuilder();

        Scanner scanText = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = scanText.nextLine();

        System.out.println(replace.toEngCharacters(text));
        System.out.println(change.notPlChar(text));
        System.out.println(changeBuilder.notPlChar(text));

}
}