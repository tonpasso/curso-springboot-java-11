package com.detonadev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detonadev.course.entities.Usuario;

@RestController
@RequestMapping(value = "/user")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Well", "well@gmail.com", "988887777", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
