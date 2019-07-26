package com.sda.javabyd3.syga.designpatterns.fabricmethod.generators;

import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.OfficialReport;
import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.Report;

public class OfficialReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        //Report genration process
        return new OfficialReport();
    }
}
