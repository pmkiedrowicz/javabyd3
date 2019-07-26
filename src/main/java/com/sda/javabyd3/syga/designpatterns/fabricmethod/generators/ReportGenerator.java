package com.sda.javabyd3.syga.designpatterns.fabricmethod.generators;

import com.sda.javabyd3.syga.designpatterns.fabricmethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {
    Report generateReport(ReportData data);
}
