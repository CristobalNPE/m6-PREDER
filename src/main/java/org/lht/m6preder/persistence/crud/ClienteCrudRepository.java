package org.lht.m6preder.persistence.crud;

import org.lht.m6preder.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Long> {
}
