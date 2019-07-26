package com.sda.javabyd3.lusi.introduction.logger.ex35;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerExample {
	public static void main(String[] args) {
		log.info("Application start");
		log.error("My Error");
		log.debug("Debug log");
		log.warn("Warn log");
		log.trace("Trace log");
	}
}
