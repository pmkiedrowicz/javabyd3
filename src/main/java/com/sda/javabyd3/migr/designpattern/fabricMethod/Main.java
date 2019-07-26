package com.sda.javabyd3.migr.designpattern.fabricMethod;

import com.sda.javabyd3.migr.designpattern.fabricMethod.generators.*;
import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.Report;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReportData reportData = new ReportData();

        List<ReportGenerator> reportGenerators = Arrays.asList (
                new OfficialReportGenerator(),
                new DraftReportGenerator(),
                new ChristmasReportGenerator());

        for (ReportGenerator reportGenerator: reportGenerators) {
            Report report = reportGenerator.generateReport(reportData);
            report.printReport();
        }
    }
}
