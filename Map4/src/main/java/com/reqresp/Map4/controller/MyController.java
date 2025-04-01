package com.reqresp.Map4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crm")
public class MyController {
	
	@GetMapping("/{uid}/{uname}/{usal}/")
	public String getPathVar(@PathVariable Integer uid, 
						@PathVariable String uname,
						@PathVariable Integer usal) {
		return "Hello"+uid+uname+usal;
	}
	
	@GetMapping("/")
	public String getRequestParam(@RequestParam(name = "uid") Integer uid,
								  @RequestParam(name = "uname") String uname) {
		return "Hello"+uid+uname;
	}
	
	@GetMapping("/reqpar")
	public String getRequestParams(@RequestParam Integer uid,
								  @RequestParam String uname) {
		return "Hello"+uid+uname;
	}
	
	@PostMapping("/create")
	public String getRequestBody(@RequestBody User user) {
		return "Hello"+user.toString();
	}
}












