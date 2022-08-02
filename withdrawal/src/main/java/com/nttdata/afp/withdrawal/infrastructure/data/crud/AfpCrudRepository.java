package com.nttdata.afp.withdrawal.infrastructure.data.crud;

import com.nttdata.afp.withdrawal.infrastructure.data.entities.Afp;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositorio crud de Afp.
 */
public interface AfpCrudRepository extends MongoRepository<Afp, Long> {
}
