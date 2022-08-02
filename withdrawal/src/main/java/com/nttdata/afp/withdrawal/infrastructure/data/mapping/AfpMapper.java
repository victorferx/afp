package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Afp;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapper de Afp.
 */
@Mapper(componentModel = "spring")
public interface AfpMapper {
  Afp afpDtoToAfp(AfpDto afpDto);

  AfpDto afpToAfpDto(Afp afp);

  List<AfpDto> afpsToAfpDtos(List<Afp> afps);

  @Mapping(target = "id", ignore = true)
  void update(@MappingTarget Afp afp, AfpDto afpDto);
}
