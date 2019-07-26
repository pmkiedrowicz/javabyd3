package com.sda.javabyd3.toki.designpatterns.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager;

public interface DiscConfigurationManager {

	Configuration read(String filename);

	void save(String filename, Configuration database);
}
