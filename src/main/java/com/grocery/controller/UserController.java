package com.grocery.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.User;
import com.grocery.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userServiceImpl.createUser(user);
		return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userServiceImpl.getAllUser();
		return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id) {
		User user = userServiceImpl.getUserById(id);
		System.out.println(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
		User updatedUser = userServiceImpl.updateUser(id, user);
		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
		userServiceImpl.deleteUser(id);
		return new ResponseEntity<String>(  "User is Deleted from database",HttpStatus.OK);
	}

}
