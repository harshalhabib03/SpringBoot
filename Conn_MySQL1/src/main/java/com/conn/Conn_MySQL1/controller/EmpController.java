package com.conn.Conn_MySQL1.controller;

import com.conn.Conn_MySQL1.model.Employee;
import com.conn.Conn_MySQL1.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class EmpController {
    @Autowired
    IEmpService service;

    //localhost:8081/api/create
    @PostMapping("/create")
    public ResponseEntity<String> createEmpl(@RequestBody Employee emp){
        System.out.println(emp);
        System.out.println("Inside createEmp");
        ResponseEntity<String> resp = null;
        try {
            Integer eid = service.saveEmployee(emp);
            resp = new ResponseEntity<>("New Employee - "+eid+" Created", HttpStatus.OK);
        } catch (Exception e) {
            resp=new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return resp;
    }
}
