package com.sda.javabyd3.migr.designpattern.fabricMethod.generators;

import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.OfficialReport;
import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.Report;

public class OfficialReportGenerator implements ReportGenerator {

    @Override
    public Report generateReport(ReportData data) {
        //Report generation process
        return new OfficialReport();
    }
}
