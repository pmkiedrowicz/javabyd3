package com.sda.javabyd3.syga.designpatterns.fabricmethod.generators;

import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.ChristmassReport;
import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.Report;

public class ChristmassReportGenerator implements ReportGenerator {

    @Override
    public Report generateReport(ReportData data) {
        //report generation process
        return new ChristmassReport();
    }
}
