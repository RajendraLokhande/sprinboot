package com.UserProfile.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserProfile.Model.UserProfile;
import com.UserProfile.Repository.UserProfileRepo;


@Service
public class UserProfileService {

	@Autowired
	private UserProfileRepo userProfileRepo;
	
	
	public String saveUser(UserProfile user) {
		

		UserProfile user1 = new UserProfile();
		 user1.setCreatedBy(user.getUserName());
		 user1.setFirstName(user.getFirstName());
		 user1.setLastName(user.getLastName());
		 user1.setEmail(user.getEmail());
		 user1.setCreateDate(new Date());
		 user1.setCreatedBy("Akshay");
		 user1.setUpdateDate(new Date());
		 user1.setUpdatedBy("Akshay");
		 userProfileRepo.save(user);	
			
			return "User Saved Succesfully.";
		}
		
		public String deleteUser(long userId) {
			userProfileRepo.deleteById(userId);	
		return "User Deleted Succesfully.";
			
		}
		
		public String getById(Long userId) {
			
			Optional<UserProfile> user = userProfileRepo.findById(userId);
			
			if(user.isPresent()) {
				UserProfile profile = user.get();
				return profile.toString();
			}else {
				
				return "User not found.";
			}
		}
		
		public List<UserProfile> getAllUser(){
			
			List<UserProfile> findAll = userProfileRepo.findAll();
			
			return findAll;
		} 

}
