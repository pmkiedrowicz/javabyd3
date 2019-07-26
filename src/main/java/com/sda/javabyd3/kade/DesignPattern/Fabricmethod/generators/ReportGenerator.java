package com.sda.javabyd3.kade.DesignPattern.Fabricmethod.generators;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.Report;

@FunctionalInterface
public interface ReportGenerator {

    Report generateReport(ReportData data);

}
