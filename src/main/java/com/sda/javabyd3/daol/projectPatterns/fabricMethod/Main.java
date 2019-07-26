package com.sda.javabyd3.daol.projectPatterns.fabricMethod;

import com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators.ChristmassReportGenerator;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators.DraftReportGenerator;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators.OfficialReportGenerator;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators.ReportData;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators.ReportGenerator;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.Report;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportData reportData = new ReportData();
        List<ReportGenerator> reportGenerators = Arrays.asList(
                new OfficialReportGenerator(),
                new DraftReportGenerator(),
                new ChristmassReportGenerator());

        for (ReportGenerator reportGenerator : reportGenerators) {
            Report report = reportGenerator.generateReport(reportData);
            report.printReport();
        }
    }
}
