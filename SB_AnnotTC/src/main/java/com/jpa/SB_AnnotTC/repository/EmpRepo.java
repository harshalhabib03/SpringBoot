package com.jpa.SB_AnnotTC.repository;

import com.jpa.SB_AnnotTC.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

    //select * from emp_table where Emp_name Like 'R%';
    //select * from emp_table where emp_name like '%a';
    public abstract List<Employee> findByEmpNameLike(String str);

    //select * from emp_table where emp_sal >=60000;
    public abstract List<Employee> findByEmpSalGreaterThanEqual(double sal);

    //select * from emp_table where emp_name like '%a' and emp_sal >=60000.00;
    public abstract List<Employee> findByEmpNameAndEmpSalGreaterThan(String str,Double sal);

}
