package com.nttdata.afp.withdrawal.domain.services;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import com.nttdata.afp.withdrawal.domain.interfaces.IrequestWithdrawalService;
import com.nttdata.afp.withdrawal.infrastructure.data.repository.RequestWithdrawalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio de RequestWithdrawal.
 */
@Service
public class RequestWithdrawalService implements IrequestWithdrawalService {

  @Autowired
  private RequestWithdrawalRepository requestWithdrawalRepository;

  @Override
  public List<RequestWithdrawalDto> findAll() {
    return requestWithdrawalRepository.findAll();
  }

  @Override
  public Optional<RequestWithdrawalDto> findById(Long id) {
    return requestWithdrawalRepository.findById(id);
  }

  @Override
  public RequestWithdrawalDto create(RequestWithdrawalDto requestWithdrawalDto) {
    return requestWithdrawalRepository.create(requestWithdrawalDto);
  }

  @Override
  public void update(Long id, RequestWithdrawalDto requestWithdrawalDto) {
    requestWithdrawalRepository.update(id, requestWithdrawalDto);
  }

  @Override
  public void deleteById(Long id) {
    requestWithdrawalRepository.deleteById(id);
  }
}
