package com.detonadev.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.detonadev.course.entities.Pedido;
import com.detonadev.course.entities.User;
import com.detonadev.course.repositories.PedidoRepository;
import com.detonadev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Ana Maria", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Alex Vieira", "alex@gmail.com", "97777777", "123456");
		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-22T09:30:18Z"), u2);
		Pedido p3 = new Pedido(null, Instant.parse("2019-08-25T15:33:25Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
	
	

}
