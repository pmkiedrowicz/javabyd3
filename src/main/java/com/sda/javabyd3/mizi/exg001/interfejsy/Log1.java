package com.sda.javabyd3.mizi.exg001.interfejsy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
@Slf4j
public class Log1 implements InterfaceTologin{
    @Override
    public void inputName() {
        Scanner scanner = new Scanner( System.in );
        String inPut;
        log.info( "Podaj swoje imie" );
        inPut = scanner.nextLine();
        log.info( "Podano imie <" + inPut + "> "  );
    }
    // elementy w resources XML
    /*<Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
      </Appenders>*/
}
