package com.sda.javabyd3.jaja.designePattern.fabricMethod;

import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.ChristmassReportGenerator;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.DraftReportGenerator;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.OfficialReportGenerator;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.ReportData;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.ReportGenerator;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.Report;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReportData reportData = new ReportData();

        List<ReportGenerator> reportGenerators = Arrays.asList(
                new OfficialReportGenerator()
                , new DraftReportGenerator()
                , new ChristmassReportGenerator()
        );

        for(ReportGenerator reportGenerator: reportGenerators){
           Report report = reportGenerator.generateReport(reportData);
           report.printReport();
        }

    }
}
