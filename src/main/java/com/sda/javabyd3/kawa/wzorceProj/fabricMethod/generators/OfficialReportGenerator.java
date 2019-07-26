package com.sda.javabyd3.kawa.wzorceProj.fabricMethod.generators;

import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.OfficialReport;
import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.Report;

public class OfficialReportGenerator implements ReportGenerator {

    @Override
    public Report generateRepor(ReportData data) {
        // Report generation process
        return new OfficialReport();
    }
}
