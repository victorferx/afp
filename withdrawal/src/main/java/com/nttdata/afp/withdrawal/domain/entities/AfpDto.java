package com.nttdata.afp.withdrawal.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad Dto de Afp.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfpDto {

  @JsonProperty("afpId")
  private Long id;
  @NotNull(message = "Debe escribir el nombre de la AFP.")
  @NotBlank(message = "Debe escribir el nombre de la AFP.")
  private String name;
}
