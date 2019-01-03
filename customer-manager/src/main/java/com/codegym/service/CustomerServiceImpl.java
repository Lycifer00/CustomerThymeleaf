package com.codegym.service;

import com.codegym.model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.codegym.repository.CustomerRepositoryImpl.customers;


public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> findAll(){
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer){

        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id){
        return customers.get(id);
    }

    @Override
    public  void update(int id, Customer customer){
        customers.put(id, customer);

    }

    @Override
    public void remove(int id){
        customers.remove(id);
    }
}
