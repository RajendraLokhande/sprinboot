package com.UserService.UserService.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserService.UserService.Model.User;
import com.UserService.UserService.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public String saveUser(User user) {
		

	 User user1 = new User();
	 user1.setCreatedBy(user.getName());
	 user1.setCreateDate(new Date());
	 user1.setCreatedBy("Akshay");
	 user1.setUpdateDate(new Date());
	 user1.setUpdatedBy("Akshay");
	 userRepository.save(user);	
		
		return "User Saved Succesfully.";
	}
	
	public String deleteUser(long userId) {
		userRepository.deleteById(userId);	
	return "User Deleted Succesfully.";
		
	}
	
	public String getById(Long userId) {
		
		Optional<User> user = userRepository.findById(userId);
		
		if(user.isPresent()) {
			User user2 = user.get();
			return user2.toString();
		}else {
			
			return "User not found.";
		}
	}
	
	public List<User> getAllUser(){
		
		List<User> findAll = userRepository.findAll();
		
		return findAll;
	} 

}
