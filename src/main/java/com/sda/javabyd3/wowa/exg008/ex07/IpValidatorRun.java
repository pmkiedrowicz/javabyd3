//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres IP
//jest poprawny.
//public boolean validate(String address);
//Poprawny adres IP: 192.168.1.10, 10.10.48.1
//Błędny adres IP: 192.168.256.20, 192.168.2,

package com.sda.javabyd3.wowa.exg008.ex07;

import java.util.Scanner;

public class IpValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide IPv4 address: ");
        String usersIP = sc.nextLine();

        IpValidator iv = new IpValidator();
        boolean correctIP = iv.validate(usersIP);

        if (correctIP) {
            System.out.println("correct IP");
        } else {
            System.out.println("incorrect IP");
        }
        sc.close();
    }
}
