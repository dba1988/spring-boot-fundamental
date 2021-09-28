package com.springbootfundamentals;

import com.springbootfundamentals.entity.Application;
import com.springbootfundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;


@SpringBootApplication
public class SpringBootFundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootFundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFundamentalsApplication.class, args);
		System.out.println("hello");
	}
//	@Bean
//	public DataSourceInitializer dataSourceInitializer(@Qualifier("dataSource") final DataSource dataSource) {
//		ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//		resourceDatabasePopulator.addScript(new ClassPathResource("/data.sql"));
//		DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//		dataSourceInitializer.setDataSource(dataSource);
//		dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//		return dataSourceInitializer;
//	}
//	@Bean
//	public CommandLineRunner demo(ApplicationRepository repository) {
//		return (args) -> {
//			repository.save(new Application("Trackzilla","kesha.williams","Application for tracking bugs."));
//			repository.save(new Application("Expenses","mary.jones","Application to track expense reports."));
//			repository.save(new Application("Notifications","karen.kane","Application to send alerts and notifications to users."));
//
//			for (Application application : repository.findAll()) {
//				log.info("The application is: " + application.toString());
//			}
//		};
//	}

}
