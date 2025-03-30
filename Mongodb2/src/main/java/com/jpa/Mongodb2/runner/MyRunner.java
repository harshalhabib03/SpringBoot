package com.jpa.Mongodb2.runner;

import com.jpa.Mongodb2.model.Employee;
import com.jpa.Mongodb2.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmpRepo repo;
    @Override
    public void run(String... args) throws Exception {
        repo.save(new Employee(101, "Rahul", 45000.00));
    }
}
