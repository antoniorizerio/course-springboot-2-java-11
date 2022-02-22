package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.educandoweb.course.entities.User;

@RestController // Recurso WEB que é implementado por um Controlador REST //
@RequestMapping(value = "/users") 
public class UserResource {
	
	// ENDPOINT para acessar os usuários //
	@GetMapping   // Responde requisição do tipo GET do HTTP //
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "992512006", "kaka22");
		//ResponseEntity.ok() - para retornar uma resposta com SUCESSO; //
		//ResponseEntity.ok().body() - Adiciona no corpo da mensagem o objeto que acabei de criar USER //
		return ResponseEntity.ok().body(u);
	}
}