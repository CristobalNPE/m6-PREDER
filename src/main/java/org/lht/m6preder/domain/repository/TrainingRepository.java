package org.lht.m6preder.domain.repository;

import org.lht.m6preder.domain.dto.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingRepository {

  List<Training> findAll();

  Optional<Training> findById(Long trainingId);

  Training save(Training trainingId);

  void delete(Long trainingId);

}
