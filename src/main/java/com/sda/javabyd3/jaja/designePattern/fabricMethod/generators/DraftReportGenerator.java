package com.sda.javabyd3.jaja.designePattern.fabricMethod.generators;

import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.ReportData;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.generators.ReportGenerator;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.Report;
import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.DraftReport;

public class DraftReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ReportData data) {
        //Report generation process
        return new DraftReport();
    }
}
