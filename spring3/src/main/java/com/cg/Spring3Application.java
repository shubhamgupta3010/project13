package com.cg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.entities.Application;
import com.cg.repositories.ApplicationRepository;


@SpringBootApplication
public class Spring3Application {
	
	private static final Logger log = LoggerFactory.getLogger(Spring3Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Spring3Application.class, args);
		System.out.println("hello");
	}
	
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Hotstar","shubham","movies"));
			repository.save(new Application("Pubg","saurabh","games"));
			repository.save(new Application("Thop tv","kasim","sports"));
			
			for(Application application : repository.findAll()) {
				log.info("Application is = "+application.toString());
			}
		};
	}	
	
}
