package com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager;

public interface ConfigurationManager {
	Database read();

	void save(Database database);
}
