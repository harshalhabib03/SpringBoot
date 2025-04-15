package com.cust.sb_custjpa1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "customer_tab")
public class Customer {
    @Id
    private Integer custId;

    private String custName;

    private String custLoc;

    public Customer(){
        super();
    }

    public Customer(Integer custId) {
        this.custId = custId;
    }

    public Customer(String custName, String custLoc) {
        this.custName = custName;
        this.custLoc = custLoc;
    }

    public Customer(Integer custId, String custName, String custLoc) {
        this.custId = custId;
        this.custName = custName;
        this.custLoc = custLoc;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustLoc() {
        return custLoc;
    }

    public void setCustLoc(String custLoc) {
        this.custLoc = custLoc;
    }

    @Override
    public String toString() {
        return "Customer [ " +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custLoc='" + custLoc + '\'' +
                " ]";
    }
}
