package com.sda.javabyd3.migr.designpattern.fabricMethod.generators;

import com.sda.javabyd3.migr.designpattern.fabricMethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {
    Report generateReport(ReportData data);
}
