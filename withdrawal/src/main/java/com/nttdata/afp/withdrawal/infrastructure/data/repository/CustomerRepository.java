package com.nttdata.afp.withdrawal.infrastructure.data.repository;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.crud.CustomerCrudRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Customer;
import com.nttdata.afp.withdrawal.infrastructure.data.interfaces.IcustomerRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.mapping.CustomerMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
   * Repositorio de customer.
 */
@Repository
public class CustomerRepository implements IcustomerRepository {

  @Autowired
  private CustomerCrudRepository customerCrudRepository;

  @Autowired
  private CustomerMapper customerMapper;

  @Override
  public List<CustomerDto> findAll() {
    return customerMapper.customersToCustomerDtos(customerCrudRepository.findAll());
  }

  @Override
  public Optional<CustomerDto> findById(Long id) {
    return customerCrudRepository.findById(id)
            .map(c -> customerMapper.customerToCustomerDto(c));
  }

  @Override
  public CustomerDto findByIdentityCard(String identityCard) {
    return customerMapper.customerToCustomerDto(customerCrudRepository
            .findByIdentityCard(identityCard));
  }

  @Override
  public CustomerDto create(CustomerDto customerDto) {
    Customer customer = customerMapper.customerDtoToCustomer(customerDto);
    return customerMapper.customerToCustomerDto(customerCrudRepository.save(customer));
  }

  @Override
  public void update(Long id, CustomerDto customerDto) {
    Optional<Customer> customerOptional = customerCrudRepository.findById(id);
    if (customerOptional.isPresent()) {
      Customer customer = customerOptional.get();
      customerMapper.update(customer, customerDto);
      customerCrudRepository.save(customer);
    }
  }

  @Override
  public void deleteById(Long id) {
    customerCrudRepository.deleteById(id);
  }
}
