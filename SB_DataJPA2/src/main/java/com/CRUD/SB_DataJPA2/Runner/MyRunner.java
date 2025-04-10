package com.CRUD.SB_DataJPA2.Runner;

import com.CRUD.SB_DataJPA2.Model.Employee;
import com.CRUD.SB_DataJPA2.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepo repo;

    @Override
    public void run(String... args) throws Exception {

        //Insert Data into database table -save()
        /*
        repo.save(new Employee("Rahul", 45000.45));
        repo.save(new Employee("Kabir", 48000.45));
        repo.save(new Employee("Sonali", 55000.45));
        System.out.println("Data Inserted");
        */

        //fetch employee record by id
        /*Optional<Employee> obj = repo.findById(2);    //Optional class is used to avoid NullPointerException
        if(obj.isPresent()){
            System.out.println(obj.get());
        }
        else {
            System.out.println("Employee not found");
        }
        */

        //to fetch all data
        //repo.findAll().forEach(e -> System.out.println(e));
        //repo.findAll().forEach(System.out::println);

        //to delete by id
        //repo.deleteById(1);
        //System.out.println("Given id Data is Deleted");

        //to delete all data in table
        //repo.deleteAll();
        //System.out.println("All Data Deleted");

        //to delete all in data at a time
        //repo.deleteAllInBatch();
        //System.out.println("All Data Deleted Completely");
    }
}
