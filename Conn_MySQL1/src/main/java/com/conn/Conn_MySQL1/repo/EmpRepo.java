package com.conn.Conn_MySQL1.repo;

import com.conn.Conn_MySQL1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
