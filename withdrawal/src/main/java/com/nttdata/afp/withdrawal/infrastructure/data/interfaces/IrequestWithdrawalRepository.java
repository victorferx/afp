package com.nttdata.afp.withdrawal.infrastructure.data.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio de requestWithdrawal.
 */
public interface IrequestWithdrawalRepository {
  List<RequestWithdrawalDto> findAll();

  Optional<RequestWithdrawalDto> findById(Long id);

  RequestWithdrawalDto create(RequestWithdrawalDto requestWithdrawalDto);

  void update(Long id, RequestWithdrawalDto requestWithdrawalDto);

  void deleteById(Long id);
}
