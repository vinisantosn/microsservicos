package edu.vinisantosn.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "edu.vinisantosn.vendas.online.repository")
public class MongoConfig {

}
