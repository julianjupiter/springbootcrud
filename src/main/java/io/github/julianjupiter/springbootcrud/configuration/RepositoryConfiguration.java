package io.github.julianjupiter.springbootcrud.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"io.github.julianjupiter.springbootcrud.domain"})
@EnableJpaRepositories(basePackages = {"io.github.julianjupiter.springbootcrud.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
