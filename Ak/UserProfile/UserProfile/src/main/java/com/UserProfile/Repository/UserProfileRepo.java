package com.UserProfile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserProfile.Model.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, Long>{

	UserProfile findByUserName(String username);
	
}
