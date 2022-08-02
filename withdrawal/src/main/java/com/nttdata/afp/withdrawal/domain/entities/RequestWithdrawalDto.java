package com.nttdata.afp.withdrawal.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad dto de RequestWithdrawal.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestWithdrawalDto {
  @JsonProperty("requestWithdrawalId")
  private Long id;

  @NotNull(message = "Debe registrar un DNI.")
  @NotBlank(message = "El DNI no puede ser vacio.")
  private String identityCard;

  @DecimalMin("0.00")
  private BigDecimal amount;

  private Long afpId;
}