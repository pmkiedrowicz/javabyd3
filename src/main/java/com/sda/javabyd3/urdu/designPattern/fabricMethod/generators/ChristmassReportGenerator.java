package com.sda.javabyd3.urdu.designPattern.fabricMethod.generators;

import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.ChristmassReport;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.Report;

public class ChristmassReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        //Report generation process
        return new ChristmassReport();
    }
}
