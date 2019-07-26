package com.sda.javabyd3.toki.designpatterns.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Configuration {
	private String dbHost;
	private String dbName;
	private Integer port;
	private String login;
	private String password;
}
