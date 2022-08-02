package com.nttdata.afp.withdrawal.infrastructure.data.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio de afp.
 */
public interface IafpRepository {
  List<AfpDto> findAll();

  Optional<AfpDto> findById(Long id);

  AfpDto create(AfpDto afpDto);

  void update(Long id, AfpDto afpDto);

  void deleteById(Long id);
}
