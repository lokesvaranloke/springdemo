package com.samples.s01springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;
	
	private Patient() {
		System.out.println("Inside Patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for Id field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void methodOne() {
		System.out.println("Inside methodOne");
	}
	
	@PreDestroy
	public void methodTwo() {
		System.out.println("Inside methodTwo");
	}
	
}
