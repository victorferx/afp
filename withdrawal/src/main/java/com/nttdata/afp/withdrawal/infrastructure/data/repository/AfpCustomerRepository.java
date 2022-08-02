package com.nttdata.afp.withdrawal.infrastructure.data.repository;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.crud.AfpCustomerCrudRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.AfpCustomer;
import com.nttdata.afp.withdrawal.infrastructure.data.interfaces.IafpCustomerRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.mapping.AfpCustomerMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de afpCustomer.
 */
@Repository
public class AfpCustomerRepository implements IafpCustomerRepository {

  @Autowired
  private AfpCustomerCrudRepository afpCustomerCrudRepository;

  @Autowired
  private AfpCustomerMapper afpCustomerMapper;

  @Override
  public List<AfpCustomerDto> findAll() {
    return afpCustomerMapper.afpCustomersToAfpCustomerDtos(afpCustomerCrudRepository.findAll());
  }

  @Override
  public Optional<AfpCustomerDto> findById(Long id) {
    return afpCustomerCrudRepository.findById(id)
            .map(a -> afpCustomerMapper.afpCustomerToAfpCustomerDto(a));
  }

  @Override
  public AfpCustomerDto findByIdentityCard(String identityCard) {
    return afpCustomerMapper.afpCustomerToAfpCustomerDto(afpCustomerCrudRepository
            .findByIdentityCard(identityCard));
  }

  @Override
  public AfpCustomerDto create(AfpCustomerDto afpCustomerDto) {
    AfpCustomer afpCustomer = afpCustomerMapper.afpCustomerDtoToAfpCustomer(afpCustomerDto);
    return afpCustomerMapper
            .afpCustomerToAfpCustomerDto(afpCustomerCrudRepository.save(afpCustomer));
  }

  @Override
  public void update(Long id, AfpCustomerDto afpCustomerDto) {
    Optional<AfpCustomer> afpCustomerOptional = afpCustomerCrudRepository.findById(id);
    if (afpCustomerOptional.isPresent()) {
      AfpCustomer afpCustomer = afpCustomerOptional.get();
      afpCustomerMapper.update(afpCustomer, afpCustomerDto);
      afpCustomerCrudRepository.save(afpCustomer);
    }
  }

  @Override
  public void deleteById(Long id) {
    afpCustomerCrudRepository.deleteById(id);
  }
}
