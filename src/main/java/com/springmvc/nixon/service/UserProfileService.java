package com.springmvc.nixon.service;

import java.util.List;

import com.springmvc.nixon.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
