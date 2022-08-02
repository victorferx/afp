package com.nttdata.afp.withdrawal.domain.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio de afp.
 */
public interface IafpService {
  List<AfpDto> findAll();

  Optional<AfpDto> findById(Long id);

  AfpDto create(AfpDto afpDto);

  void update(Long id, AfpDto afpDto);

  void deleteById(Long id);
}
