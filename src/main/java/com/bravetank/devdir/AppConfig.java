package com.bravetank.devdir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration  //Enables the app to be autoconfigured
@ComponentScan   //Tells the SpringFramework to scan for components including Controllers needed to run app
public class AppConfig {
    public static void main(String[] args) {
        //Runs this class
        SpringApplication.run(AppConfig.class, args);

    }
}
