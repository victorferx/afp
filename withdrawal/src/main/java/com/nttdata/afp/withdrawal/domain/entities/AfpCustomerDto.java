package com.nttdata.afp.withdrawal.domain.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad dto de AfpCustomer.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfpCustomerDto {
  @JsonProperty("afpCustomerId")
  private Long id;

  @NotNull(message = "Debe registrar un DNI.")
  @NotBlank(message = "El DNI no puede ser vacio.")
  private String identityCard;

  @DecimalMin("0.00")
  private BigDecimal amount;

  @JsonProperty("date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
  private Calendar depositDate;

  @NotBlank(message = "La cuenta no debe ser vacia.")
  private String bankAccount;

  @JsonProperty("afpId")
  @NotNull
  private Long afpId;
}
