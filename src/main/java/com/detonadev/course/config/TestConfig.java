package com.detonadev.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.detonadev.course.entities.User;
import com.detonadev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Ana Maria", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Alex Vieira", "alex@gmail.com", "97777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
