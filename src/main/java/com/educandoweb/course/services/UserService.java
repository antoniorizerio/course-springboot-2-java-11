package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

// Camada de Serviço //
@Service // Reconhece minha classe como um serviço do Spring podendo ser instanciado automaticamente com autowired //
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> opt = repository.findById(id);
		return opt.get();
	}
}
