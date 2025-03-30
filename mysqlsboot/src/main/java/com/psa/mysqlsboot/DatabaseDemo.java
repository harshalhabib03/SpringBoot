package com.psa.mysqlsboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseDemo implements Database{
        @Autowired
        JdbcTemplate jt;
        @Override
        public boolean createTable() {
            String sql_st = "create table emp(eid int PRIMARY KEY, ename VARCHAR(32), esal int);";
            jt.execute(sql_st);
            return true;
        }

        @Override
        public void insertData() {
            String sql_st = "insert into emp values(102, 'sonia', 48000);";
            jt.update(sql_st);
        }

    @Override
    public List getData() {
        return jt.queryForList("select * from emp;");
    }

    @Override
    public int noofemp() {
        String sql_st ="select count(eid) from emp;";
        return jt.queryForObject(sql_st,Integer.class);
    }
}
