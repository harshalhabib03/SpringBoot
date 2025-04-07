package com.psa.SB_DataJPA1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer proId;
    private String proName;
    private Double proPrice;

    //Default Constructor
    public Product() {
        super();
    }

    //Id Constructor
    public Product(Integer proId) {
        this.proId = proId;
    }

    //Parameterized Constructor without id
    public Product(String proName, Double proPrice) {
        this.proName = proName;
        this.proPrice = proPrice;
    }

    //Parameterized Constructor with id
    public Product(Integer proId, String proName, Double proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }
}

