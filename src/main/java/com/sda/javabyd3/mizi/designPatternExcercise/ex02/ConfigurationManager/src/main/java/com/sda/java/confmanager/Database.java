
package com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Database {
	private String dbHost;
	private String dbName;
	private Integer port;
	private String login;
	private String password;
}
