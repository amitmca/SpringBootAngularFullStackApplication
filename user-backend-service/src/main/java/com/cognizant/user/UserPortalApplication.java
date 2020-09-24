package com.cognizant.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class UserPortalApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}
}