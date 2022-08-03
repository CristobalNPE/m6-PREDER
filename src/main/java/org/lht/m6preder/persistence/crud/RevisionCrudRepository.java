package org.lht.m6preder.persistence.crud;

import org.lht.m6preder.persistence.entity.Revision;
import org.springframework.data.repository.CrudRepository;

public interface RevisionCrudRepository extends CrudRepository<Revision, Long> {
}
