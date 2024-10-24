package com.UserProfile.Controller;

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

import com.UserProfile.Model.UserProfile;
import com.UserProfile.Service.UserProfileService;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody UserProfile user){
		
		String saveUser = userProfileService.saveUser(user);
		return new ResponseEntity<String>(saveUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<String> saveUser(@PathVariable Long userId){
		
		String byId = userProfileService.getById(userId);
		return new ResponseEntity<String>(byId, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteUser(@PathVariable Long userId){
		
		String byId = userProfileService.getById(userId);
		return new ResponseEntity<String>(byId, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserProfile>> getAllUser(){
		
		List<UserProfile> allUser = userProfileService.getAllUser();
		return new ResponseEntity<>(allUser, HttpStatus.OK);
	}
	
}
