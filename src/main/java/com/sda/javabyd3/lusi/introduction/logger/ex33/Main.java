package com.sda.javabyd3.lusi.introduction.logger.ex33;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Application start");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        log.info(name);
        log.info("Application end");
    }
}
