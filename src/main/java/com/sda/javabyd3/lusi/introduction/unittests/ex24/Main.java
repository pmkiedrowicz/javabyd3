package com.sda.javabyd3.lusi.introduction.unittests.ex24;

import com.sda.javabyd3.lusi.introduction.Utils;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String height = Utils.displayTextAndGetValue("Podaj wzrost (m): ", false);
        String weight = Utils.displayTextAndGetValue("Podaj wagę (kg): ", false);
        BmiCalculator bmiCalculator = new BmiCalculator();
        float bmi = bmiCalculator.calculate(Float.parseFloat(weight), Float.parseFloat(height));
        displayTextOnConsole(String.format("Twoje BMI wynosi: %s", bmi));
    }
}
