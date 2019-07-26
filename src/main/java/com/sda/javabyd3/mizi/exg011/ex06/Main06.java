package com.sda.javabyd3.mizi.exg011.ex06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main06 {
    public static void main(String[] args) {

        IOmethodsOnFiles ioMethodsOnFiles = new IOmethodsOnFiles();
        List<String> listOfLines = new ArrayList <>(  );
        listOfLines = ioMethodsOnFiles.readFromFile();
        TextChecker textChecker = new TextChecker( listOfLines );
        textChecker.CreateStatistics();


    }
}
