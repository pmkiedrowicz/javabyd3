package com.sda.javabyd3.syga.designpatterns.fabricmethod.reports;

public class DraftReport extends Report {
    @Override
    public void printReport() {
        System.out.println("Printing draft report");
    }
}
