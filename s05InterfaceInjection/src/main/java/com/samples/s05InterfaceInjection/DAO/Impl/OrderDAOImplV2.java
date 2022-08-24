package com.samples.s05InterfaceInjection.DAO.Impl;

import org.springframework.stereotype.Component;

import com.samples.s05InterfaceInjection.DAO.OrderDAO;

@Component("daov2")
public class OrderDAOImplV2 implements OrderDAO{

	@Override
	public void createOrder() {
			System.out.println("Inside OrderDAOImplV2.createOrder() method...");
	}

}
