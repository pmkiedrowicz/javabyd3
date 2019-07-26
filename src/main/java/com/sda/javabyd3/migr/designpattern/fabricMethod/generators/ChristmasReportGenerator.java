package com.sda.javabyd3.migr.designpattern.fabricMethod.generators;

import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.ChristmasReport;
import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.Report;

public class ChristmasReportGenerator  implements ReportGenerator {

    @Override
    public Report generateReport(ReportData data) {
        //report generating process
        return new ChristmasReport();
    }
}
