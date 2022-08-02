package com.nttdata.afp.withdrawal.infrastructure.data.repository;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import com.nttdata.afp.withdrawal.infrastructure.data.crud.RequestWithdrawalCrudRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.RequestWithdrawal;
import com.nttdata.afp.withdrawal.infrastructure.data.interfaces.IrequestWithdrawalRepository;
import com.nttdata.afp.withdrawal.infrastructure.data.mapping.RequestWithdrawalMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de requestWithdrawal.
 */
@Repository
public class RequestWithdrawalRepository implements IrequestWithdrawalRepository {

  @Autowired
  private RequestWithdrawalCrudRepository requestWithdrawalCrudRepository;

  @Autowired
  private RequestWithdrawalMapper requestWithdrawalMapper;

  @Override
  public List<RequestWithdrawalDto> findAll() {
    return requestWithdrawalMapper
            .requestWithdrawalsToRequestWithdrawalDtos(requestWithdrawalCrudRepository
                    .findAll());
  }

  @Override
  public Optional<RequestWithdrawalDto> findById(Long id) {
    return requestWithdrawalCrudRepository.findById(id)
            .map(r -> requestWithdrawalMapper.requestWithdrawalToRequestWithdrawalDto(r));
  }

  @Override
  public RequestWithdrawalDto create(RequestWithdrawalDto requestWithdrawalDto) {
    RequestWithdrawal requestWithdrawal = requestWithdrawalCrudRepository
            .save(requestWithdrawalMapper
                    .requestWithdrawalDtoToRequestWithdrawal(requestWithdrawalDto));
    return requestWithdrawalMapper.requestWithdrawalToRequestWithdrawalDto(requestWithdrawal);
  }

  @Override
  public void update(Long id, RequestWithdrawalDto requestWithdrawalDto) {
    Optional<RequestWithdrawal> requestWithdrawalOptional = requestWithdrawalCrudRepository
            .findById(id);
    if (requestWithdrawalOptional.isPresent()) {
      RequestWithdrawal requestWithdrawal = requestWithdrawalOptional.get();
      requestWithdrawalMapper.update(requestWithdrawal, requestWithdrawalDto);
      requestWithdrawalCrudRepository.save(requestWithdrawal);
    }
  }

  @Override
  public void deleteById(Long id) {
    requestWithdrawalCrudRepository.deleteById(id);
  }
}
