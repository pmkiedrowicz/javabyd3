package com.sda.javabyd3.toki.designpatterns.fabricMethod.reports;

import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.Report;

public class OfficialReport extends Report {
    @Override
    public void printReport() {
        System.out.println("Printing official report");
    }
}
