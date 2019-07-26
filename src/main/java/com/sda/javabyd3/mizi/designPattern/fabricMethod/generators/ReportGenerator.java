package com.sda.javabyd3.mizi.designPattern.fabricMethod.generators;

import com.sda.javabyd3.mizi.designPattern.fabricMethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {
    Report generateRepor(ReportData data);
}
