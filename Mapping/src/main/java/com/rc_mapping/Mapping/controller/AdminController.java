package com.rc_mapping.Mapping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	//localhost:8081/admin/
    @GetMapping("/")
    public String getDetails(){
        System.out.println("inside");
        return "Good Afternoon";
    }
	
	//localhost:8081/admin/users/?uid=101
	@GetMapping("/users/")
	public String getUserId(@RequestParam("uid") Integer uid) {
		System.out.println("Test Case id");
		return "User Id: "+ uid;
	}
	
	
	//localhost:8081/admin/more/?uid=201&uname=rahul&loc=bng
	@GetMapping("/more/")
	public String getUserDetails(@RequestParam("uid") Integer uid, 
								 @RequestParam("uname") String name, 
								 @RequestParam("loc") String loc) {
		System.out.println("Test Case Details");
		return "User Id: "+uid+" Name: "+name+" Loc: "+loc;
	}
	
	
	
	//localhost:8081/admin
	@GetMapping("/{eid}/{ename}/{esal}")
	public String getEmployeeDetails(@PathVariable Integer eid,
									 @PathVariable String ename, 
									 @PathVariable Double esal) {
		Double esalary = Double.valueOf(esal);
		return "Employee Id: "+eid+", Employee Name: "+ename+", Employee salary: "+esalary;
	}
	
	//localhost:8081/admin/users/name/?uname=Rahul
	@GetMapping("/users/name/")
	public String getUserName(@RequestParam("uname") String uname) {
		System.out.println("Test Case name");
		return "User Name: "+ uname;
	}
	
	
	//here, in requestheader we should pass key and values in postman or in browser	
	
	//localhost:8081/admin/usertoken
	@PostMapping("/usertoken")
	public String getToken(@RequestHeader String token, @RequestHeader String pincode) {
		System.out.println("Got Token");
		return "JWT Token value: "+ token+ "pincode: "+pincode;
	}
	
	@PostMapping("/login")
	public String login(@RequestBody String mydata) {
		return mydata;
	}
	
}
