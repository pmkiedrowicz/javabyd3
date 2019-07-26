package com.sda.javabyd3.lusi.introduction.logger.ex36;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        // Requires change in log4j configuration
//		 <File name="HtmlFile" fileName="logs/all.html" append="false" >
//            <HtmlLayout>
//
//            </HtmlLayout>
//        </File>
        log.info("Application start");
        log.error("My Error");
        log.debug("Debug log");
        log.warn("Warn log");
        log.trace("Trace log");
    }
}
