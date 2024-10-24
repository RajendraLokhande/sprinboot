package com.UserService.UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserService.UserService.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//User findByUserName(String userName);
}
