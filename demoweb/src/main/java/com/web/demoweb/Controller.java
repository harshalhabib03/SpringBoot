package com.web.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello(){
        return "Hello, Good Afternoon";
    }
    @GetMapping("/Bye")
    public String sayBye(){
        return "Good Bye";
    }
}
