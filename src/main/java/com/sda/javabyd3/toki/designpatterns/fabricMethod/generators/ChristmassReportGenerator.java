package com.sda.javabyd3.toki.designpatterns.fabricMethod.generators;

import com.sda.javabyd3.mizi.designPattern.fabricMethod.generators.ReportData;
import com.sda.javabyd3.mizi.designPattern.fabricMethod.generators.ReportGenerator;
import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.ChristmassReport;
import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.Report;

public class ChristmassReportGenerator implements ReportGenerator {
    @Override
    public Report generateRepor(ReportData data) {
        // Report generation process
        return new ChristmassReport();
    }
}
