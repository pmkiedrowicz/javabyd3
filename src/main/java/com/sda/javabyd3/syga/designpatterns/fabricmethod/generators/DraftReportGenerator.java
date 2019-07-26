package com.sda.javabyd3.syga.designpatterns.fabricmethod.generators;

import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.DraftReport;
import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.Report;

public class DraftReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        return new DraftReport();
    }
}
