package com.grocery.service;

import java.util.List;

import com.grocery.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User getUserById(long id);

	public User updateUser(long id,User user);
	
	public void deleteUser(long id);
}
