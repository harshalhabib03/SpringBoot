package com.psa.mysqlsboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    DatabaseDemo demo;
    @Override
    public void run(String... args) throws Exception {
        //demo.createTable();
        demo.insertData();
        //List emps = demo.getData();
        //emps.stream().forEach(emp -> System.out.println(emp));
        //List emps = Collections.singletonList(demo.noofemp());

    }
}
