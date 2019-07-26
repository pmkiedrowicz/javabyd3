package com.sda.javabyd3.toki.designpatterns.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager;

public class DiscConfigurationManagerImpl implements DiscConfigurationManager {
	private Configuration configuration = new Configuration("localhost", "invoice", 9999, "admin", "admin");

	public Configuration read(String filename) {
		return configuration;
	}

	public void save(String filename, Configuration database) {
		configuration = database;
	}
}
