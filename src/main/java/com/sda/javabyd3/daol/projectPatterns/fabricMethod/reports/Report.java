package com.sda.javabyd3.daol.projectPatterns.fabricMethod.reports;

import com.sda.javabyd3.daol.projectPatterns.fabricMethod.Page;

public abstract class Report {
    private String header;
    private String footer;
    private String index;
    private String tableOfContent;
    Page[] pages;
    public abstract void printReport();
}
