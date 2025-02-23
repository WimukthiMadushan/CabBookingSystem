package com.cabbooking.cab_booking_system;

import com.cabbooking.cab_booking_system.Config.MongoDBConnection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CabBookingSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(CabBookingSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			MongoDBConnection.getInstance();
			System.out.println("MongoDB connection established!");
		};
	}

}
