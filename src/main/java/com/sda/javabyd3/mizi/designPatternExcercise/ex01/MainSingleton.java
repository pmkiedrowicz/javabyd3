package com.sda.javabyd3.mizi.designPatternExcercise.ex01;

import java.io.IOException;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class MainSingleton {
    public static void main(String[] args) {
        MiziLogger miziLogger = MiziLogger.getMiziLogger();
        String message = "Testing log";
        try {
            miziLogger.printToFile( message );
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list =  miziLogger.readFromFile();
        for(String item: list){
            System.out.println(item);
        }
    }
}
