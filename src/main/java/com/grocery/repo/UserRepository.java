package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
