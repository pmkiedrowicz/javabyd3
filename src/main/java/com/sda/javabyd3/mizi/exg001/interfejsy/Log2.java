package com.sda.javabyd3.mizi.exg001.interfejsy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
@Slf4j
public class Log2 implements InterfaceTologin {
    @Override
    public void inputName() {
        Scanner scanner = new Scanner( System.in );
        String inPut;
        log.info( "Podaj swoje imie" );
        inPut = scanner.nextLine();
        log.info( "Podano imie <" + inPut + "> "  );
    }
    // elementy z pliku XML w resources
    /*<Appenders>
    <File name="interfejsLog" fileName="logs/interfejsLog.log">
            <ThresholdFilter level="WARN" onMatch="DENY" onMismatch="ACCEPT"/>
            <PatternLayout>
                <pattern>%d{ISO8601} [%t] %p %c{3} - %m%n</pattern>
            </PatternLayout>
      </File>
      </Appenders>*/
}
