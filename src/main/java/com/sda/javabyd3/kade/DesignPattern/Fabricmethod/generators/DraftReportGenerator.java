package com.sda.javabyd3.kade.DesignPattern.Fabricmethod.generators;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.DraftReport;
import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.Report;

public class DraftReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        return new DraftReport();
    }
}
