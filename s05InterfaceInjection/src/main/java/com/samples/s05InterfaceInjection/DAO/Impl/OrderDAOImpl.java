package com.samples.s05InterfaceInjection.DAO.Impl;

import org.springframework.stereotype.Component;

import com.samples.s05InterfaceInjection.DAO.OrderDAO;

@Component("dao")
public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
			System.out.println("Inside OrderDAOImpl.createOrder() method...");
	}

}
