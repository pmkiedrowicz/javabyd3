package com.sda.javabyd3.migr.designpattern.fabricMethod.generators;

import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.DraftReport;
import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.Report;

public class DraftReportGenerator implements ReportGenerator {

    @Override
    public Report generateReport(ReportData data) {
        return new DraftReport();
    }
}
