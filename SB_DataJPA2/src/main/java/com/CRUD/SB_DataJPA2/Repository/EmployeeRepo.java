package com.CRUD.SB_DataJPA2.Repository;

import com.CRUD.SB_DataJPA2.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
