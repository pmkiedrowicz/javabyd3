package com.sda.javabyd3.kade.DesignPattern.Fabricmethod.generators;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.ChristmassReport;
import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.DraftReport;
import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.Report;

public class ChristmassReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        // Report generatio process
        return new ChristmassReport();
    }
}
