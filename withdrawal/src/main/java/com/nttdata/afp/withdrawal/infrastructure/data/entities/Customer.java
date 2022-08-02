package com.nttdata.afp.withdrawal.infrastructure.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad Customer.
 */
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 8)
  @NotNull
  private String identityCard;

  @NotNull
  private String name;

  @NotNull
  private String lastName;

  @NotNull
  private String phoneNumber;

  private String email;

}