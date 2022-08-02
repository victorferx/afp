package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.RequestWithdrawal;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapper de RequestWithdrawal.
 */
@Mapper(componentModel = "spring")
public interface RequestWithdrawalMapper {
  RequestWithdrawal
      requestWithdrawalDtoToRequestWithdrawal(RequestWithdrawalDto requestWithdrawalDto);

  RequestWithdrawalDto
      requestWithdrawalToRequestWithdrawalDto(RequestWithdrawal requestWithdrawal);

  List<RequestWithdrawalDto>
      requestWithdrawalsToRequestWithdrawalDtos(List<RequestWithdrawal> requestWithdrawals);

  @Mapping(target = "id", ignore = true)
  void update(@MappingTarget RequestWithdrawal requestWithdrawal,
              RequestWithdrawalDto requestWithdrawalDto);
}
