package com.sda.javabyd3.mizi.designPatternExcercise.ex02.application.src.main.java.com.sda.java.app;

import com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManager;

public class DbAccess {
	ConfigurationManager configurationManager;

	public DbAccess(ConfigurationManager configurationManager) {
		this.configurationManager = configurationManager;
	}

	public boolean connect() {
		System.out.println("Connecting to " + configurationManager.read().getDbName() + " database.");
		return true;
	}
}
