package com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators;

import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.OfficalReport;
import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.Report;

public class OfficialReportGenerator implements ReportGenerator{


    @Override
    public Report generateReport(ReportData data) {
        // report generation process
        return new OfficalReport();
    }
}
