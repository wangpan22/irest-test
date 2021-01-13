package com.ibm.ibmi.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@ComponentScan
@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class IRestApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(IRestApplication.class, args);
	}
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(IRestApplication.class);
	}
}

