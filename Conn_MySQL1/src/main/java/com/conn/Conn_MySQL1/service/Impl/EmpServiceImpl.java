package com.conn.Conn_MySQL1.service.Impl;

import com.conn.Conn_MySQL1.model.Employee;
import com.conn.Conn_MySQL1.repo.EmpRepo;
import com.conn.Conn_MySQL1.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    EmpRepo repo;

    @Override
    public Integer saveEmployee(Employee e) {
        Integer eid = repo.save(e).getEmpId();
        return eid;
    }
}
