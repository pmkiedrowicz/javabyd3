//Utwórz klasę sortującą osoby na podstawie środków zgromadzonych na kontach.
//Metodę sortującą umieść w osobnej klasie, tak aby można było łatwo wykonać testy
//jednostkowe. Wykonaj zadanie zgodnie z poniższymi punktami.
//a. Utwórz klasę BankAccount zawierającą pola:
//i. name typu String
//ii. balance typu Double

package com.sda.javabyd3.wowa.exg010.ex03;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class BankAccount {
    String name;
    Double balance;
}
