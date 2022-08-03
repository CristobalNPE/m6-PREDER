package org.lht.m6preder.persistence.mapper.repository;

import org.lht.m6preder.domain.dto.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceRepository {
  List<Attendance> findAll();

  Optional<Attendance> findById(Long attendanceId);

  Attendance save(Attendance attendance);

  void delete(Long attendanceId);
}
