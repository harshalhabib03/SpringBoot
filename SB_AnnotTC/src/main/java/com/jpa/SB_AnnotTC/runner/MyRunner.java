package com.jpa.SB_AnnotTC.runner;

import com.jpa.SB_AnnotTC.model.Employee;
import com.jpa.SB_AnnotTC.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmpRepo repo;

    @Override
    public void run(String... args) throws Exception {
        /*
        repo.save(new Employee("Rahul",45000.45));
        repo.save(new Employee("Sonia",55000.55));
        repo.save(new Employee("Priya",65000.65));
        repo.save(new Employee("Modi",75000.75));
        repo.save(new Employee("Rajni",85000.85));
        */

        //repo.findByEmpNameLike("R%").forEach(System.out::println);

        //repo.findByEmpSalGreaterThanEqual(70000.00).forEach(System.out::println);

        //repo.findByEmpNameLike("%a").forEach(System.out::println);

        repo.findByEmpNameAndEmpSalGreaterThan("%a",60000.00).forEach(System.out::println);
    }
}
