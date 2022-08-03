package org.lht.m6preder.domain.service;

import org.lht.m6preder.domain.dto.Inspection;
import org.lht.m6preder.domain.repository.InspectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InspectionService {

  private final InspectionRepository repo;

  public InspectionService(InspectionRepository repo) {
    this.repo = repo;
  }

  public List<Inspection> findAll() {
    return repo.findAll();
  }

  public Optional<Inspection> findById(Long inspectionId) {
    return repo.findById(inspectionId);
  }

  public Inspection save(Inspection inspection) {
    return repo.save(inspection);
  }

  public boolean delete(Long inspectionId) {
    return findById(inspectionId)
            .map(visita -> {
              repo.delete(inspectionId);
              return true;
            }).orElse(false);
  }

}
