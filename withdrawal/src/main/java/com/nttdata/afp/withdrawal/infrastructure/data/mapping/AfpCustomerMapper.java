package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.AfpCustomer;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapper de AfpCustomer.
 */
@Mapper(componentModel = "spring")
public interface AfpCustomerMapper {
  AfpCustomer afpCustomerDtoToAfpCustomer(AfpCustomerDto afpCustomerDto);

  AfpCustomerDto afpCustomerToAfpCustomerDto(AfpCustomer afpCustomer);

  List<AfpCustomerDto> afpCustomersToAfpCustomerDtos(List<AfpCustomer> afpCustomers);

  @Mapping(target = "id", ignore = true)
  void update(@MappingTarget AfpCustomer afpCustomer, AfpCustomerDto afpCustomerDto);
}
