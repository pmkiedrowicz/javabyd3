package com.sda.javabyd3.urdu.designPattern.fabricMethod.generators;

import com.sda.javabyd3.urdu.designPattern.fabricMethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {

    Report generateReport(ReportData data);
}
