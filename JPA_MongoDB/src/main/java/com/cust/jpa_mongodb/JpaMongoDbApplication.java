package com.cust.jpa_mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JpaMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaMongoDbApplication.class, args);
    }

}
