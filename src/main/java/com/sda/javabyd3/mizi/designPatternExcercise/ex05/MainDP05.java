package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class MainDP05 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(  );
        Message message = new Message( "Odbiorca", "wysylajacy",
                "temat","tag","text",  localDateTime );
        List<Message> list = new ArrayList <>(  );
        list.add( message );
        Printer clasicPrinterToFile = new ClasicPrinterToFile(list);
        clasicPrinterToFile.printToFile(  );
        JSONprinterToFile jsonPrinterToFile = new JSONprinterToFile( clasicPrinterToFile );
        jsonPrinterToFile.printToFile( );
        HTMLprinterToFile htmlPrinterToFile = new HTMLprinterToFile( clasicPrinterToFile );
        htmlPrinterToFile.printToFile();

    }
}
