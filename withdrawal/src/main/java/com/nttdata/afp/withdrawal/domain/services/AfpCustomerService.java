package com.nttdata.afp.withdrawal.domain.services;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import com.nttdata.afp.withdrawal.domain.interfaces.IafpCustomerService;
import com.nttdata.afp.withdrawal.infrastructure.data.repository.AfpCustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio de afpCustomer.
 */
@Service
public class AfpCustomerService implements IafpCustomerService {

  @Autowired
  private AfpCustomerRepository afpCustomerRepository;

  @Override
  public List<AfpCustomerDto> findAll() {
    return afpCustomerRepository.findAll();
  }

  @Override
  public Optional<AfpCustomerDto> findById(Long id) {
    return afpCustomerRepository.findById(id);
  }

  @Override
  public AfpCustomerDto findByIdentityCard(String identityCard) {
    return afpCustomerRepository.findByIdentityCard(identityCard);
  }

  @Override
  public AfpCustomerDto create(AfpCustomerDto afpCustomerDto) {
    return afpCustomerRepository.create(afpCustomerDto);
  }

  @Override
  public void update(Long id, AfpCustomerDto afpCustomerDto) {
    afpCustomerRepository.update(id, afpCustomerDto);
  }

  @Override
  public void deleteById(Long id) {
    afpCustomerRepository.deleteById(id);
  }
}
