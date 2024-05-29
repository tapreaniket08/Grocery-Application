package com.grocery.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.User;
import com.grocery.repo.UserRepository;
import com.grocery.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> allUser= userRepository.findAll();
		return allUser;
	}

	@Override
	public User getUserById(long id) {
		User user= userRepository.findById(id).get();
		return user;
	}

	@Override
	public User updateUser(long id, User user) {
		user.setId(id);
		User updatedUser=userRepository.save(user);
		return updatedUser;
	}

	@Override
	public void deleteUser(long id) {
		userRepository.deleteById(id);	
	}

}
