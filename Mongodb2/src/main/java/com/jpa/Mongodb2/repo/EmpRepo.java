package com.jpa.Mongodb2.repo;

import com.jpa.Mongodb2.model.Employee;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface EmpRepo extends MongoRepository<Employee, Integer> {
}
