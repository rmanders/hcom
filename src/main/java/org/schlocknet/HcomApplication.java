package org.schlocknet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Application main entry point
 */
@EnableAsync
@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HcomApplication {

    /**
     * Main Entrypoint
     *
     * @param args Arguments passed from the command line
     */
    public static void main (String[] args) {
        // Start the spring boot application
        // TODO: init logging and environment
        SpringApplication.run(HcomApplication.class, args);
    }
}
