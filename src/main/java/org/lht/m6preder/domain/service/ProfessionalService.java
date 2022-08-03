package org.lht.m6preder.domain.service;

import org.lht.m6preder.domain.dto.Professional;
import org.lht.m6preder.domain.repository.ProfessionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalService {

  private final ProfessionalRepository repo;


  public ProfessionalService(ProfessionalRepository repo) {
    this.repo = repo;
  }

  public List<Professional> findAll() {
    return repo.findAll();
  }

  public Optional<Professional> findById(Long professionalId) {
    return repo.findById(professionalId);
  }

  public Professional save(Professional professional) {
    return repo.save(professional);
  }

  public boolean delete(Long professionalId) {
    return findById(professionalId)
            .map(prof -> {
              repo.delete(professionalId);
              return true;
            }).orElse(false);
  }
}
