package org.lht.m6preder.persistence.entity;


import lombok.*;

import javax.persistence.*;



@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "capa")
public class Capacitacion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_capa")
  private int idCapacitacion;

  @Column(name = "rut_cliente")
  private int rutCliente;
  @Column(name = "dia")
  private String dia;
  @Column(name = "hora")
  private String hora;
  @Column(name = "lugar")
  private String lugar;
  @Column(name = "duracion")
  private int duracion;

  @Column(name = "cant_asistentes")
  private int cantidadAsistentes;

}
