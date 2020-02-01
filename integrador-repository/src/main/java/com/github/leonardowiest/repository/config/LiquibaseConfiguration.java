package com.github.leonardowiest.repository.config;

import org.springframework.context.annotation.Bean;

import liquibase.integration.spring.SpringLiquibase;

public class LiquibaseConfiguration {

	@Bean
	public SpringLiquibase initLiquibase() {

		SpringLiquibase liquibase = new SpringLiquibase();

		return liquibase;
	}

}
