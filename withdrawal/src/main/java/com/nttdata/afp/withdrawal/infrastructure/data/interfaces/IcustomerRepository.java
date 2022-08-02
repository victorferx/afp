package com.nttdata.afp.withdrawal.infrastructure.data.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio de customer.
 */
public interface IcustomerRepository {
  List<CustomerDto> findAll();

  Optional<CustomerDto> findById(Long id);

  CustomerDto findByIdentityCard(String identityCard);

  CustomerDto create(CustomerDto customerDto);

  void update(Long id, CustomerDto customerDto);

  void deleteById(Long id);
}
