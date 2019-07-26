package com.sda.javabyd3.toki.exg006interface.ex02;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {

        log.info("Added name: "+message);

    }
}
