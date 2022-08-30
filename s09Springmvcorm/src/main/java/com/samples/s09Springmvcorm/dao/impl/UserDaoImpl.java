package com.samples.s09Springmvcorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.s09Springmvcorm.dao.UserDao;
import com.samples.s09Springmvcorm.entity.User;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernatTemplate;

	@Override
	public int create(User user) {
		return (int) hibernatTemplate.save(user);
	}

	@Override
	public List<User> findUsers() {
		return hibernatTemplate.loadAll(User.class);
	}
}
