package com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators;


import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.ChristmassReport;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.Report;

public class ChristmassReportGenerator implements ReportGenerator{

    @Override
    public Report generateReport(ReportData data) {
        // report generation process
        return new ChristmassReport();
    }
}
