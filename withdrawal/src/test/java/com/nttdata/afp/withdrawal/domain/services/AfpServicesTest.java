package com.nttdata.afp.withdrawal.domain.services;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.infrastructure.data.repository.AfpRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

public class AfpServicesTest {
  @Mock
  AfpRepository afpRepository;
  @InjectMocks
  AfpService afpService;

  @BeforeEach
  void inicializar() {
    afpService = new AfpService();
  }

  @Test
  void findAll() {
    // Given
    List<AfpDto> afpDtos = new ArrayList<AfpDto>();
    afpDtos.add(new AfpDto(Long.valueOf(1), "Integra"));
    afpDtos.add(new AfpDto(Long.valueOf(2), "Pro futuro"));
    given(afpRepository.findAll()).willReturn(afpDtos);

    //When
    List<AfpDto> afpDtoFindAll =  afpService.findAll();

    //Then
    then(afpRepository).should().findAll();
    assertThat(afpDtoFindAll).isNotNull();
  }
}
