package com.sb.webapi;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class userController {
    @GetMapping("/")
    public String getDetails(){
        return "Getting Details";
    }
    @GetMapping("/read")
    public Map<String, String> empDetails(){
        HashMap<String, String> map = new HashMap<>();
        map.put("eid", "101");
        map.put("ename", "Rahul");
        map.put("esal", "45000");
        return map;
    }

    @PostMapping("/create")
    public Map<String, String> createUser(){
        Map<String, String> m = new HashMap<>();
        m.put("msg", "New user Created");
        return m;
    }

    @PutMapping("/update")
    public String updateEmp(){
        return "Employees are updated";
    }

    @DeleteMapping("/del")
    public String delUser(){
        return "User is deleted";
    }
}
