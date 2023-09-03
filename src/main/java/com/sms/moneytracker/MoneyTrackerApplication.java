package com.sms.moneytracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.sms.moneytracker.repositories")
//@ComponentScan(basePackages = "com.sms.moneytracker")
public class MoneyTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyTrackerApplication.class, args);
	}

}
