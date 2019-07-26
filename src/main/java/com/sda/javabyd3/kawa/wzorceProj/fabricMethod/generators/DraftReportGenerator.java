package com.sda.javabyd3.kawa.wzorceProj.fabricMethod.generators;

import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.DraftReport;
import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.Report;

public class DraftReportGenerator implements ReportGenerator {
    @Override
    public Report generateRepor(ReportData data) {
        // Report generation process
        return new DraftReport();
    }
}
