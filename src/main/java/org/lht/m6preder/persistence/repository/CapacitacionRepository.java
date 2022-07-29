package org.lht.m6preder.persistence.repository;

import org.lht.m6preder.persistence.crud.CapacitacionCrudRepository;
import org.lht.m6preder.persistence.entity.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CapacitacionRepository {
  private final CapacitacionCrudRepository crudRepository;

  public CapacitacionRepository(CapacitacionCrudRepository crudRepository) {
    this.crudRepository = crudRepository;
  }

  public List<Capacitacion> getAll(){
    return (List<Capacitacion>) this.crudRepository.findAll();
  }

  public Capacitacion save(Capacitacion capacitacion){
    return this.crudRepository.save(capacitacion);
  }
}
