package com.sda.javabyd3.mizi.designPattern.fabricMethod;

import com.sda.javabyd3.mizi.designPattern.fabricMethod.generators.*;
import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.Report;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportData reportData = new ReportData();

        List<ReportGenerator> reportGenerators = Arrays.asList(new OfficialReportGenerator(), new
                DraftReportGenerator(), new ChristmassReportGenerator());

        for (ReportGenerator reportGenerator: reportGenerators){
            Report report = reportGenerator.generateRepor(reportData);
            report.printReport();
        }

    }
}
