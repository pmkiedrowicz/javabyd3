package com.sda.javabyd3.kawa.wzorceProj.fabricMethod.generators;

import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.ChristmassReport;
import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.Report;

public class ChristmassReportGenerator implements ReportGenerator {
    @Override
    public Report generateRepor(ReportData data) {
        // Report generation process
        return new ChristmassReport();
    }
}
