package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import com.sda.javabyd3.mizi.exg009.ex03.PersonalData;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class JSONprinterToFile extends PrincterDecorator{

    private ObjectMapper mapper;

    public JSONprinterToFile(Printer printer){
        super(printer);
        this.mapper = new ObjectMapper();
    }
    @Override
    public void printToFile() {
        try {
            mapper.writeValue( new File( printer.getPath()+"JsonNew.json"), printer.getList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPath(){
       return printer.getPath();
    }

}
