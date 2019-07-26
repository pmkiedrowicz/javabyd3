package com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Reports;

import com.sda.javabyd3.kade.DesignPattern.Fabricmethod.Page;

public abstract class Report {

    private String header;
    private String footer;
    private String index;
    private String tableOfContent;
    Page[] pages;
    public abstract void printReport();

}
