package org.lht.m6preder.domain.dto;

import lombok.Data;
import org.lht.m6preder.persistence.entity.EstadoRevision;
import org.lht.m6preder.persistence.entity.Visita;


@Data
public class Checklist {

  private Long checklistId;
  private Visita inspection;
  private EstadoRevision checklistStatus;
  private String details;

}
