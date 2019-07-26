package com.sda.javabyd3.toki.designpatterns.ex02.application.src.main.java.com.sda.java.app;

import com.sda.javabyd3.toki.designpatterns.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManager;
import com.sda.javabyd3.toki.designpatterns.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManagerImpl;

public class Main {
	public static void main(String[] args) {
		System.out.print("Application starting");
		ConfigurationManager configurationManager = new ConfigurationManagerImpl();
		DbAccess dbAccess = new DbAccess(configurationManager);
		dbAccess.connect();
	}
}
