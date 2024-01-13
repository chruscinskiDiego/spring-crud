package com.diegochruscinski.spring_project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegochruscinski.spring_project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Diego", "contato@diegochruscinski.com.br", "423635-2630", "1234");
		
		return ResponseEntity.ok().body(u);
	}
}
