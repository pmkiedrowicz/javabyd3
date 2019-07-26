package com.sda.javabyd3.urdu.exg009.ex05;
/**
 * Method that convert text for example "2+6" to equation, then using Calculator returns result.
 */
public class Converter {

    public double convertTextToEqu(String text) throws Exception {
        Calculator calc = new Calculator();
        double result=0;

            if(text.contains("+")){

                String[] numbers = text.split("\\+");
                result = calc.sum(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
            }

             else if(text.contains("-")){

            String[] numbers = text.split("\\-");
            result = calc.substract(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
        }

            else if(text.contains("*")){

                String[] numbers = text.split("\\*");
                result = calc.multiply(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
            }

            else if(text.contains("/")){

                String[] numbers = text.split("\\/");
                result = calc.divide(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
            }

            else if(text.contains("^")){

                String[] numbers = text.split("\\^");
                result = calc.pow(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
            }

        return result;
    }
}
