package com.rimeh.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimeh.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);

}
