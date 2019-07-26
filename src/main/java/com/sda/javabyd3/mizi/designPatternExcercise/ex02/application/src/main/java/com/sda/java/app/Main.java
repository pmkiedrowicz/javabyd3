package com.sda.javabyd3.mizi.designPatternExcercise.ex02.application.src.main.java.com.sda.java.app;

import com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManager;
import com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManagerImpl;

public class Main {
	public static void main(String[] args) {
		System.out.print("Application starting \n");
		ConfigurationManager configurationManager = new ConfigurationManagerImpl();
		DbAccess dbAccess = new DbAccess(configurationManager);
		ConfigurationManager discConfigurationAdapter = new DiscConfigurationAdapter();
		DbAccess dbAccess2 = new DbAccess( discConfigurationAdapter );
		dbAccess.connect();
		dbAccess2.connect();
	}
}
