package com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators;


import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.DraftReport;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.Report;

public class DraftReportGenerator implements ReportGenerator{


    @Override
    public Report generateReport(ReportData data) {
        return new DraftReport();
    }
}
