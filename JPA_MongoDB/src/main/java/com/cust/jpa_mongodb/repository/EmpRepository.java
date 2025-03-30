package com.cust.jpa_mongodb.repository;

import com.cust.jpa_mongodb.model.EmployeeEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface EmpRepository extends MongoRepository<EmployeeEntity, Integer> {
}
