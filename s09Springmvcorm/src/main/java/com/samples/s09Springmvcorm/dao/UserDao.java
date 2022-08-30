package com.samples.s09Springmvcorm.dao;

import java.util.List;

import com.samples.s09Springmvcorm.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
}
