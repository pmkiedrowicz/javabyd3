//Przygotuj klasę osoba z polami imię, nazwisko, PESEL oraz nadpisz (@override)
//metodę .toString() tak aby wyświetlała dane osoby w formacie "Imie: %s, Nazwisko:
//%s, PESEL: %s". Utwórz instancję klasy osoba, wypełnij przykładowymi danymi oraz
//wyświetl dane osoby korzystając z przygotowanej metody toString().

package com.sda.javabyd3.wowa.exg001.Ogolne.ex04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Ogolne_4_Osoba {
    String imie;
    String nazwisko;
    String pesel;

    @Override
    public String toString() {
        //return "imie: " + this.imie + "nazwisko: " + this.nazwisko + "pesel: " + this.pesel + "";
        return String.format("Imie: %s, Nazwisko: %s, PESEL: %s", imie, nazwisko, pesel);
    }
}



