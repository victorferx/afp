package com.nttdata.afp.withdrawal.infrastructure.data.crud;

import com.nttdata.afp.withdrawal.infrastructure.data.entities.RequestWithdrawal;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio crud para RequestWithdrawal.
 */
public interface RequestWithdrawalCrudRepository extends MongoRepository<RequestWithdrawal, Long> {
}
