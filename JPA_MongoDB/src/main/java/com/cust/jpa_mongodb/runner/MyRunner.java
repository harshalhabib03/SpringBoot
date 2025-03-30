package com.cust.jpa_mongodb.runner;

import com.cust.jpa_mongodb.model.EmployeeEntity;
import com.cust.jpa_mongodb.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmpRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new EmployeeEntity(101,"Rahul","Delhi", 45000.00));
        //repo.save(new EmployeeEntity(102,"Sonia","Mumbai", 48000.00));
        //repo.save(new EmployeeEntity(103,"Priya","BNG", 55000.00));
        //System.out.println("Data Inserted");


    }
}
