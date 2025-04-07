package com.psa.SB_DataJPA1.Runner;

import com.psa.SB_DataJPA1.Model.Product;
import com.psa.SB_DataJPA1.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    ProductRepo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Product("Samsung", 45000.45));
        repo.save(new Product("Nokia", 40000.45));
        System.out.println("Data Inserted");
    }
}
