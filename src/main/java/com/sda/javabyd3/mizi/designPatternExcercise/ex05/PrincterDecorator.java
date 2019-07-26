package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class PrincterDecorator implements Printer {

    protected Printer printer;

    public PrincterDecorator(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printToFile() {
        this.printer.printToFile( );
    }

    @Override
    public String getPath() {
        return printer.getPath();
    }

    @Override
    public List <Message> getList() {
        return printer.getList();
    }

}
