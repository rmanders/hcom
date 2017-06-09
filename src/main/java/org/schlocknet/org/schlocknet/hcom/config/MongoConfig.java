package org.schlocknet.org.schlocknet.hcom.config;

import com.mongodb.Mongo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

@Data
@Configuration
public class MongoConfig {

    @Autowired
    private Environment env;

    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean factory = new MongoClientFactoryBean();
        factory.setHost(env.getProperty("data.mongo.host","localhost"));
        factory.setPort(Integer.parseInt(env.getProperty("data.mongo.port", "27017")));
        return factory;
    }

    @Bean
    public MongoTemplate mongoTemplate(Mongo mongo) {
        return new MongoTemplate(mongo, "hcom");
    }
}
