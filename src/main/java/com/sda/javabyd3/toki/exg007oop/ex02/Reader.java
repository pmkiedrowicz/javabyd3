package com.sda.javabyd3.toki.exg007oop.ex02;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

    public Reader() {
    }
    private int tempNum = 0;
    private String tempString = "";
    private String stop = "c";

    public List<Integer> getNumbersFromUser(List<Integer> list) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^-?\\d+$");
        Matcher tempNumChecker;

        while (!tempString.equals(stop)) {
            System.out.print("Type a integer, or char 'c' to break this: ");
            tempString = scanner.next();
            tempNumChecker = pattern.matcher(tempString);
            if (tempNumChecker.matches()) {
                //next lines pretends error when outrange int value
                try {
                    tempNum = Integer.parseInt(tempString);
                } catch (IndexOutOfBoundsException e) {
                    e.getStackTrace();
                    System.out.println("It's out of integers value, type a number in range of -2,147,483,648 to 2,147,483,647: ");
                }catch (NumberFormatException e){
                    e.getStackTrace();
                    System.out.println("It's out of integers value, type a number in range of -2,147,483,648 to 2,147,483,647: ");

                }
                list.add(tempNum);
            } else if (tempString.equals(stop)) {
                scanner.close();
                break;
            } else if (tempNumChecker.matches() == false) {
                System.out.println("Invalid number... ");
            }
        }
        scanner.close();
            System.out.println("Numbers were added to list.");
        return list;
    }
}
