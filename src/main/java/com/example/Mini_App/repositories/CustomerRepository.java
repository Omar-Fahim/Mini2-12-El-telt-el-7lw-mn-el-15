package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {


    @Query("SELECT c FROM Customer c WHERE c.email LIKE %:domain")
    List<Customer> findByEmailDomain(@Param("domain") String domain);


    @Query("SELECT c FROM Customer c WHERE c.phoneNumber LIKE CONCAT(:prefix, '%')")
    List<Customer> findByPhoneNumberPrefix(@Param("prefix") String prefix);
    
}
