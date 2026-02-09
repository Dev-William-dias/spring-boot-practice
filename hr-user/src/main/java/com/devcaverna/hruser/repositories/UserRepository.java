package com.devcaverna.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcaverna.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
