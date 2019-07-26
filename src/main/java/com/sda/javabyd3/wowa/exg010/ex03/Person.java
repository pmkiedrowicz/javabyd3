//Utwórz klasę sortującą osoby na podstawie środków zgromadzonych na kontach.
//Metodę sortującą umieść w osobnej klasie, tak aby można było łatwo wykonać testy
//jednostkowe. Wykonaj zadanie zgodnie z poniższymi punktami.
//Utwórz klasę Person zawierającą pola:
//i. name typu String
//ii. lastName typu String
//iii. accounts typu List<BankAccount>

package com.sda.javabyd3.wowa.exg010.ex03;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class Person {
    String name;
    String lastname;
    List<BankAccount> accounts;
}
