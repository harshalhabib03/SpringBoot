package com.psa.SB_DataJPA1.Repo;

import com.psa.SB_DataJPA1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    //passing class name Product with primary key type Integer
}
