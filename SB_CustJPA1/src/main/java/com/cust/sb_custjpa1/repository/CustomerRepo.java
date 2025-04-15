package com.cust.sb_custjpa1.repository;

import com.cust.sb_custjpa1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    public abstract List<Customer> findByCustNameLike(String pattern);

}
