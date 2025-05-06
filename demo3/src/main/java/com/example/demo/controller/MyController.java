package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/crm")
@RestController
public class MyController {
	
	@GetMapping("/read")
	public String readData() {
		return "Hello";
	}
	
	@GetMapping("/set{eid}")
	public String setId(@PathVariable Integer rid) {
		return "Hi"+rid;
	}
	
}
