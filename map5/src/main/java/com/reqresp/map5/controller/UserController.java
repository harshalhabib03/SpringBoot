package com.reqresp.map5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //localhost:8081/user/strType
    @GetMapping("/strType")
    public String stringTypeResponse(){
        return "String Data as Response";
    }

    //localhost:8081/user/classType
    @GetMapping("/classType")
    public User classTypeResponse(){
        System.out.println("Class Data as Response");
        return new User(101, "Rahul", "Bng");
    }

    //localhost:8081/user/collType
    @GetMapping("/collType")
    public List<User> CollectionTypeResponse(){
        List<User> list = Arrays.asList(new User(101, "Rahul", "bng"),
                                        new User(102, "Sonia", "hyd"));
        return list;
    }
}
