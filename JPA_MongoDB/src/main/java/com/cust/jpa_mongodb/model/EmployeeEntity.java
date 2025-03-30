package com.cust.jpa_mongodb.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(collection = "employees")
public class EmployeeEntity {

    @org.springframework.data.annotation.Id
    private Integer empId;
    private String empName;
    private String empLoc;
    private Double empSal;

    public EmployeeEntity(Integer empId) {
        this.empId = empId;
    }

    public EmployeeEntity(String empName, String empLoc, Double empSal) {
        this.empName = empName;
        this.empLoc = empLoc;
        this.empSal = empSal;
    }

    public EmployeeEntity(Integer empId, String empName, String empLoc, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empLoc = empLoc;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLoc() {
        return empLoc;
    }

    public void setEmpLoc(String empLoc) {
        this.empLoc = empLoc;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLoc='" + empLoc + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
