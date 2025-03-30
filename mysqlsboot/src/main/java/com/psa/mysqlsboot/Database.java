package com.psa.mysqlsboot;

import java.util.List;

public interface Database {
    boolean createTable();
    void insertData();
    List getData();
    int noofemp();
}