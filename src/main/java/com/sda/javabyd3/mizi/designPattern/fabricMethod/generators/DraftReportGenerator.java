package com.sda.javabyd3.mizi.designPattern.fabricMethod.generators;

import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.DraftReport;
import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.Report;

public class DraftReportGenerator implements ReportGenerator {
    @Override
    public Report generateRepor(ReportData data) {
        // Report generation process
        return new DraftReport();
    }
}
