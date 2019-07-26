package com.sda.javabyd3.jaja.exg009.ex05;

import java.util.Arrays;
import java.util.List;

public class ConverterMarks {
    List<String> listOfMarks;

    public ConverterMarks() { }

    public double convertStringToMark(String mark) {
        Calc calc = new Calc();
        double result = 0;

        if (mark.contains("+")) {
            listOfMarks = Arrays.asList(mark.split("\\+"));
            result = calc.sum(Double.parseDouble(listOfMarks.get(0)), Double.parseDouble(listOfMarks.get(1)));
        } else if (mark.contains("-")) {
            listOfMarks = Arrays.asList(mark.split("\\-"));
            result = calc.subtract(Double.parseDouble(listOfMarks.get(0)), Double.parseDouble(listOfMarks.get(1)));
        } else if (mark.contains("*")) {
            listOfMarks = Arrays.asList(mark.split("\\*"));
            result = calc.multiply(Double.parseDouble(listOfMarks.get(0)), Double.parseDouble(listOfMarks.get(1)));
        } else if (mark.contains("/")) {
            listOfMarks = Arrays.asList(mark.split("\\/"));
            result = calc.divide(Double.parseDouble(listOfMarks.get(0)), Double.parseDouble(listOfMarks.get(1)));
        } else if (mark.contains("^")) {
            listOfMarks = Arrays.asList(mark.split("\\^"));
            result = calc.exponentiation(Double.parseDouble(listOfMarks.get(0)), Double.parseDouble(listOfMarks.get(1)));
        }
        return result;
    }
}
