package com.sda.javabyd3.kawa.wzorceProj.fabricMethod.generators;

import com.sda.javabyd3.kawa.wzorceProj.fabricMethod.reports.Report;

@FunctionalInterface
public interface ReportGenerator {
    Report generateRepor(ReportData data);
}
