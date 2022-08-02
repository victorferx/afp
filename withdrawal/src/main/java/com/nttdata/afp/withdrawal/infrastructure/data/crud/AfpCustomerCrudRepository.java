package com.nttdata.afp.withdrawal.infrastructure.data.crud;

import com.nttdata.afp.withdrawal.infrastructure.data.entities.AfpCustomer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio crud para AfpCustomer.
 */
public interface AfpCustomerCrudRepository extends MongoRepository<AfpCustomer, Long> {
  AfpCustomer findByIdentityCard(String identityCard);
}
