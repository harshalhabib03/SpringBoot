package com.map.Mapping2.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.map.Mapping2.model.Employee;

@RestController
public class EmpController {
	
	@GetMapping("/showA")
	public String getDetails() {
		return "Good Morning - String Response";
	}
	
	@GetMapping("/showB")
	public Employee getEmployee() {
		return new Employee(101, "Rahul", 45000.45);
	}
	
	@GetMapping("/showC")
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(102, "Sonia", 48000.45),
							 new Employee(103, "Priya", 55000.45),
							 new Employee(104, "Modi", 65000.45)
				);
	}
	
	@GetMapping("/showD")
	public Map<String, Employee> getAllEmployees() {
		Map<String, Employee> emap = new HashMap<>();
			emap.put("emp1", new Employee(105, "VS",50000.55));
			emap.put("emp2", new Employee(106, "Vijay",35000.55));
			emap.put("emp3", new Employee(107, "Arjun",65000.55));
			return emap;
	}
	
	@GetMapping("/showE")
	public ResponseEntity<String> getResponse() {
		ResponseEntity<String> entity = new ResponseEntity<>("Welcome to RE", HttpStatus.OK);
		return entity;
	}
	
	
}
