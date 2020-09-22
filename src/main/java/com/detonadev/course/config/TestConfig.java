package com.detonadev.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.detonadev.course.entities.Categoria;
import com.detonadev.course.entities.Pedido;
import com.detonadev.course.entities.Produto;
import com.detonadev.course.entities.User;
import com.detonadev.course.entities.enums.StatusPedido;
import com.detonadev.course.repositories.CategoriaRepository;
import com.detonadev.course.repositories.PedidoRepository;
import com.detonadev.course.repositories.ProdutoRepository;
import com.detonadev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Eletrônicos");
		Categoria cat2 = new Categoria(null, "Livros");
		Categoria cat3 = new Categoria(null, "Computadores");
		
		Produto pr1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto pr2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto pr3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto pr4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto pr5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");		
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtoRepository.saveAll(Arrays.asList(pr1, pr2, pr3, pr4, pr5));
		
		pr1.getCategorias().add(cat2);
		pr2.getCategorias().add(cat1);
		pr2.getCategorias().add(cat3);
		pr3.getCategorias().add(cat3);
		pr4.getCategorias().add(cat3);
		pr5.getCategorias().add(cat2);
		
		produtoRepository.saveAll(Arrays.asList(pr1, pr2, pr3, pr4, pr5));
		
		User u1 = new User(null, "Ana Maria", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Alex Vieira", "alex@gmail.com", "97777777", "123456");
		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusPedido.PAGO, u1);
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-22T09:30:18Z"), StatusPedido.AGUARDANDO_PAGAMENTO, u2);
		Pedido p3 = new Pedido(null, Instant.parse("2019-08-25T15:33:25Z"), StatusPedido.ENVIADO, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
	
	

}
