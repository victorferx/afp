package com.nttdata.afp.withdrawal.infrastructure.data.crud;

import com.nttdata.afp.withdrawal.infrastructure.data.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio crud para Customer.
 */
public interface CustomerCrudRepository extends MongoRepository<Customer, Long> {
  Customer findByIdentityCard(String identityCard);
}
