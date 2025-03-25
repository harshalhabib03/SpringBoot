package com.task1.Integration.model;

import org.springframework.stereotype.Component;
@Component

public class Emp {
	String name;
	
	Emp(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	
}
