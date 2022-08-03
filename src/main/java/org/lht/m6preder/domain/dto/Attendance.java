package org.lht.m6preder.domain.dto;

import lombok.Data;
import org.lht.m6preder.persistence.entity.Asistente;
import org.lht.m6preder.persistence.entity.Capacitacion;

@Data
public class Attendance {


  private Long attendantId;
  private Long trainingId;

  private Asistente attendant;
  private Capacitacion training;
}
