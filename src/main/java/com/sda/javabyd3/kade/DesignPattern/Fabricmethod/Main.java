package com.sda.javabyd3.kade.DesignPattern.Fabricmethod;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports.Report;
import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.generators.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReportData reportData = new ReportData();

        List<ReportGenerator> reportGenerators = Arrays.asList(
                  new OfficialReportGenerator(),
                  new DraftReportGenerator(),
                  new ChristmassReportGenerator());


        // reportGenerators.add(new OfficialReportGenerator());
        // reportGenerators.add(new DraftReportGenerator());
        //

                  for(ReportGenerator reportGenerator: reportGenerators){

                      Report report = reportGenerator.generateReport(reportData);
                      report.printReport();
                  }


    }
}
