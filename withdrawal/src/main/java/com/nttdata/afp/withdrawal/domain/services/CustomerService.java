package com.nttdata.afp.withdrawal.domain.services;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import com.nttdata.afp.withdrawal.domain.interfaces.IcustomerService;
import com.nttdata.afp.withdrawal.infrastructure.data.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio de customer.
 */
@Service
public class CustomerService implements IcustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public List<CustomerDto> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Optional<CustomerDto> findById(Long id) {
    return customerRepository.findById(id);
  }

  @Override
  public CustomerDto findByIdentityCard(String identityCard) {
    return customerRepository.findByIdentityCard(identityCard);
  }

  @Override
  public CustomerDto create(CustomerDto customerDto) {
    return customerRepository.create(customerDto);
  }

  @Override
  public void update(Long id, CustomerDto customerDto) {
    customerRepository.update(id, customerDto);
  }

  @Override
  public void deleteById(Long id) {
    customerRepository.deleteById(id);
  }
}
