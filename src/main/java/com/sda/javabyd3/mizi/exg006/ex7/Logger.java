package com.sda.javabyd3.mizi.exg006.ex7;

/**
 * Created by Michal Ziolecki.
 */
public interface Logger {
    void log(String message);
}
/*
* <?xml version="1.0" encoding="UTF-8"?>
<Configuration>
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <ThresholdFilter level="WARN" onMatch="DENY" onMismatch="ACCEPT"/>
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
        <File name="FileLogger" fileName="logs/FileLogger.log">
            <ThresholdFilter level="INFO" onMatch="DENY" onMismatch="ACCEPT"/>
            <PatternLayout>
                <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
            </PatternLayout>
        </File>

    </Appenders>
    <Loggers>
        <Root level="all">
            <AppenderRef level="info" ref="Console"/>
            <AppenderRef level ="debug" ref="FileLogger"/>
        </Root>

    </Loggers>
</Configuration>
* */