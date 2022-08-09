package org.lht.m6preder.domain.repository;

import org.lht.m6preder.domain.dto.Inspection;
import org.lht.m6preder.domain.dto.Training;
import org.lht.m6preder.persistence.entity.Visita;

import java.util.List;
import java.util.Optional;

public interface InspectionRepository {

  List<Inspection> findAll();

  Optional<Inspection> findById(Long inspectionId);

  Inspection save(Inspection inspection);

  void delete(Long inspectionId);

  List<Inspection> findAllByProfesionalQueVisita_Usuario_IdUsuario(Long userId);

}
