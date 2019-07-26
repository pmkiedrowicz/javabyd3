package com.sda.javabyd3.toki.exg009general.ex05;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@AllArgsConstructor
@NoArgsConstructor
public class EquationChecker {

    Calculator calculator = new Calculator();
    private boolean isItSum = false;
    private boolean isItSubstract = false;
    private boolean isItMultiply = false;
    private boolean isItDivide = false;
    private boolean isItInvolution = false;
    private double result = 0d;
    List<String> resultList;

    public double checkForEquation(String input) {

        if (input.contains("+") && checkForSum(input) == true) {
            resultList = Arrays.asList(input.split("\\+"));
            result = calculator.sum(Double.parseDouble(resultList.get(0)),
                    Double.parseDouble(resultList.get(1)));
        } else if (input.contains("-") && checkForSubstract(input) == true) {
            resultList = Arrays.asList(input.split("-"));
            result = calculator.substract(Integer.parseInt(resultList.get(0)),
                    Integer.parseInt(resultList.get(1)));
        } else if (input.contains("*") && checkForMultiply(input) == true) {
            resultList = Arrays.asList(input.split("\\*"));
            result = calculator.multiply(Integer.parseInt(resultList.get(0)),
                    Integer.parseInt(resultList.get(1)));
        } else if (input.contains("/") && checkForDivide(input) == true) {
            resultList = Arrays.asList(input.split("/"));
            try {
                result = calculator.divide(Integer.parseInt(resultList.get(0)),
                        Integer.parseInt(resultList.get(1)));
            } catch (ArithmeticException e) {
                System.out.println("U can't divide by zero!");
            }
        } else if (input.contains("^") && checkForInvolution(input) == true) {
            resultList = Arrays.asList(input.split("\\^"));
            result = calculator.involution(Integer.parseInt(resultList.get(0)),
                    Integer.parseInt(resultList.get(1)));
        }
        return result;
    }

    public boolean checkForSum(String input) {
        Pattern patternForSum = Pattern.compile("^\\d{1,}[+]{1}\\d{1,}$");
        isItSum = patternForSum.matcher(input).matches();
        return isItSum;
    }

    public boolean checkForSubstract(String input) {
        Pattern patternForSubstract = Pattern.compile("^\\d{1,}[-]{1}\\d{1,}$");
        isItSubstract = patternForSubstract.matcher(input).matches();
        return isItSubstract;
    }

    public boolean checkForMultiply(String input) {
        Pattern patternForMultiply = Pattern.compile("^\\d{1,}[*]{1}\\d{1,}$");
        isItMultiply = patternForMultiply.matcher(input).matches();
        return isItMultiply;
    }

    public boolean checkForDivide(String input) {
        Pattern patterdForDivide = Pattern.compile("^\\d{1,}[/]{1}\\d{1,}$");
        isItDivide = patterdForDivide.matcher(input).matches();
        return isItDivide;
    }

    public boolean checkForInvolution(String input) {
        Pattern patternForInvolution = Pattern.compile("^\\d{1,}[/^]{1}\\d{1,}$");
        isItInvolution = patternForInvolution.matcher(input).matches();
        return isItInvolution;
    }
}
