package com.sda.javabyd3.toki.designpatterns.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager;

public interface ConfigurationManager {
	Database read();

	void save(Database database);
}
