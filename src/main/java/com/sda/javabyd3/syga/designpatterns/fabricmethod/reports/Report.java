package com.sda.javabyd3.syga.designpatterns.fabricmethod.reports;

import com.sda.javabyd3.syga.designpatterns.fabricmethod.Page;

public abstract class Report {
    private String header;
    private String footer;
    private String index;
    private String tableOfContent;
    Page[] pages;
    public abstract void printReport();
}
