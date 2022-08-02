package com.nttdata.afp.withdrawal.infrastructure.data.repository;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.infrastructure.data.crud.AfpCrudRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Afp;
import com.nttdata.afp.withdrawal.infrastructure.data.interfaces.IafpRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.mapping.AfpMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Afp.
 */
@Repository
public class AfpRepository implements IafpRepository {
  @Autowired
  private AfpCrudRepository afpCrudRepository;

  @Autowired
  private AfpMapper afpMapper;

  @Override
  public List<AfpDto> findAll() {
    List<Afp> afps = afpCrudRepository.findAll();
    return afpMapper.afpsToAfpDtos(afps);
  }

  @Override
  public Optional<AfpDto> findById(Long id) {
    return afpCrudRepository.findById(id)
            .map(a -> afpMapper.afpToAfpDto(a));
  }

  @Override
  public AfpDto create(AfpDto afpDto) {
    Afp afp = afpCrudRepository.save(afpMapper.afpDtoToAfp(afpDto));
    return afpMapper.afpToAfpDto(afp);
  }

  @Override
  public void update(Long id, AfpDto afpDto) {
    Optional<Afp> afpOptional = afpCrudRepository.findById(id);
    if (afpOptional.isPresent()) {
      Afp afp = afpOptional.get();
      afpMapper.update(afp, afpDto);
      afpCrudRepository.save(afp);
    }
  }

  @Override
  public void deleteById(Long id) {
    afpCrudRepository.deleteById(id);
  }
}
