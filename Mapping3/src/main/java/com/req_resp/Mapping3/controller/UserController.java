package com.req_resp.Mapping3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/crm")
public class UserController {
    //localhost:8081/crm/101/rahul/45000/
    @GetMapping("/{uid}/{uname}/{usal}/")
    public String getData(@PathVariable Integer uid,
                          @PathVariable String uname,
                          @PathVariable Integer usal){
        System.out.println("test case");
        return "Hello your data is:"+uid+uname+usal;
    }

    @GetMapping("/hello")
    public String getDetails(){
        return "hello";
    }
}
