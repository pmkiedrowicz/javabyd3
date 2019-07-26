package com.sda.javabyd3.mizi.exg013.ex04;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //System.out.println("Podaj haslo:");
        //String password =  scanner.nextLine();
        String testPassword = "A12cc*11D2";
        System.out.println(checkPassword( testPassword ));
    }

    public static boolean checkPassword(String password){
        boolean test = Optional.of( password )
                .filter( element -> element.matches(
                        "(?=^.{6,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&amp;*()_+}{&quot;:;'?/&gt;.&lt;,])" +
                                "(?!.*\\s).*$" ) )
                .isPresent();

        return test;
    }
}
/*boolean test = Optional.of( password )
                .filter( element -> element.matches(
                        "(?=^.{6,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&amp;*()_+}{&quot;:;'?/&gt;.&lt;,])" +
                                "(?!.*\\s).*$" ) )
                .isPresent();*/