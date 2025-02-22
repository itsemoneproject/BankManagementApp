package com.bankapp;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.bankapp.Entities.User;
import com.bankapp.repo.UserRepository;


@Configuration
@SpringBootApplication
public class BankManagementAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementAppApplication.class, args);
	}

		
	@Bean
	public ApplicationRunner applicationRunner(UserRepository userRepo) {
		return args -> {
			User u1 = new User((long)1234, "Rahul", "Chanda", "9547288211", "RahulChanda911", "Password1", 1000);
			userRepo.save(u1);
		};
	}
	
}
