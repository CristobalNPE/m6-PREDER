package org.lht.m6preder.domain.dto;

import lombok.Data;

import org.lht.m6preder.persistence.entity.Cliente;
import org.lht.m6preder.persistence.entity.Profesional;

import java.sql.Date;
import java.sql.Time;

@Data
public class Inspection {

  private Long inspectionId;

  private Cliente inspectedCustomer;
  private Profesional inspectorProfessional;
  private Date day;
  private Time time;
  private String place;
  private String comment;
}
