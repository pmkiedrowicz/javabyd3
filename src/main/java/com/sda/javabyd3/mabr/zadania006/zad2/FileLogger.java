package com.sda.javabyd3.mabr.zadania006.zad2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        log.debug(message);
    }
}
