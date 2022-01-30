package com.spring.boot.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.spring.boot.userdept.repositories.UserRepository;
import com.spring.boot.userdept.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}
	@GetMapping(value = "/{id}")
	public User findAll(@PathVariable long id) {
		return repository.findById(id).get();
	}
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);

	}
}
