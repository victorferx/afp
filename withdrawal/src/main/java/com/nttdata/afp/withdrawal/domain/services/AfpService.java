package com.nttdata.afp.withdrawal.domain.services;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.domain.interfaces.IafpService;
import com.nttdata.afp.withdrawal.infrastructure.data.repository.AfpRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio de Afp.
 */
@Service
public class AfpService implements IafpService {

  @Autowired
  private AfpRepository afpRepository;

  @Override
  public List<AfpDto> findAll() {
    return afpRepository.findAll();
  }

  @Override
  public Optional<AfpDto> findById(Long id) {
    return afpRepository.findById(id);
  }

  @Override
  public AfpDto create(AfpDto afpDto) {
    return afpRepository.create(afpDto);
  }

  @Override
  public void update(Long id, AfpDto afpDto) {
    afpRepository.update(id, afpDto);
  }

  @Override
  public void deleteById(Long id) {
    afpRepository.deleteById(id);
  }
}
