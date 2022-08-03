package org.lht.m6preder.persistence.mapper.repository;

import org.lht.m6preder.domain.dto.Checklist;

import java.util.List;
import java.util.Optional;

public interface ChecklistRepository {
  List<Checklist> findAll();

  Optional<Checklist> findById(Long checklistId);

  Checklist save(Checklist checklist);

  void delete(Long checklistId);
}
