package org.lht.m6preder.domain.service;

import org.lht.m6preder.domain.dto.Customer;
import org.lht.m6preder.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

  private final CustomerRepository repo;

  public CustomerService(CustomerRepository repo) {
    this.repo = repo;
  }

  public List<Customer> findAll() {
    return repo.findAll();
  }

  public Optional<Customer> findById(Long customerId) {
    return repo.findById(customerId);
  }

  public Customer save(Customer customer) {
    return repo.save(customer);
  }

  public boolean delete(Long customerId){
    return findById(customerId)
            .map(cliente -> {
              repo.delete(customerId);
              return true;
            }).orElse(false);
  }



}
