package com.sda.javabyd3.urdu.designPattern.fabricMethod.generators;

import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.Report;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.OfficialReport;

public class OfficialReportGenerator implements ReportGenerator{

    @Override
    public Report generateReport(ReportData data) {
        //Report generation process

        return new OfficialReport();
    }
}
