package com.sda.javabyd3.toki.designpatterns.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager;

public class ConfigurationManagerImpl implements ConfigurationManager {
	private Database configuration = new Database("localhost", "person", 9999, "admin", "admin");


	public Database read() {
		return configuration;
	}

	public void save(Database database) {
		configuration = database;
	}
}
