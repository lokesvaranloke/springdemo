package com.samples.s09Springmvcorm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.s09Springmvcorm.dao.UserDao;
import com.samples.s09Springmvcorm.entity.User;
import com.samples.s09Springmvcorm.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		return userDao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userDao.findUsers();
	}
}
