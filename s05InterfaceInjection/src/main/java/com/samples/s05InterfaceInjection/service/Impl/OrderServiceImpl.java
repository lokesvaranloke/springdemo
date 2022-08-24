 package com.samples.s05InterfaceInjection.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samples.s05InterfaceInjection.DAO.OrderDAO;
import com.samples.s05InterfaceInjection.service.OrderService;

@Component("orderservice")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("daov2")
	private OrderDAO orderDAO;
	
	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceImp.placeOrder() method...");
		orderDAO.createOrder();
	}

	
}
