package org.schlocknet.rad.io.config.datasource;

import org.h2.jdbcx.JdbcDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

  /**
   * Local logger instance
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

  @Bean
  public DataSource dataSource() {

    LOGGER.debug("Instantiating datasource...");
    final JdbcDataSource dataSource = new JdbcDataSource();
    dataSource.setURL("jdbc:h2:file:./radIoDB");
    dataSource.setUser("sa");
    dataSource.setPassword(null);
    return dataSource;
  }

}
