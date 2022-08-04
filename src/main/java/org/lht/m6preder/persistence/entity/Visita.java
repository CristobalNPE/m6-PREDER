package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Visita {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVisita;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_cliente")
  @ToString.Exclude
  private Cliente clienteVisitado;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_profesional", insertable = false, updatable = false)
  @ToString.Exclude
  private Profesional profesionalQueVisita;

  private Date dia;
  private Time hora;
  private String lugar;
  private String comentario;

}
