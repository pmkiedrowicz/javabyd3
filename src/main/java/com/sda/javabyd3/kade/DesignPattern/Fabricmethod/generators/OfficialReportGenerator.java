package com.sda.javabyd3.kade.DesignPattern.Fabricmethod.generators;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.OfficialReport;
import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.Report;

public class OfficialReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {

        // Report generation process
        return new OfficialReport();
    }
}
