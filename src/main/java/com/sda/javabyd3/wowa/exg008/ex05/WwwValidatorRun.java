//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres www
//jest poprawny public boolean validate(String www);
//Poprawny adres www to: www.wp.pl
//Błędny adres www to: http://, http://-error-.invalid/, http://foo.bar/foo(bar)baz quux,
//http:///www.wp.pl

package com.sda.javabyd3.wowa.exg008.ex05;

import java.util.Scanner;

public class WwwValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide www address (valid format - www.onet.pl): ");
        String usersAddress = sc.nextLine();

        WwwValidator www = new WwwValidator();
        boolean validAddress = www.validate(usersAddress);

        if (validAddress) {
            System.out.println("www address is valid");
        } else {
            System.out.println("www address invalid");
        }
        sc.close();
    }
}
