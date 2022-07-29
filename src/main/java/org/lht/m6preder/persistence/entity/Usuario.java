package org.lht.m6preder.persistence.entity;

import lombok.*;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idUsuario;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "fecha_nac")
  private Date fechaNacimiento;

  @Column(name = "run")
  private Integer run;

  private Timestamp updatedAt;

  public Usuario(String nombre, Date fechaNacimiento, Integer run, Timestamp updatedAt) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.run = run;
    this.updatedAt = updatedAt;
  }
}

