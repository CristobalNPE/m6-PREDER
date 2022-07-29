package org.lht.m6preder.domain.service;

import org.lht.m6preder.persistence.entity.Capacitacion;
import org.lht.m6preder.persistence.repository.CapacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitacionService {

  private final CapacitacionRepository repository;

  public CapacitacionService(CapacitacionRepository repository) {
    this.repository = repository;
  }

  public List<Capacitacion> getAll(){
    return this.repository.getAll();
  }

  public Capacitacion save(Capacitacion capacitacion){
    return this.repository.save(capacitacion);
  }
}
