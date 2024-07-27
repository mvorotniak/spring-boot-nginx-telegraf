package com.demo.datasaverapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.demo.datasaverapplication.repository.mongo")
@EnableElasticsearchRepositories(basePackages = "com.demo.datasaverapplication.repository.elasticsearch")
@SpringBootApplication
public class DataSaverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSaverApplication.class, args);
    }

}
