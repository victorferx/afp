package com.nttdata.afp.withdrawal.infrastructure.data.entities;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Eniidad AfpCustomer.
 */
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfpCustomer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 8)
  @NotNull
  private String identityCard;

  @DecimalMin("0.00")
  private BigDecimal amount;

  @Temporal(TemporalType.TIMESTAMP)
  private Calendar depositDate;

  @NotNull
  private String bankAccount;

  @NotNull
  private Long afpId;
}
