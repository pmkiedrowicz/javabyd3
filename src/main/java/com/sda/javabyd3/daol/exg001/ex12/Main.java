package com.sda.javabyd3.daol.exg001.ex12;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j

public class Main {


    public static void main(String[] args) {
        System.out.println("Proszę podać imię: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        log.info("podano imię: " + "<" + name + ">");
    }
}
