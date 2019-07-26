package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;

/**
 * Created by Michal Ziolecki.
 */
public class HTMLprinterToFile extends PrincterDecorator{

    private ObjectMapper mapper;

    public HTMLprinterToFile(Printer printer){
        super(printer);
        this.mapper = new ObjectMapper();
    }
    @Override
    public void printToFile() {
        try {
            mapper.writeValue( new File( printer.getPath()+"JsonNew.html"), printer.getList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPath(){
        return printer.getPath();
    }

}
