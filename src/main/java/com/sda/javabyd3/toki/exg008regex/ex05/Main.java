package com.sda.javabyd3.toki.exg008regex.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj adres www: ");
        String www=scanner.nextLine();

        WWWAddressValidate wwwAddressValidate=new WWWAddressValidate();
        System.out.println(wwwAddressValidate.validate(www));
        scanner.close();

    }
}
