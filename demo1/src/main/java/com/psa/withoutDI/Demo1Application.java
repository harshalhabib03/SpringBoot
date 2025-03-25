package com.psa.withoutDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

//controller
@SpringBootApplication
@Controller
public class Demo1Application {

	private static Service service;

	public Demo1Application(Service service){
		this.service=service;
	}

	public static void handleReq(){
		service.doSomething();
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		Demo1Application.handleReq();
	}
}
