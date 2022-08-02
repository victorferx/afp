package com.nttdata.afp.withdrawal.infrastructure.data.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio de afpCustomer.
 */
public interface IafpCustomerRepository {
  List<AfpCustomerDto> findAll();

  Optional<AfpCustomerDto> findById(Long id);

  AfpCustomerDto findByIdentityCard(String identityCard);

  AfpCustomerDto create(AfpCustomerDto afpCustomerDto);

  void update(Long id, AfpCustomerDto afpCustomerDto);

  void deleteById(Long id);
}
