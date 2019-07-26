package com.sda.javabyd3.mizi.exg006.ex7;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Michal Ziolecki.
 */
@Slf4j
public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        log.debug( message );
    }
}
