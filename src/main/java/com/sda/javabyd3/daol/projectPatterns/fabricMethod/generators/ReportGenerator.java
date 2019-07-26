package com.sda.javabyd3.daol.projectPatterns.fabricMethod.generators;

import com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {
    Report generateReport(ReportData data);
}
