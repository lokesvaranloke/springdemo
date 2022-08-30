package com.samples.s09Springmvcorm.service;

import java.util.List;

import com.samples.s09Springmvcorm.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
}
