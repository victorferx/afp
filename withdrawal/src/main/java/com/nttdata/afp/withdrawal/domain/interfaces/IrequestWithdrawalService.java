package com.nttdata.afp.withdrawal.domain.interfaces;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio de requestWithdrawal.
 */
public interface IrequestWithdrawalService {
  List<RequestWithdrawalDto> findAll();

  Optional<RequestWithdrawalDto> findById(Long id);

  RequestWithdrawalDto create(RequestWithdrawalDto requestWithdrawalDto);

  void update(Long id, RequestWithdrawalDto requestWithdrawalDto);

  void deleteById(Long id);
}
