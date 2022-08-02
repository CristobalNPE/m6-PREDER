package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Asistencia {

  @EmbeddedId
  private AsistenciaPK asistenciaId;

  @ManyToOne
  @MapsId("idAsistente")
  private Asistente asistente;

  @ManyToOne
  @MapsId("idCapacitacion")
  private Capacitacion capacitacion;

}
