package com.cust.sb_custjpa1.runner;

import com.cust.sb_custjpa1.model.Customer;
import com.cust.sb_custjpa1.repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    CustomerRepo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Customer(101,"Sunil", "Waynad"));
        repo.save(new Customer(102,"Ravi", "Delhi"));
        repo.save(new Customer(103,"Lohith", "Mumbai"));
        repo.save(new Customer(104,"Kabir", "Banglore"));
        System.out.println("Data Inserted");
        //System.out.println("=========================================================");


        //repo.findAll().forEach(System.out::println);

        // select * from customer where cust_name like 's%';
        //repo.findByCustNameLike("S%").forEach(System.out::println);

//        List<Customer> users = repo.findByCustNameLike("S%");
//        for (Customer user : users){
//            System.out.println(user);
//        }


    }
}
