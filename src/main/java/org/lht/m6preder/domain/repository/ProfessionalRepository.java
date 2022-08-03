package org.lht.m6preder.domain.repository;

import org.lht.m6preder.domain.dto.Professional;

import java.util.List;
import java.util.Optional;

public interface ProfessionalRepository {

  List<Professional> findAll();

  Optional<Professional> findById(Long professionalId);

  Professional save(Professional professional);

  void delete(Long professionalId);

}
