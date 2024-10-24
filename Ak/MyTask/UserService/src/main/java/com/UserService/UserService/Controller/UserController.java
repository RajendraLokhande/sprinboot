package com.UserService.UserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserService.UserService.Model.User;
import com.UserService.UserService.Service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		
		String saveUser = userService.saveUser(user);
		return new ResponseEntity<String>(saveUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<String> getUser(@PathVariable Long userId){
		
		String byId = userService.getById(userId);
		return new ResponseEntity<String>(byId, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteUser(@PathVariable Long userId){
		
		String byId = userService.getById(userId);
		return new ResponseEntity<String>(byId, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = userService.getAllUser();
		return new ResponseEntity<>(allUser, HttpStatus.OK);
	}
}
