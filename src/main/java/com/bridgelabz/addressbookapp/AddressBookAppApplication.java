package com.bridgelabz.addressbookapp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) SpringApplication.run(AddressBookAppApplication.class,args);
		log.info("Address Book App Stated in {} Environment",((ConfigurableApplicationContext) context).getEnvironment().getProperty("environment"));
	}

}
