package com.example.Mini_App.services;


import com.example.Mini_App.models.Customer;
import com.example.Mini_App.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {


    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No customers found for customer ID: " + id);
        }

        return customer.get();
    }

    public Customer updateCustomer(Long id, Customer customer){
       customer.setId(id);
       return customerRepository.save(customer);

    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

    public List<Customer> findCustomersByEmailDomain(String domain){
        return customerRepository.findByEmailDomain(domain);
    }

    public List<Customer> findCustomersByPhonePrefix(String prefix){
        return customerRepository.findByPhoneNumberPrefix(prefix);
    }




}
