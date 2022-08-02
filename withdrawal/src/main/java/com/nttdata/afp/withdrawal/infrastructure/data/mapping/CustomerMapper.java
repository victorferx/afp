package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Customer;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapper de Customer.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {
  Customer customerDtoToCustomer(CustomerDto customerDto);

  CustomerDto customerToCustomerDto(Customer customer);

  List<CustomerDto> customersToCustomerDtos(List<Customer> customers);

  @Mapping(target = "id", ignore = true)
  void update(@MappingTarget Customer customer, CustomerDto customerDto);
}
