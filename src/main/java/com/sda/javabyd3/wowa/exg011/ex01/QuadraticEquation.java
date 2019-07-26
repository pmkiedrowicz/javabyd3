//Przygotuj algorytm rozwiązujący każde zadanie w osobnej klasie (zgodnie z metodyką
//S.O.L.I.D) i wywołaj odpowiednią metodę z tej klasy z metody main w celu prezentacji jego
//działania. Napisz testy jednostkowe weryfikujące działanie klasy.
//Przygotuj aplikację obliczającą pierwiastki równania kwadratowego ax2+bx+c=0.
//Dane wejściowe: parametry a,b,c. Dane wyjściowe x1 i x2

package com.sda.javabyd3.wowa.exg011.ex01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getDelta() {
        return (Math.pow(b, 2) - 4.0 * a * c);
    }

    public double getAnswer1() {
        return ((-b + Math.sqrt(getDelta())) / (2.0 * a));
    }

    public double getAnswer2() {
        return ((-b - Math.sqrt(getDelta())) / (2.0 * a));
    }
}
