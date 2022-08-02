package com.nttdata.afp.withdrawal.domain.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio de customer.
 */
public interface IcustomerService {
  List<CustomerDto> findAll();

  Optional<CustomerDto> findById(Long id);

  CustomerDto findByIdentityCard(String identityCard);

  CustomerDto create(CustomerDto customerDto);

  void update(Long id, CustomerDto customerDto);

  void deleteById(Long id);
}
