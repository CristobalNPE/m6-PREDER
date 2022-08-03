package org.lht.m6preder.domain.service;

import org.lht.m6preder.domain.dto.Manager;
import org.lht.m6preder.domain.repository.ManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerService {

  private final ManagerRepository repo;

  public ManagerService(ManagerRepository repo) {
    this.repo = repo;
  }

  public List<Manager> findAll() {
    return repo.findAll();
  }

  public Optional<Manager> findById(Long managerId) {
    return repo.findById(managerId);
  }

  public Manager save(Manager manager) {
    return repo.save(manager);
  }

  public boolean delete(Long managerId) {
    return findById(managerId)
            .map(manager -> {
              repo.delete(managerId);
              return true;
            }).orElse(false);
  }

}
