package com.sda.javabyd3.mizi.designPatternExcercise.ex02.application.src.main.java.com.sda.java.app;

import com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.ConfigurationManager;
import com.sda.javabyd3.mizi.designPatternExcercise.ex02.ConfigurationManager.src.main.java.com.sda.java.confmanager.Database;
import com.sda.javabyd3.mizi.designPatternExcercise.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager.Configuration;
import com.sda.javabyd3.mizi.designPatternExcercise.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager.DiscConfigurationManager;
import com.sda.javabyd3.mizi.designPatternExcercise.ex02.DiscConfigurationManager.src.main.java.com.sda.java.disc.conf.manager.DiscConfigurationManagerImpl;

/**
 * Created by Michal Ziolecki.
 */
public class DiscConfigurationAdapter implements ConfigurationManager{

    DiscConfigurationManager discConfigurationManager = new DiscConfigurationManagerImpl();

    @Override
    public Database read() {
        Database database = new Database(  );
        Configuration configuration = discConfigurationManager.read("Configuration");
        database.setDbHost( configuration.getDbHost() );
        database.setDbName( configuration.getDbName() );
        database.setLogin( configuration.getLogin() );
        database.setPort( configuration.getPort() );
        database.setPassword( configuration.getPassword() );
        return database;
    }

    @Override
    public void save(Database database) {
        Configuration configuration = new Configuration(  );
        configuration.setDbHost( database.getDbHost() );
        configuration.setDbName( database.getDbName() );
        configuration.setLogin( database.getLogin() );
        configuration.setPassword( database.getPassword() );
        configuration.setPort( database.getPort() );
        discConfigurationManager.save( "configuration", configuration );

    }
}
