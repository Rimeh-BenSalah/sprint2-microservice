package com.rimeh.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimeh.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
